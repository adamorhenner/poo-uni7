class Carro{
  String Cor;
  String Marca;
  int Ano;
  String Placa;
  int Velocidade;


  void Multa(){
    System.Out.println("O carro " + Marca + "da cor: " + Cor + "de Placa numero: "+ Placa + "Foi Multado");
  }

  void Andar(int velocidade){
    if (velocidade > 60)
      Multa();
  }
}