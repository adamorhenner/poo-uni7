import cidadao.CadastroPessoa;
import cidadao.Pessoa;

import IR.*;
import java.util.Date;
import java.util.Random;

public class Main {
    private static final String[] EMPRESAS = {"COCACOLA", "C&A", "FORTES", "UNI7"};
    private static final String[] NOMES = {"Mateus", "Camila", "Nícolas", "Cage"};
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        ImpostoRenda imposto = new ImpostoRenda();
        
        for (int i = 0; i < 100; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nomeAleatorio() + " " + nomeAleatorio());
            pessoa.setCpf(RANDOM.nextInt());
            pessoa.setNascimento(new Date());
            pessoa.setRendaMensal(RANDOM.nextInt(33_000));

            Emprego emprego = new Emprego();
            emprego.setNome(empresaAleatoria());
            emprego.setSalario(RANDOM.nextInt(10_000));
            
            cadastro.registrar(pessoa);
            imposto.declaraImposto(pessoa);
            System.out.println(imposto.isDeclaracao());
        }

        System.out.println("Total de pessoas: " + cadastro.getPessoas().size());
        for (Pessoa pessoa : cadastro.getPessoas()) {
            System.out.println(pessoa);
        }
//        for (Emprego emprego: imposto.isDeclaracao()) {
//            System.out.println(emprego);
//        }
    }

    public static String nomeAleatorio() {
        return NOMES[RANDOM.nextInt(NOMES.length)];
    }
    public static String empresaAleatoria() {
        return EMPRESAS[RANDOM.nextInt(EMPRESAS.length)];
    }

}