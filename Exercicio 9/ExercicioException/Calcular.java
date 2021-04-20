package ExercicioException;

public class Calcular {
	public static int dividir(int a, int b) throws Exception {
		if (b==0) {
			throw new Exception();
			
		}
		return a/b;
	}
}
