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
  }

}