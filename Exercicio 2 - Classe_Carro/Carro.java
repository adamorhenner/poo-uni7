class Carro{
  String Cor;
  String Marca;
  int Ano;
  String Placa;
  int Velocidade;


  void Multa(){
    System.out.println("O carro " + Marca + " da cor: " + Cor + " de Placa numero: " + Placa + ", Foi Multado");
  }

  void Andar(int Velocidade){
    if (Velocidade > 60)
      Multa();
      else 
      System.out.println("O carro " + Marca + " Andou...");
  }
}