/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import Modelo.Clientes.Cliente;
import Modelo.Clientes.Persona;
import Modelo.Cuotas.Cuota;
import Modelo.Monedas.Moneda;

/**
 *
 * @author fm010
 */
public class DTOSistemaAmortizacion {
  protected int plazo;
  protected double interes;
  protected String tipoSistema;
  protected Cliente cliente;
  protected Cuota[] cuotas;
  protected Moneda deuda;


  public DTOSistemaAmortizacion(String nombreCliente, int plazo, double interes, Moneda deuda, String tipoSistema) {
    this.cliente = new Persona(new DTOCliente(nombreCliente));
    this.plazo = plazo;
    this.interes = interes;
    this.deuda = deuda;
    this.tipoSistema = tipoSistema;
  }

  public int getPlazo() {
    return plazo;
  }

  public double getInteres() {
    return interes;
  }

  public String getTipoSistema() {
    return tipoSistema;
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
