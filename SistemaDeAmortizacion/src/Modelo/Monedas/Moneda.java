/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Monedas;

import DTOs.DTOMoneda;
import java.text.DecimalFormat;

/**
 *
 * @author fm010
 */
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
