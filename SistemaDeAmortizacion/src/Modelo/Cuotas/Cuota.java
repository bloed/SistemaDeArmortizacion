/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cuotas;

import DTOs.DTOCuota;

/**
 *
 * @author fm010
 */
public class Cuota {
  protected double amortizacion;
  protected double pago;
  protected double interes;
  protected double deuda;

  public Cuota(DTOCuota dto) {
    this.amortizacion = dto.getAmortizacion();
    this.pago = dto.getPago();
    this.interes = dto.getInteres();
    this.deuda = dto.getDeuda();
  }

  public double getPago() {
    return pago;
  }

  public double getAmortizacion() {
    return amortizacion;
  }

  public double getInteres() {
    return interes;
  }

  public double getDeuda() {
    return deuda;
  }
  
  
  
}