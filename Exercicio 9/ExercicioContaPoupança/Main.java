package ExercicioContaPoupança;

public class Main {
	public static void main(String[] args) {
		ContaPoupanca adam = new ContaPoupanca();
		try {
			adam.depositar(10);
			adam.sacar(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
