import java.util.Scanner;

public class PoupancaMain {
  public static void main(String[] args) throws SaldoInsuficienteException, SaqueNegativoException, DepositoNegativoException {
    Scanner scanner = new Scanner(System.in);
    ContaPoupanca cp = new ContaPoupanca();
    
    int opcao = 0;
    do {
    try {
      System.out.println("Digite a opção desejada:");
      System.out.println("1 - Sacar");
      System.out.println("2 - Depositar");
      System.out.println("0 - Sair do sistema");
      System.out.print("Sua opção: ");
      opcao = scanner.nextInt();
    	}catch(Exception e){
    	      System.out.print("Digite apenas numeros de 0 a 2");
    	}
      if (opcao == 1) {
        double valor;
        System.out.print("Digite o valor para saque: ");
        valor = scanner.nextDouble();
		cp.sacar(valor);
        System.out.println("Saldo Atual: " + cp.getSaldo());

      }
      if (opcao == 2) {
        double valor;
        System.out.print("Digite o valor para deposito: ");
        valor = scanner.nextDouble();
        cp.depositar(valor);
        System.out.println("Saldo Atual: " + cp.getSaldo());

      }
    } while (opcao != 0);
    
  }
}
