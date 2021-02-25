
public class Data {
  public static final int DIAS_NO_ANO = 365; //Variavel constante e statica

  private final Integer dia;
  private final Integer mes;
  private final Integer ano;

  public Data (Integer dia, Integer mes, Integer ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano; 
    //x = dia; //static teste
  }

  public Integer getDia(){
    return dia;
  }

  public Integer getMes(){
    return this.mes;
  }

  public Integer getAno(){
    return ano;
  }

  public String getDataFormatada(){
    return dia +"/"+ mes + "/"+ ano;
  }

  public String toString(){
    return getDataFormatada();
  }

 // public static int getX(){
    //return x;
 // }
}