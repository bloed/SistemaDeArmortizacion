package Modelo.Sistemas;

import DTOs.DTOSistemaAmortizacion;


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
