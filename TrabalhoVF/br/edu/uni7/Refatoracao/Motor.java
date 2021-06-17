package br.edu.uni7.Refatoracao;

public class Motor {

    private int producaoDeCarbono;
    private boolean ligado;

    public Motor(int producaoDeCarbono) {
        this.producaoDeCarbono = producaoDeCarbono;
        this.ligado = false;
    }

    public int getProducaoDeCarbono() {
        return producaoDeCarbono;
    }

    public void setProducaoDeCarbono(int producaoDeCarbono) {
        if (producaoDeCarbono < 0)
            throw new IllegalArgumentException("Produ��o de carbono menor que 0? � bom que salva o planeta...");
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