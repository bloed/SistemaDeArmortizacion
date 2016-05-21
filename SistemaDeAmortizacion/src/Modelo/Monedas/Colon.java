package Modelo.Monedas;

import DTOs.DTOMoneda;
import Datos.Constantes;


public class Colon extends Moneda{

  public Colon(double monto) {
    super(new DTOMoneda(monto, Constantes.COLON));
  }
  
}
