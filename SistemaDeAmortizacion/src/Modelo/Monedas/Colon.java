package Modelo.Monedas;

import DTOs.DTOMoneda;
import Datos.Constantes;


public class Colon extends Moneda{

  public Colon(DTOMoneda dto) {
    super(new DTOMoneda(dto.getSaldo(), Constantes.COLON));
  }

  @Override
  public Moneda toColon(double tipoCambio) {
    return this;
  }
  
}
