class Main{
  public static void main(String[] args){
    Motor v3 = new Motor(10,100);
    Cor cor1 = new Cor(0,1,0);
<<<<<<< HEAD
    Pneu michelin = new Pneu (10,10);
    Carro carro1 = new Carro(v3,10, "fiat");

=======
    Pneu michelin = new Pneu (10,10,4);
    Carro carro1 = new Carro(v3,200,cor1,"fiat",michelin,0,true );
>>>>>>> 6af35011e0b3c7efbf1aa48a90c0c2ed88a2b89c

  }
}