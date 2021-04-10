
public class ContaPoupanca extends Produto {
	private static double porcentagemSelic;
	
	
	public void calcularRendimento() {
/*- Conta Poupança tem rendimento de 2% a.a. se a 
Selic o saldo for maior que 10% a.a., ou 10% da 
Selic caso contrário.*/

		double saldoAtual = getSaldo();
		double rendimento;
		
		if (porcentagemSelic > 10) {
			rendimento = saldoAtual * (0.02/12);
		}
		else {
			rendimento = porcentagemSelic * 0.10;
		}
		
		setSaldo(saldoAtual + rendimento);
	}

	public String getTipo() {
		return "Conta Poupança";
	}

	public static double getSelic() {
		return porcentagemSelic;
	}
	
	public static void setSelic(double selic) {
		porcentagemSelic = selic;
	}


	public void imprimir() {
		System.out.println(" Conta Poupança tem rendimento de 2% a.a. se a Selic o saldo for maior que 10% a.a., ou 10% da Selic caso contrário.");
	}
	
}