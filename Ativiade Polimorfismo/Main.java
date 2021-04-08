import java.util.*;

public class Main{
  
  public static void main(String[] args){
    String ladoE = "esquerdo";
    
    List<Peca> pecas = gerarListaDePeca(10);

    for (Peca peca : pecas) {
      peca.movimentar(ladoE);
    }
  }

  public static List<Peca> gerarListaDePeca(int n) {
    List<Peca> pecas = new ArrayList<>();

    Random rand = new Random();

    for (int i = 0; i < n; i++) {
      Peca peca;      

      if (rand.nextBoolean()) {
        peca = new Peao();
      } else {
        peca = new Bispo();
      }

      pecas.add(peca);
    }

    return pecas;
  }

}
    
