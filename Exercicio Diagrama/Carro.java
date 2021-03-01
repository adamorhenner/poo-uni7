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
  }

}