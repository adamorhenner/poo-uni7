public class Main{
  public static void main (String[] args){
    Data hoje = new Data(22, 02, 2021);
    Data amanha = new Data(23, 02, 2021);

    System.out.println(hoje.getDia());
    System.out.println(hoje.getMes());
    System.out.println(hoje.getAno());

    System.out.println(hoje);
   // System.out.println(Data.getX());
 
  }
}