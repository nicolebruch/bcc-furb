package questao_03;

public class App {
	public static void main(String[] args) {

		ContaBancaria contaNicole = new ContaBancaria("12", "Nicole", 6500.00);
		ContaBancaria contaLuiz = new ContaBancaria("69", "Luiz", 3500.00);

		// realizando depositos na primeira conta

		contaNicole.depositar(1000.00);
		contaNicole.depositar(700.00);

		// realizando depositos na segunda conta

		contaLuiz.depositar(5000.00);

		// realizando saque na segunda conta

		contaLuiz.sacar(3000.00);

		// transferindo da segunda para a primeira conta

		contaLuiz.transferir(contaNicole, 1800.00);

		// printando o titular de cada conta e o seu saldo

		System.out.println(contaNicole);
		System.out.println(contaLuiz);

	}

}
