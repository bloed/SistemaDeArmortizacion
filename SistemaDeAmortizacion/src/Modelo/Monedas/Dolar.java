
package Modelo.Monedas;
import DTOs.DTODolar;
import DTOs.DTOMoneda;
import Datos.Constantes;


public class Dolar extends Moneda{
  public Dolar(DTODolar dto) {
    super(new DTOMoneda(dto.getMonto(), Constantes.DOLAR));
  }
}
