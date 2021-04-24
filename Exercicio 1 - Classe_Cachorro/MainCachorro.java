class MainCachorro{
  public static void main(String[] args){
<<<<<<< HEAD
    Cachorro c1 = new Cachorro(Raca.PE_DURO, "Rex");
    c1.setIdade(10);
=======
    Cachorro c1 = new Cachorro();
    c1.setNome("rex");
    c1.idade = 10;
>>>>>>> 73102d307e6430f3d1188ed037263dd49001cc3b
    c1.latir();
    c1.andar(1);
    Cachorro c2 = new Cachorro(Raca.PINSHER, "gigi", 10,10,10);
    c2.latir();

    for (int i = 0; i<10; i++){
      c1.latir();
      if (i % 2 == 0)
        c2.latir();
    }
  }
}