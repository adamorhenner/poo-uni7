public class ContaPoupanca {

  private double saldo;

  public ContaPoupanca() {
    this.saldo = 0;
  }

  public void depositar(double dinheiro) throws DepositoNegativoException {
    if (dinheiro <= 0) {
      throw new DepositoNegativoException("Uma mensagem bonita pra quem for tratar essa exception");
    }
    this.saldo += dinheiro;
  }

  public void sacar(double dinheiro) throws SaldoInsuficienteException, SaqueNegativoException {
    if (dinheiro < 0) {
      throw new SaqueNegativoException();
    }

    if (dinheiro > this.saldo) {
      throw new SaldoInsuficienteException("Você tem apenas R$ " + this.saldo + " de saldo");
    }

    this.saldo -= dinheiro;
  }

  public double getSaldo() {
    return this.saldo;
  }

}