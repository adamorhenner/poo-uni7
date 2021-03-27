import java.util.*;

public class Main {

  public static void main(String[] args) {
    String frase = "São 21:29";

    List<Animal> animais = gerarListaDeAnimais(10);

    for (Animal animal : animais) {
      animal.comunicar(frase);
    }
  }

  public static List<Animal> gerarListaDeAnimais(int n) {
    List<Animal> animais = new ArrayList<>();

    Random rand = new Random();

    for (int i = 0; i < n; i++) {
      Animal animal;      

      if (rand.nextBoolean()) {
        animal = new Cachorro();
      } else {
        animal = new Humano();
      }

      animais.add(animal);
    }

    return animais;
  }

}