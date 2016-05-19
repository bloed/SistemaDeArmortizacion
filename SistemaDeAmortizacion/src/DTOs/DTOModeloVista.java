package DTOs;

import Modelo.Cuotas.Cuota;


public class DTOModeloVista {
    private String nombreCliente;
    private double montoPrestamo;
    private int plazoPrestamo;
    private double interes;
    private String tipoSistema;
    private Cuota[] cuotas;

  public DTOModeloVista(String nombreCliente, double montoPrestamo, 
          int plazoPrestamo, double interes, String tipoSistema, 
          Cuota[] cuotas) {
    this.nombreCliente = nombreCliente;
    this.montoPrestamo = montoPrestamo;
    this.plazoPrestamo = plazoPrestamo;
    this.interes = interes;
    this.tipoSistema = tipoSistema;
    this.cuotas = cuotas;
  }

  public String getNombreCliente() {
    return nombreCliente;
  }

  public double getMontoPrestamo() {
    return montoPrestamo;
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
