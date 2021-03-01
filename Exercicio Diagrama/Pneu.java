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
  }

  public void setDiametro(int diametro){
    this.diametro = diametro;
  }

  public int getLargura(){
    return largura;
  }

  public void setLargura(int largura){
    this.largura = largura;
  }


}