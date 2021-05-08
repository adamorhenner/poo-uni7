

public abstract class ContaBancaria {
//	  private String name;
//	  private int cpf;
//	  private int conta;
//	  private int agencia;
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

	 
	  
//	  public String getName() {
//		return name;
//	}
//
//	public void setName(String nome) {
//		this.name = nome;
//	}
//
//	public String getCpf() {
//		return cpf;
//	}
//
//	public void setCpf(int cpf2) {
//		this.cpf = cpf2;
//	}
//
//	public int getConta() {
//		return conta;
//	}
//
//	public void setConta(int conta) {
//		this.conta = conta;
//	}
//
//	public int getAgencia() {
//		return agencia;
//	}
//
//	public void setAgencia(int agencia) {
//		this.agencia = agencia;
//	}
//
//	public double getSaldo() {
//		return saldo;
//	}
//
//	public void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}


	

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


