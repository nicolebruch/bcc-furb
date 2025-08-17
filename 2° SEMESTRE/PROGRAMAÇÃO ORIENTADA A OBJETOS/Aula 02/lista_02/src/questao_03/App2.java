package questao_03;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ContaBancaria contaNicole = new ContaBancaria("12", "Nicole", 6.500);
		ContaBancaria contaLuiz = new ContaBancaria("69","Luiz",2.400);
		int opcao = 0;

		do {

			System.out.println("===MENU DA CONTA BANCÁRIA===");
			System.out.println("1. Realizar depósito");
			System.out.println("2. Realizar saque");
			System.out.println("3. Realizar transferência");
			System.out.println("4. Consultar saldo do titular");
			System.out.println("5. Encerrar programa");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Valor que deseja depositar na conta: ");
				double valorDeposito = scanner.nextDouble();
				contaNicole.depositar(valorDeposito);
				break;

			case 2:
				System.out.println("Valor que deseja sacar: ");
				double valorSaque = scanner.nextDouble();
				contaNicole.sacar(valorSaque);
				break;

			case 3:
				System.out.println("Informe o número da conta que gostaria de transferir: ");
				String numeroContaTransferencia = scanner.next(); 
				System.out.println("Informe o valor que deseja transferir: ");
				double valorTransferencia = scanner.nextDouble();
				contaLuiz.transferir(contaLuiz, valorTransferencia);
				break;

			case 4:
				System.out.println(contaNicole);
				break;

			case 5:
				System.out.println("Fim do programa");
				break;

			default:
				System.out.println("Opção inválida");

			}
		} while (opcao != 0);
		scanner.close();

	}
}
