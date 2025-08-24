package questao_01;

import java.util.Scanner;

//solicitar nome e o salario de 5 funcionarios
public class App {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funcionario[] funcionario = new Funcionario[5];
		
		for (int i = 0; i < 2; i++) {
			funcionario[i] = new Funcionario("Nicole",1500.00);
			
			System.out.println("Informe o nome do funcionário " + (i+1) + ":");
			funcionario[i].setNome(scanner.next());
			
			System.out.println("Informe o salário do funcionário " + (i+1) + ":");
			funcionario[i].setSalario(scanner.nextDouble());
		}
		
		scanner.close();
		
		for (int i = 0; i < 2; i++) {
			System.out.println(funcionario[i].toString());	
		}
		
		
	}

}	
