package br.edu.uni7.Refatoracao;

import java.time.LocalDate;

public class Cnh {
    private LocalDate vencimentoCNH;
    private final String nome;
    public Cnh(String nome) {
    	this.nome = nome;
	}
    public String getNome() {
        return nome;
    }

    public LocalDate getVencimentoCNH() { 
        return vencimentoCNH;
    }

    public void renovarCNH() {  
        vencimentoCNH = vencimentoCNH.plusYears(5);
    }
}
