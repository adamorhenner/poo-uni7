package cidadao;

import cidade.Endereco;

import java.util.Date;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private int cpf;
    private Date nascimento;
    private Endereco endereco;
    private double rendaMensal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", nascimento=" + nascimento +
                '}';
    }

    public boolean equals(Object o) {
        if (o instanceof Pessoa) {
            Pessoa outraPessoa = (Pessoa) o;
            if (getNome() != null)
                return getNome().equals(outraPessoa.getNome());
        }

        return false;
    }

    public int hashCode() {
        return Objects.hash(getNome());
    }
   
}