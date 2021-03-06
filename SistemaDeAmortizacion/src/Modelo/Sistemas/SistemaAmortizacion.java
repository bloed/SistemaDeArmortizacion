package Modelo.Sistemas;

import Adaptador.AdaptadorChuky;
import Adaptador.BCCRCambioDolar;
import DTOs.DTOCuota;
import DTOs.DTOModeloVista;
import DTOs.DTOSistemaAmortizacion;
import Modelo.Clientes.Cliente;
import Modelo.Cuotas.Cuota;
import Modelo.Monedas.Moneda;
import Observer.IObserver;
import Observer.ISubject;
import java.util.ArrayList;

public abstract class SistemaAmortizacion implements ISubject{
  protected int plazo;
  protected double interes;
  protected String tipoSistema;
  protected Cliente cliente;
  protected ArrayList<IObserver> observers;
  protected Cuota[] cuotas;
  protected Moneda deuda;
  protected double tipoCambio;
  protected String fechaChucky;

  public SistemaAmortizacion(DTOSistemaAmortizacion dto) throws Exception {
    this.plazo = dto.getPlazo();
    this.interes = dto.getInteres();
    this.tipoSistema = dto.getTipoSistema();
    this.cliente = dto.getCliente();
    this.observers = new ArrayList<>();
    this.cuotas = new Cuota[plazo];
    this.tipoCambio = Double.parseDouble(new BCCRCambioDolar().realizarPeticion());
    this.deuda = dto.getDeuda().toColon(tipoCambio);
    this.fechaChucky = new AdaptadorChuky().realizarPeticion();
  }
  
  protected abstract double calcularCuota(int periodo);
  protected abstract double calcularAmortizacionCuota(int periodo);
  protected abstract double calcularInteresesCuota(int periodo);
  
  
  protected double calcularDeudaCuota(int periodo) {
    return cuotas[periodo-1].getDeuda() - cuotas[periodo-1].getAmortizacion();
  }
  
 public void calcularCuotas() {
    double deudaActual;
    double cuota;
    double intereses;
    double amortizacion;
    for (int periodo = 0; periodo < this.plazo; periodo++) {
      intereses = calcularInteresesCuota(periodo);
      amortizacion = calcularAmortizacionCuota(periodo);
      cuota = calcularCuota(periodo);
      if(periodo==0)
        deudaActual = this.deuda.getSaldo();
      else
        deudaActual = calcularDeudaCuota(periodo);
      cuotas[periodo] = new Cuota(new DTOCuota(deudaActual, amortizacion, cuota, intereses));
    }
    notifyObservers();
  }
 
  public DTOModeloVista obtenerDTO() {
    return new DTOModeloVista(cliente.getNombre(), deuda, plazo, interes, 
            tipoSistema, cuotas, tipoCambio, fechaChucky);
  }

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
