package Modelo.Sistemas;

import DTOs.DTOSistemaAmortizacion;


public class Americano extends SistemaAmortizacion{

  public Americano(DTOSistemaAmortizacion dto) throws Exception {
    super(dto);
  }

  @Override
  protected double calcularCuota(int periodo) {
    if (periodo == this.plazo-1)
      return this.deuda.getSaldo() * (1 + this.interes);
    return this.interes * this.deuda.getSaldo();
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
