
package Modelo.Monedas;
import DTOs.DTOMoneda;
import Datos.Constantes;


public class Dolar extends Moneda{
  public Dolar(double monto) {
    super(new DTOMoneda(monto, Constantes.DOLAR));
  }
}
