<<<<<<< HEAD
public class Pneu{
  private int diametro;
  private int largura;

  public Pneu(int diametro, int largura){
    this.diametro = diametro;
    this.largura = largura;
  }

  public int getDiametro(){
    return this.diametro;
=======
import java.util.ArrayList;

import java.util.List;

public class Pneu{
  private int diametro;
  private int largura;
  private List<Integer> [] pneus;
  private int nPneus;

  public Pneu(int diametro, int largura,Integer nPneus){
    this.diametro = diametro;
    this.largura = largura;
    this.nPneus = nPneus;
    
    pneus = new ArrayList[nPneus];
    for (int i = 0; i < pneus.length; i++){
      pneus [i] = new ArrayList<Integer>();
    }

  }

  public int getDiametro(){
    return diametro;
>>>>>>> 6af35011e0b3c7efbf1aa48a90c0c2ed88a2b89c
  }

  public void setDiametro(int diametro){
    this.diametro = diametro;
  }

  public int getLargura(){
<<<<<<< HEAD
    return this.largura;
=======
    return largura;
>>>>>>> 6af35011e0b3c7efbf1aa48a90c0c2ed88a2b89c
  }

  public void setLargura(int largura){
    this.largura = largura;
  }


}