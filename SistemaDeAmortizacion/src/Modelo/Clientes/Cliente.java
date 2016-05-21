package Modelo.Clientes;


public abstract class Cliente {
  private String nombre;

  public Cliente(String nombre) {
    this.nombre = nombre;
  }
  @Override
  public String toString(){
    return this.nombre;
  }

  public String getNombre() {
    return nombre;
  }
}
