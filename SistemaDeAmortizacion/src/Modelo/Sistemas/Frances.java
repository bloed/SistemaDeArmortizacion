/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Sistemas;

import DTOs.DTOSistemaAmortizacion;
import Modelo.Cuotas.Cuota;

/**
 *
 * @author fm010
 */
public class Frances extends SistemaAmortizacion{

  public Frances(DTOSistemaAmortizacion dto) throws Exception {
    super(dto);
  }

  @Override
  protected double calcularCuota(int periodo) {
    return ((this.deuda.getSaldo()*this.interes)/(1-Math.pow((1+this.interes),-plazo)));
  }

  @Override
  protected double calcularAmortizacionCuota(int periodo) {
    return calcularCuota(periodo) - calcularInteresesCuota(periodo);
  }

  @Override
  protected double calcularInteresesCuota(int periodo) {
    if(periodo==0)
      return this.interes * this.deuda.getSaldo();
    return this.interes * (cuotas[periodo-1].getDeuda()-cuotas[periodo-1].getAmortizacion());
  }
  
}
