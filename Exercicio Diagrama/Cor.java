public class Cor{
  private int red;
  private int green;
  private int blue;

  public Cor(int vermelho, int verde, int azul){//construtor
    this.red = vermelho;
    this.green = verde;
    this.blue = azul;
  }

  public int getRed(){
    return red;
  }

  public void setRed(int vermelho){
    this.red = vermelho;
  }

  public int getGreen(){
    return green;
  }

  public void setGreen(int verde){
    this.green = verde;
  }
  
  public int getBlue(){
    return blue;
  }

  public void setBlue(int azul){
    this.blue = azul;
  }
  
}