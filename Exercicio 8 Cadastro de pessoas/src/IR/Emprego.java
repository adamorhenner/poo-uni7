package IR;

import java.util.HashSet;
import java.util.Set;

import cidadao.Pessoa;

public class Emprego {
	private String nome;
	private double salario;
   
	private Set<Emprego> empregos = null;

    public void CadastroEmprego() {
        empregos = new HashSet<>();
    }

    public void registrar(Emprego emprego) {
        empregos.add(emprego);
    }

    public Set<Emprego> getEmprego() {
        return empregos;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
    public String toString() {
        return "Emprego{" +
                "nome='" + nome + '\'' +
                ", salario =" + salario +
                '}';
    }
	
	
	
}
