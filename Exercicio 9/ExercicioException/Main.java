package ExercicioException;

public class Main {
	public static void main(String[] args) throws Exception {
		try{
			Calcular.dividir(10, 2);
			Calcular.dividir(5, 0);

		}catch (Exception e) {
			System.out.println("erro");
		}

	}
}
