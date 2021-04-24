class MainCarro {
  public static void main(String[] args){
    Carro ford = new Carro();
    ford.Marca = "Ford";
    ford.Ano = 2020;
    ford.Cor = "preto";
    ford.Placa = "ABC1234";
    ford.Velocidade = 60;

    ford.Andar(ford.Velocidade);
  }
}