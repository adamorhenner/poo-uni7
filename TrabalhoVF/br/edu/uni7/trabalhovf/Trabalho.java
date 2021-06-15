package br.edu.uni7.trabalhovf;

import java.time.LocalDate;

public class Trabalho {
    public static void main(String[] args) {
        Motor motor = new Motor(150);
        Veiculo veiculo = new Veiculo(TipoDeVeiculo.CARRO, motor);
        Motorista seuZe = new Motorista("Seu zé", LocalDate.of(2020, 12, 31));

        try {
            seuZe.dirigir(veiculo);
        } catch (InfracaoException e) {
            System.out.println(e.getMessage());
            seuZe.renovarCNH();
        }

        seuZe.dirigir(veiculo);
        seuZe.melhorarMotor();
        seuZe.estacionar();

        Motorista joao = new Motorista("Joao", LocalDate.of(2022, 10, 18));
        joao.dirigir(veiculo);
        joao.estacionar();
    }
}