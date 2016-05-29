package Modelo.Cuotas;

import DTOs.DTOCuota;


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

  public DTOCuota getDTO() {
    return new DTOCuota(deuda, amortizacion, pago, interes);
  }
  
  @Override
  public String toString(){
      return "   Deuda inicial " + deuda + "\n   Intereses: " + interes + 
              "\n   Amortización: " + amortizacion + "\n   Cuota: " + pago;
  }
  public static String getCuotas(Cuota[] cuotas){
    String resultado = "";
    for (int periodo = 0; periodo < cuotas.length; periodo++) {
        resultado += "\nPeriodo " + String.valueOf(periodo+1) + "\n" +cuotas[periodo].toString();
    }
    resultado += "\n Intereses totales : " + getTotalInteres(cuotas);
    resultado += "\n Armotización total : " + getTotalAmortizacion(cuotas);
    resultado += "\n Cuotas totales : " + getTotalPagos(cuotas);
    return resultado;
  }
  
  private static String getTotalInteres(Cuota[] cuotas){
      Double resultado = 0.0;  
      for (Cuota cuota : cuotas) {
          resultado += cuota.interes;
      }
      return resultado.toString();
  }
  private static String getTotalAmortizacion(Cuota[] cuotas){
      Double resultado = 0.0;  
      for (Cuota cuota : cuotas) {
          resultado += cuota.amortizacion;
      }
      return resultado.toString();
  }
  private static String getTotalPagos(Cuota[] cuotas){
      Double resultado = 0.0;  
      for (Cuota cuota : cuotas) {
          resultado += cuota.pago;
      }
      return resultado.toString();
  }
  
  
}
