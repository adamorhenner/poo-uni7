public class Cachorro extends Animal {

  public void comunicar(String frase) {
    System.out.println("Latindo " + frase);
  }

  public void comunicar(String frase, int n) {
    for (int i = 0; i < n; i++) {
      comunicar(frase);
    }
  }

}