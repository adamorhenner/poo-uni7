import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MainBanco {
public static void menu(ContaBancaria conta, Set<ContaBancaria> contas) throws DepositoNegativoException, SaqueNegativoException, SaldoInsuficienteException {
    Scanner scanner = new Scanner(System.in);
    int saida = 0;
    try {
    do {
    System.out.println("Digite a opção desejada:");
    System.out.println("1 - Sacar");
    System.out.println("2 - Depositar");
    System.out.println("3 - Transferir");
    System.out.println("0 - Sair do sistema");
    System.out.print("Sua opção: ");
    int opcao = scanner.nextInt();
    
	if (opcao == 1) {
		double valor;
		System.out.print("Digite o valor para saque: ");
		valor = scanner.nextDouble();
		conta.sacar(valor);
		System.out.println("Saldo Atual: " + conta.getSaldo());
		menu(conta, contas);
  	  }
      if (opcao == 2) {
    	  double valor;
    	  System.out.print("Digite o valor para deposito: ");
    	  valor = scanner.nextDouble();
    	  conta.depositar(valor);
    	  System.out.println("Saldo Atual: " + conta.getSaldo());
    	  menu(conta, contas);

      }
      if (opcao == 3) {
    	  double valor;
    	  System.out.print("Digite o valor para transferencia: ");
    	  valor = scanner.nextDouble();
    	  System.out.print("Digite o cpf do beneficiado: ");
    	  int cpf = scanner.nextInt();
    	  for (ContaBancaria s : contas) {
    		  if(cpf == s.getCliente().getCpf()) {
    			  conta.tranferencia(conta, valor);

      }
    	  }
      }
    } while (saida != 0);
    }catch(SaldoInsuficienteException e){
	      System.out.println("saldo insuficiente, seu saldo atual é de: " + conta.getSaldo());
	}catch(SaqueNegativoException e){
	      System.out.print("voce nao pode sacar um valor negativo");
	}catch(Exception e){
	      System.out.print("Digite apenas numeros validos!");
	}
    }
    




public static void main(String[] args) throws SaldoInsuficienteException, SaqueNegativoException, DepositoNegativoException {
    Scanner scanner = new Scanner(System.in);
    Set<ContaBancaria> contas = new HashSet<ContaBancaria>();
    int opcao = 0;
    do {
    try{
    	System.out.println("Já possui conta no Banco TL?");
    	System.out.println("[1] - Sim");
    	System.out.println("[2] - Nao");
    	System.out.println("[0] - sair");

    	opcao = scanner.nextInt();
    	if (opcao == 1) {
        		System.out.println("digite seu cpf: ");
        		int cpf = scanner.nextInt();
        		for (ContaBancaria s : contas) {
        			if(cpf == s.getCliente().getCpf()) {
        				menu(s, contas);
        			}
        			if (cpf != s.getCliente().getCpf()) {
        				System.out.println("Cpf invalido!");
        			}
        		}        	    		
    	}
    	if (opcao == 2) {
    		System.out.println("Abra sua conta!");
    		System.out.print("Digite seu nome: ");
    		String nome = scanner.next();
    		System.out.print("Digite seu cpf: ");
    		int cpf = scanner.nextInt();
    		Pessoa cliente = new Pessoa(cpf, nome);
    		System.out.print("Escolha o tipo de conta [1] - Conta corrente [2] - Conta poupanca : ");
    		int opcaoConta = scanner.nextInt();
    		if (opcaoConta == 1){
    			ContaBancaria cc = new ContaCorrente(cliente);
    			System.out.println("Conta corrente criada!");
    			contas.add(cc);
    			menu(cc, contas);
    		}
    		if (opcaoConta == 2 ) {
    			ContaBancaria cp = new ContaPoupanca(cliente);
    			System.out.println("Conta poupanca criada!");
    			contas.add(cp);
    			menu(cp, contas);

    		}
    	}
    }catch(SaldoInsuficienteException e){
	      System.out.print("saldo insuficiente");
	}catch(SaqueNegativoException e){
	      System.out.print("voce nao pode sacar um valor negativo");
	}catch(Exception e){
	      System.out.print("Digite apenas numeros validos!");
	}
    }while (opcao != 0);
  }
}

