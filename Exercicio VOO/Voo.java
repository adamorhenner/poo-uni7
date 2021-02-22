class Voo{
  private final Local local;
  private int passageiro;
  private String data;

  public Voo(Local local, String data){
    this.local = local;
    this.passageiro = 1;
    this.data = data;
  }

  public void exibirData(){
    System.out.println("a data de sua viagem é: " + data);
  }

  public void alterarData(String data){
    this.data = data;
  }
  
  public void setData(String novaData){
    data = novaData;
  }

  public void comprarPassagem(int i){
    for (int a = 0; a<i; a++)
      passageiro++; 
  }

  public void passagemDisponivel (){
    System.out.println("restam " + (100 - passageiro) + " passagens");
  }

}