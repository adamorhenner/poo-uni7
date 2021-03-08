public class Motor{
  private int cilindro;
  private int potenciaPorCilindro;

  public Motor(int cilindros, int potenciaPorCilindro){
    this.cilindro = cilindros;
    this.potenciaPorCilindro = potenciaPorCilindro;

  }

  public void setCilindro(int cilindro){
    this.cilindro = cilindro; 
  }

  public int getCilindro(){
    return cilindro;
  }

  public int getPotenciaPorCilindro(){
    return potenciaPorCilindro;  
  }

  public void setPotenciaPorCilindro(int potencia){
   this.potenciaPorCilindro = potencia;
  }
  
  public int getPotencia(){
    return cilindro * potenciaPorCilindro;  
  }


}


