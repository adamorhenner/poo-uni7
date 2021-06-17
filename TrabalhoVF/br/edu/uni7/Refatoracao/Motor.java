package br.edu.uni7.Refatoracao;

public class Motor extends Button{

	boolean eletrico;
	
	public boolean ehEletrico(int i) {
		if (i == 1 ) {
			eletrico = true;
		} else {
			eletrico = false;
		}
		return eletrico;
	}
}