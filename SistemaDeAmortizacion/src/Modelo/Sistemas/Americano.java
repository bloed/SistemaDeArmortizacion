/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Sistemas;

import DTOs.DTOSistemaAmortizacion;

/**
 *
 * @author fm010
 */
public class Americano extends SistemaAmortizacion{

  public Americano(DTOSistemaAmortizacion dto) throws Exception {
    super(dto);
  }

  @Override
  protected double calcularCuota(int periodo) {
    return this.deuda.getSaldo() * (1 + this.interes);
  }

  @Override
  protected double calcularAmortizacionCuota(int periodo) {
    if(periodo == this.plazo-1)
      return this.deuda.getSaldo();
    return 0;
  }

  @Override
  protected double calcularInteresesCuota(int periodo) {
    return this.interes * this.deuda.getSaldo();
  }
  
}
