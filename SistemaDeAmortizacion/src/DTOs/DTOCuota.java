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
  protected double cuotaPagada;
  protected double interes;
  protected double deuda;

  public DTOCuota(double deuda, double amortizacion, double cuotaPagada, double intereses) {
    this.amortizacion = amortizacion;
    this.cuotaPagada = cuotaPagada;
    this.interes = intereses;
    this.deuda = deuda;
  }

  public double getAmortizacion() {
    return amortizacion;
  }

  public double getPago() {
    return cuotaPagada;
  }

  public double getInteres() {
    return interes;
  }

  public double getDeuda() {
    return this.deuda;
  }
  
  
}
