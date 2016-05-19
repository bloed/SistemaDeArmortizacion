/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import Modelo.Clientes.Cliente;
import Modelo.Cuotas.Cuota;
import Modelo.Monedas.Moneda;

/**
 *
 * @author fm010
 */
public class DTOSistemaAmortizacion {
  protected int plazo;
  protected double interes;
  protected double monto;
  protected String tipoProducto;
  protected Cliente cliente;
  protected Cuota[] cuotas;
  protected Moneda deuda;


  public DTOSistemaAmortizacion(int plazo, double interes, double monto, String tipoProducto) {
    this.plazo = plazo;
    this.interes = interes;
    this.monto = monto;
    this.tipoProducto = tipoProducto;
  }

  public int getPlazo() {
    return plazo;
  }

  public double getInteres() {
    return interes;
  }

  public double getMonto() {
    return monto;
  }

  public String getTipoProducto() {
    return tipoProducto;
  }
  
  public Cliente getCliente() {
    return cliente;
  }

  public Cuota[] getCuotas() {
    return cuotas;
  }

  public Moneda getDeuda() {
    return deuda;
  }
  
}
