package questao_01;	
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[3];
        
        for (int i = 0; i < 3; i++) {
            pessoa[i] = new Pessoa(1.69, 45.0, "Nicole"); 

            System.out.println("Informe o nome da pessoa " + (i + 1) + ":");
            pessoa[i].setNome(scanner.next());

            System.out.println("Informe o peso da pessoa " + (i + 1) + ":");
            pessoa[i].setPeso(scanner.nextDouble());

            System.out.println("Informe a altura da pessoa " + (i + 1) + ":");
            pessoa[i].setAltura(scanner.nextDouble());
        }
        scanner.close();

        //	mostra na ordem inversa
        for (int i = pessoa.length - 1; i >= 0; i--) {
            System.out.println(pessoa[i].toString());
        }
    }
}
