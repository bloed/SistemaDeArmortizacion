package DTOs;

import Modelo.Cuotas.Cuota;
import Modelo.Monedas.Moneda;


public class DTOModeloVista {
    private String nombreCliente;
    private Moneda deuda;
    private int plazoPrestamo;
    private double interes;
    private String tipoSistema;
    private Cuota[] cuotas;

  public DTOModeloVista(String nombreCliente, Moneda deuda, 
          int plazoPrestamo, double interes, String tipoSistema, 
          Cuota[] cuotas) {
    this.nombreCliente = nombreCliente;
    this.deuda = deuda;
    this.plazoPrestamo = plazoPrestamo;
    this.interes = interes;
    this.tipoSistema = tipoSistema;
    this.cuotas = cuotas;
  }

  public String getNombreCliente() {
    return nombreCliente;
  }

  public Moneda getDeuda() {
    return deuda;
  }

  public int getPlazoPrestamo() {
    return plazoPrestamo;
  }

  public double getInteres() {
    return interes;
  }

  public String getTipoSistema() {
    return tipoSistema;
  }

  public Cuota[] getCuotas() {
    return cuotas;
  }
    
  
}//85737569
