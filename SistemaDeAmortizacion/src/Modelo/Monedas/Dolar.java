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
public class Dolar extends Moneda{
  public Dolar(double monto) {
    super(new DTOMoneda(monto, Constantes.DOLAR));
  }
}
