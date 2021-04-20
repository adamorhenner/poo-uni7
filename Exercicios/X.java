package Exercicios;

public class X {

  private Object atributo;

  public void setAtributo(Object o) {
    this.atributo = o;
  }

  public Object getAtributo() throws MinhaExcecao {
    if (atributo == null) {
      throw new MinhaExcecao();
    }

    return this.atributo;
  }

}