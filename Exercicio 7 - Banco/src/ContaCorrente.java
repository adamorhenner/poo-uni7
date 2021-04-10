
public class ContaCorrente extends Produto {

	public void calcularRendimento() {
/*		- Conta Corrente tem rendimento fixo de 1% do saldo 
		ao mês.*/

		double saldoAtual = getSaldo();
		saldoAtual += saldoAtual * 0.01;
		setSaldo(saldoAtual);
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	public void imprimir() {
		System.out.println("Conta Corrente tem rendimento fixo de 1% do saldo ao mês.");
	}

}
