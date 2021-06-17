package br.edu.uni7.trabalhovf;

public class Motor {

    private int producaoDeCarbono;
    private boolean ligado;/*Responsabilidade unica*/

    public Motor(int producaoDeCarbono) { /*Principio da substituição de Liskov, se tiver um motor eletrico ?*/
        this.producaoDeCarbono = producaoDeCarbono;
        this.ligado = false;
    }

    public int getProducaoDeCarbono() {
        return producaoDeCarbono;
    }

    public void setProducaoDeCarbono(int producaoDeCarbono) {
        if (producaoDeCarbono < 0)
            throw new IllegalArgumentException("Produção de carbono menor que 0? É bom que salva o planeta...");
        this.producaoDeCarbono = producaoDeCarbono;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Produzindo " + producaoDeCarbono + " litros de CO2 para a atmosfera");
        }
    }

    public void desligar() {
        ligado = false;
    }
}