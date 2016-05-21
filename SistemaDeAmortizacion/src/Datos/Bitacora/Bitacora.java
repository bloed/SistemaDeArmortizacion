package Datos.Bitacora;


import DTOs.DTOModeloVista;


public abstract class Bitacora {
  protected String path;

  public Bitacora(String path) {
    this.path = path;
  }
  
  public abstract void escribir(DTOModeloVista dto);
  
  
}
