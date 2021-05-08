
public class ContaPoupanca extends ContaBancaria {
	
	static double Selic = 0.75;
	static double taxa = 2;
	public ContaPoupanca(Pessoa Cliente) {
		super(Cliente);
	}
public double Render() {
	return (saldo * Selic);
}

	public void sacar(double dinheiro) throws SaqueNegativoException, SaldoInsuficienteException {
		  if (dinheiro < 0) {
		      throw new SaqueNegativoException("Você nao pode sacar valores iguais ou menor que 0");
		    }

		    if (dinheiro > this.saldo) {
		      throw new SaldoInsuficienteException("Você tem apenas R$ " + this.saldo + " de saldo");
		    }
		    saldo -= dinheiro;
		    saldo-= taxa;
	}


	public double depositar(double dinheiro) throws DepositoNegativoException {
		Render();
		return saldo += dinheiro;		
		
	}
}
