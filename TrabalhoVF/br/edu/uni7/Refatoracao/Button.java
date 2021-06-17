package br.edu.uni7.Refatoracao;

public class Button {
	private boolean ligado;
	
	
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ta ligado!");
        }
    }
    
    public void desligar() {
        ligado = false;
    }
}
