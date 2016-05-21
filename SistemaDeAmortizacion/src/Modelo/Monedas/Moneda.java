package Modelo.Monedas;

import DTOs.DTOMoneda;
import java.text.DecimalFormat;

public abstract class Moneda {
  protected double saldo;
  protected String tipo;
  
  public Moneda(DTOMoneda dto) {
    this.saldo = dto.getSaldo();
    this.tipo = dto.getTipo();
  }

  public double getSaldo() {
    return saldo;
  }

  public String getTipo() {
    return tipo;
  }
  
  @Override
  public String toString(){
    return new DecimalFormat("#.##").format(this.saldo) + " " + tipo;
  }
}
