/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Sistemas;

import DTOs.DTOSistemaAmortizacion;
import Modelo.Cuotas.Cuota;
import Observer.IObserver;

/**
 *
 * @author fm010
 */
public class Aleman extends SistemaAmortizacion{

  public Aleman(DTOSistemaAmortizacion dto) {
    super(dto);
  }

  @Override
  protected void calcularCuotas() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  protected void calcularCuota(Cuota anterior) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
