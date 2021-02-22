public class Data{
  private final int dia;
  private final Mes mes;
  private final int ano;



  public Data(int dia,Mes mes,int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public void exibirData(){
    System.out.println(dia + "/"+ mes + "/"+ ano);

  }


}