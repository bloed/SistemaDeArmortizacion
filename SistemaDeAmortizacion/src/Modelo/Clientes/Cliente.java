package Modelo.Clientes;

import DTOs.DTOCliente;


public abstract class Cliente {
  private String nombre;

  public Cliente(DTOCliente dto) {
    this.nombre = dto.getNombre();
  }
  @Override
  public String toString(){
    return this.nombre;
  }

  public String getNombre() {
    return nombre;
  }
}
