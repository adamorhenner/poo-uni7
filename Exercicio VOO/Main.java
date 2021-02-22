class Main{
  public static void main(String[] args){
    Voo viagem1 = new Voo(Local.RECIFE,"08/02/2021");
    viagem1.exibirData();
    viagem1.alterarData("09/02/2021");
    viagem1.exibirData();
    viagem1.comprarPassagem(10);
    viagem1.passagemDisponivel();
    
    
    Voo viagem2 = new Voo(Local.SAO_PAULO,"02/02/2021");
    viagem2.exibirData();
    viagem2.setData("02/02/2021");
    viagem2.exibirData();

  }
}

