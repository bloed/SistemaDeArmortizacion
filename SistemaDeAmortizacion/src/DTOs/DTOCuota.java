/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author fm010
 */
public class DTOCuota {
  protected double amortizacion;
  protected double pago;
  protected double interes;

  public DTOCuota(double amortizacion, double pago, double interes) {
    this.amortizacion = amortizacion;
    this.pago = pago;
    this.interes = interes;
  }

  public double getAmortizacion() {
    return amortizacion;
  }

  public double getPago() {
    return pago;
  }

  public double getInteres() {
    return interes;
  }
  
  
}
