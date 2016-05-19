/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Monedas;

import DTOs.DTOMoneda;
import Datos.Constantes;

/**
 *
 * @author fm010
 */
public class Colon extends Moneda{

  public Colon(double monto) {
    super(new DTOMoneda(monto, Constantes.COLON));
  }
  
}
