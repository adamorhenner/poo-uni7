class Main{
  public static void main(String[] args){
    Cachorro c1 = new Cachorro();
    c1.setNome("rex");
    c1.idade = 10;
    c1.latir();

    Cachorro c2 = new Cachorro();
    c2.nome = "Babau";
    c2.idade = 2;
    c2.latir();

    for (int i = 0; i<10; i++){
      c1.latir();
      if (i % 2 == 0)
        c2.latir();
    }
  }
}