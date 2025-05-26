/* gerenciar estoque de uma loja */

/*
 * precisa:
 * 1. cadastro de produtos
 * 2. controle de entrada e saida de mercadorias
 * 3. geracao de relatorios basicos do estoque
 */

/*
 * na main precisa ter menu de opcoes, sendo:
 * 1. Cadastrar produto
 * 2. Entrada de mercadoria (adicionar estoque)
 * 3. Saída de mercadoria (remover estoque)
 * 4. Listar todos os produtos
 * 5. Listar produtos por categoria
 * 6. Buscar produto por código
 * 7. Sair
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
        int opcao;
 
        do {

      System.out.println("===== SISTEMA DE GESTÃO DE ESTOQUES =====");
      System.out.println("1. Cadastrar produto");
      System.out.println("2. Entrada de mercadoria");
      System.out.println("3. Saída de mercadoria");
      System.out.println("4. Listar todos os produtos");
      System.out.println("5. Listar produtos por categoria");
      System.out.println("6. Buscar produto por código");
      System.out.println("7. Sair")
      System.out.println("=======================================");

      System.out.println("Escolha uma opção: ");
      opcao = scanner.nextInt();  

  switch (opcao){

  case 1:
  break;

  case 2:
  break;


  case 3:
  break;

  case 4:
  break;

  case 5:
  break;

  case 6:
  break;

  default:
  System.out.println("Opção inválida");
  break;

  }
 } while (opcao != 7);
System.out.println("Fim do programa");

  scanner.close();
    }
}
