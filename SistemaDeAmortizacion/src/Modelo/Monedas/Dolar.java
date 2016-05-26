
package Modelo.Monedas;
import DTOs.DTOMoneda;
import Datos.Constantes;


public class Dolar extends Moneda{
  public Dolar(DTOMoneda dto) {
    super(new DTOMoneda(dto.getSaldo(), Constantes.DOLAR));
  }
}
