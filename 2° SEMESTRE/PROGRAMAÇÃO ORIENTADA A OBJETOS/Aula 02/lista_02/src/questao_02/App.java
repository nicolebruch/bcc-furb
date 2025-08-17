package questao_02;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Produto produto1 = new Produto("Fogão", 5000.0, 2);

		int opcao = 0;

		do {
			System.out.println("===MENU DOS PRODUTOS===");
			System.out.println("1. Vender produto");
			System.out.println("2. Repor estoque");
			System.out.println("3. Consultar produto");
			System.out.println("4. Alterar preço");
			System.out.println("5. Sair do menu");
			System.out.println("Escolha: ");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Quantidade para vender: ");
				int quantidadeVenda = scanner.nextInt();
				produto1.vender(quantidadeVenda);
				break;

			case 2:
				System.out.println("Quantidade para repor: ");
				int quantidadeRepor = scanner.nextInt();
				produto1.repor(quantidadeRepor);
				break;
			case 3:
				System.out.println(produto1);
				break;
			case 4:
				System.out.println("Novo preço: ");
				double novoPreco = scanner.nextDouble();
				produto1.setPreco(novoPreco);
				System.out.println("Preço para: " + produto1.getPreco());
				break;
			case 5:
				System.out.println("Encerrando o programa.");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 0);
		scanner.close();	

	}
}
