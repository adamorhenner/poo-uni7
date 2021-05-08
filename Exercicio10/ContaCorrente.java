
public class ContaCorrente extends ContaBancaria {
	 
	public ContaCorrente(Pessoa cliente) {
		super(cliente);
	}
	public double depositar(double dinheiro) throws DepositoNegativoException {
		    if (dinheiro <= 0) {
		      throw new DepositoNegativoException("Voc� nao pode depositar valores iguais ou menor que 0");
		    }
		    this.saldo += dinheiro;
		    return saldo;
		  }
	  
	
	public void sacar(double dinheiro) throws SaqueNegativoException, SaldoInsuficienteException  {
		    if (dinheiro < 0) {
		      throw new SaqueNegativoException("Voc� nao pode sacar valores iguais ou menor que 0");
		    }

		    if (dinheiro > this.saldo) {
		      throw new SaldoInsuficienteException("Voc� tem apenas R$ " + this.saldo + " de saldo");
		    }
		    this.saldo -= dinheiro;
	  }
	
	public double ReceberSalario(double Salario) {
		return (saldo + Salario);
	}
}
