package DTOs;

public class DTOMoneda {
  private double saldo;
  private String tipo;

  public DTOMoneda(double saldo, String tipo) {
    this.saldo = saldo;
    this.tipo = tipo;
  }

  public DTOMoneda(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getTipo() {
    return tipo;
  }
}
