public class Motor{
  private int cilindros;
  private int potenciaPorCilindro;

  public Motor(int cilindros, int potenciaPorCilindro){
    this.cilindros = cilindros;
    this.potenciaPorCilindro = potenciaPorCilindro;

  }

  public void setCilindros(int cilindros){
    this.cilindros = cilindros; 
  }

  public int getCilindros(){
    return cilindros;
  }

  public int getPotencia(){
    return potenciaPorCilindro;  
  }

  public void setPotenciaPorCilindro(int potenciaPorCilindro){
  this.potenciaPorCilindro = potenciaPorCilindro;
  }
  
  public int getPotenciaPorCilindro(){
    return potenciaPorCilindro;  
  }


}