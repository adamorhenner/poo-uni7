package ExercicioContaPoupança;

public class ContaPoupanca {
	private int saldo;
	
	public int getSaldo() {
		return saldo;
	}


	public void sacar(double valor) throws Exception {
		if(valor>saldo) {
			throw new Exception("Saldo insuficiente!");
		}
		this.saldo = (int) (saldo - valor);
	}
	
	public void depositar(double valor) throws Exception {
		if (valor <= 0) {
			throw new Exception("deposito invalido");
		}
		this.saldo = (int) (saldo + valor);
	}

}
