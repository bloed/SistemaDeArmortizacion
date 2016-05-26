package Datos.Bitacora;


import DTOs.DTOBitacora;
import DTOs.DTOModeloVista;


public abstract class Bitacora {
  protected String path;

  public Bitacora(DTOBitacora dto) {
    this.path = dto.getPath();
  }
  
  public abstract void escribir(DTOModeloVista dto);
  
  
}
