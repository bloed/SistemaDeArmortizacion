/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Sistemas;

import DTOs.DTOSistemaAmortizacion;
import Modelo.Cuotas.Cuota;

/**
 *
 * @author fm010
 */
public class Americano extends SistemaAmortizacion{

  public Americano(DTOSistemaAmortizacion dto) throws Exception {
    super(dto);
  }

  @Override
  protected void calcularCuotas() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  protected double calcularCuota(int periodo) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  protected double calcularAmortizacionCuota(int periodo) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  protected double calcularInteresesCuota(int periodo) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
