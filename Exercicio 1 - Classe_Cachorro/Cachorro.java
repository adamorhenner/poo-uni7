class Cachorro{
  private final Raca raca;
  private final String nome;
  private int comprimentoDoPelo;
  private int idade;
  private int peso;

  public Cachorro(Raca raca, String nome){
    this.nome = nome;
    this.raca = raca;
    this.peso = 1;
    this.comprimentoDoPelo = 10;
  }

  public Cachorro(Raca raca, String nome, int peso, int comprimentoDoPelo, int idade){
    this.nome = nome;
    this.raca = raca;
    this.peso = peso;
    this.idade = idade;
    this.comprimentoDoPelo = comprimentoDoPelo;
  }


  public int getComprimentoDoPelo(){
    return comprimentoDoPelo;
  }

  public int getIdade(){
    return idade;
  }

  public String getNome(){
    return nome;
  }



  public void setIdade(int novaIdade){
    idade = novaIdade;
  }


  public void latir(){
    System.out.println("O cachorro "+ nome + " está latindo...");
  }
  public void andar(int distancia){
    System.out.println("andar " + raca.toString().charAt(0));
  }
}