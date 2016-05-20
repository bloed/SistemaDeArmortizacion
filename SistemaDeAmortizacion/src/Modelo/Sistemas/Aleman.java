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
public class Aleman extends SistemaAmortizacion{

  public Aleman(DTOSistemaAmortizacion dto) throws Exception {
    super(dto);
  }
  
  
  @Override
  protected double calcularCuota(int periodo) {
    if(periodo == 0)
      return (this.deuda.getSaldo()/this.plazo)+(this.interes*this.deuda.getSaldo());
    return cuotas[periodo-1].getPago() - this.interes*this.deuda.getSaldo()/this.plazo;
  }

  @Override
  protected double calcularAmortizacionCuota(int periodo) {
    return this.deuda.getSaldo()/this.plazo;
  }

  @Override
  protected double calcularInteresesCuota(int periodo) {
    return (this.plazo - periodo)*(this.deuda.getSaldo()*this.interes)/this.plazo;
  }
  
}
