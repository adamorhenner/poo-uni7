public class Voo {
  private Data data;
  private int assentosLivres;
  private final int capacidadeTotal; //constante


  public Voo(int capacidade){
    this.capacidadeTotal = capacidade;
  }

  public Data getData(){
    return data;
  }

  public void setData(Data data){
    this.data = data;
  }

  public int getAssentosLivres(){
    return assentosLivres;
  }

  public void setAssentosLivres (int assentos){
    if (assentos>100)
      assentos = 100;
    this.assentosLivres = assentos;
  }

  public int getCapacidadeTotal(){
    return capacidadeTotal;
  }
}