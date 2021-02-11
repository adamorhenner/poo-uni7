class Main {
  public static void Main(String[] args){
    Carro ford = new Carro();
    ford.Marca = "Ford";
    ford.Ano = 2020;
    ford.Cor = "preto";
    ford.Placa = "ABC1234";
    ford.Velocidade = 61;

    ford.Multa();
  }
}