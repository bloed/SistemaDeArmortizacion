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
public class DTOMoneda {
  private double saldo;
  private String tipo;

  public DTOMoneda(double saldo, String tipo) {
    this.saldo = saldo;
    this.tipo = tipo;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getTipo() {
    return tipo;
  }
}
