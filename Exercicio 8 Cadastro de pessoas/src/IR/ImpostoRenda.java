package IR;
import cidadao.*;

public class ImpostoRenda extends Pessoa{
	boolean declaracao;

	public boolean declaraImposto (Pessoa p) {
		if (p.getRendaMensal() > 2100) {
			declaracao = true;
		} else {
			declaracao = false;
		}
		return declaracao;
	}

	public boolean isDeclaracao() {
		return declaracao;
	}


}
