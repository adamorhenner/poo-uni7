public class Main {

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Alex");
    funcionario.setMatricula(2398);

    Professor professor = new Professor();
    professor.setNome("Marum");
    professor.setMatricula(23981);

    System.out.println(funcionario.getNome());
    System.out.println(professor.getNome());

    funcionario = professor;
    System.out.println(funcionario.getNome());
  }

}
