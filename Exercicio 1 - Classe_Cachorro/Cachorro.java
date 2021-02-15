class Cachorro{
  private String raca;
  private String nome;
  private int comprimentoDoPeLo;
  private int idade;
  private int peso;

  public String getRaca(){
    return raca;
  }

  public int getComprimentoDoPelo(){
    return comprimentoDoPeLo;
  }

  public int getIdade(){
    return idade;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String novoNome){
    nome = novoNome;

  }

  public void setIdade(int novaIdade){
    idade = novaIdade;
  }


  public void latir(){
    System.out.println("O cachorro "+ nome + " está latindo...");
  }
  public void andar(int distancia){

  }
}