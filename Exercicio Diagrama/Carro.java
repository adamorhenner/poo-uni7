public class Carro {

  private final Motor motor;
  private final int velocidadeMax;
  private final int pesoEmToneladas;
  private final String montadora;

  private Cor cor;
  private Pneu[] pneus;
  private int velocidadeAtual;
  private boolean ligado;

  public Carro(Motor motor, int pesoEmToneladas, String montadora) {
    this.motor = motor;
    this.pesoEmToneladas = pesoEmToneladas;
    this.velocidadeMax = motor.getPotencia() / pesoEmToneladas;
    this.montadora = montadora;
  }

  public void ligar() {
    if (ligado == false) {
      ligado = true;
    }
  }

  public void desligar() {
    if (ligado == true) {
      ligado = false;
    }
  }

  public void acelerar() {
    if (velocidadeAtual < velocidadeMax)
      velocidadeAtual += motor.getPotencia() / 10;
  }
  
  public void frear() {
    if (velocidadeAtual > 0)
      velocidadeAtual--;
  }

  public int getVelocidadeAtual() {
    return velocidadeAtual;

public class Carro{
  private Motor motor;
  private int velocidadeMax;
  private Cor cor;
  private String montadora;
  private Pneu pneus;
  private int velocidadeAtual;
  private boolean ligado;

  public Carro(Motor motor, int velocidadeMax, Cor cor,String montadora, Pneu pneus,int velocidadeAtual, boolean ligado){//agtributos
    this.motor = motor;
    this.velocidadeMax = velocidadeMax;
    this.cor = cor;
    this.montadora = montadora;
    this.pneus = pneus;
    this.velocidadeAtual = velocidadeAtual;
    this.ligado = ligado;
  }

  public void ligar(){
    System.out.println("Carro ligou");
  }

  public void desligar(){
    System.out.println("Carro desligou");
  }

  public void acelerar(){
    System.out.println("Carro acelerrou");
  }

  public void frear (){
    System.out.println("Carro freou");
  }

  public int getVelocidade(int velocidade){
    return velocidade;
>>>>>>> 6af35011e0b3c7efbf1aa48a90c0c2ed88a2b89c
  }

}