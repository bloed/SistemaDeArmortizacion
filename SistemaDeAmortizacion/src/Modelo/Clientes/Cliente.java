/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clientes;

/**
 *
 * @author fm010
 */
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
