package Modelo.Monedas;

import DTOs.DTOColon;
import DTOs.DTOMoneda;
import Datos.Constantes;


public class Colon extends Moneda{

  public Colon(DTOColon dto) {
    super(new DTOMoneda(dto.getMonto(), Constantes.COLON));
  }
  
}
