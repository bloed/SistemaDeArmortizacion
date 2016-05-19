/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Sistemas;

import DTOs.DTOModeloVista;
import DTOs.DTOSistemaAmortizacion;
import Modelo.Clientes.Cliente;
import Modelo.Cuotas.Cuota;
import Modelo.Monedas.Moneda;
import Observer.IObserver;
import Observer.ISubject;
import java.util.ArrayList;

/**
 *
 * @author fm010
 */
public abstract class SistemaAmortizacion implements ISubject{
  protected int plazo;
  protected double interes;
  protected double monto;
  protected String tipoSistema;
  protected Cliente cliente;
  protected ArrayList<IObserver> observers;
  protected Cuota[] cuotas;
  protected Moneda deuda;

  public SistemaAmortizacion(DTOSistemaAmortizacion dto) {
    this.plazo = dto.getPlazo();
    this.interes = dto.getInteres();
    this.monto = dto.getMonto();
    this.tipoSistema = dto.getTipoProducto();
    this.cliente = dto.getCliente();
    this.observers = new ArrayList<>();
    this.cuotas = new Cuota[plazo];
    this.deuda = dto.getDeuda();
    calcularCuotas();
  }
  
  public DTOModeloVista obtenerDTO() {
    return new DTOModeloVista(cliente.getNombre(), monto, plazo, interes, 
            tipoSistema, cuotas);
  }
  
  protected abstract void calcularCuotas();
  protected abstract void calcularCuota(Cuota anterior);

  @Override
  public void attach(IObserver observer) {
    observers.add(observer);
  }

  @Override
  public void detach(IObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (IObserver observer : observers) {
      observer.update(obtenerDTO());
    }
  }
}
