
public class Pessoa {

	private final int cpf;
	private String name;
	
	public Pessoa(int cpf, String name) {
		this.cpf = cpf;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCpf() {
		return cpf;
	}

}
