
package Modelo.Monedas;
import DTOs.DTOMoneda;
import Datos.Constantes;


public class Dolar extends Moneda{
  public Dolar(DTOMoneda dto) {
    super(new DTOMoneda(dto.getSaldo(), Constantes.DOLAR));
  }

  @Override
  public Moneda toColon(double tipoCambio) {
    return new Colon(new DTOMoneda(this.saldo/tipoCambio));
  }
}

