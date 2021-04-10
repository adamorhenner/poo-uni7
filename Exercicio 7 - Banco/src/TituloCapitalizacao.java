public class TituloCapitalizacao extends Produto {

	public void calcularRendimento() {
/*- T�tulo de Capitaliza��o tem rendimento fixo 
de 0.5% do saldo ao m�s e sorteios mensais de 
10.000 reais onde todos os clientes concorrem.*/
		double saldoAtual = getSaldo();
		double rendimento = saldoAtual * 0.005;
		setSaldo(saldoAtual + rendimento);

	}

	public void receberPremio(int premio) {
		setSaldo(getSaldo() + premio);
	}
	
	public String getTipo() {
		return "T�tulo Capitaliza��o";
	}

	@Override
	public void imprimir() {
		System.out.println("- T�tulo de Capitaliza��o tem rendimento fixo de 0.5% do saldo ao m�s e sorteios mensais de 10.000 reais onde todos os clientes concorrem.");
	}

}
