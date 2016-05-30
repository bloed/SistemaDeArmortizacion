package Modelo.Sistemas;

import DTOs.DTOSistemaAmortizacion;

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
