

public abstract class ContaBancaria {
	  protected double saldo;
	  private Pessoa Cliente;
	  
	
	
	
	  public ContaBancaria(Pessoa cliente) {
		this.Cliente = cliente;
	}

	public abstract double depositar(double dinheiro) throws DepositoNegativoException;

	public abstract void sacar(double dinheiro) throws SaqueNegativoException, SaldoInsuficienteException; 
	
	public double getSaldo() {
		return saldo;
	}

	 
	

public void tranferencia(ContaBancaria conta,double valor) throws DepositoNegativoException, TransferenceException {
	if (this.Cliente.getName() == conta.Cliente.getName()) {
		throw new TransferenceException("Você nao pode transferir para voce mesmo");
	}
	conta.depositar(valor);	
}

public Pessoa getCliente() {
	return Cliente;
}

public void setCliente(Pessoa cliente) {
	Cliente = cliente;
}
}


