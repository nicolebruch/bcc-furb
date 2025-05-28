
/*eu sou técnico de laboratório e preciso criar um sistema
 * de armazenar produtos químicos
 */

/*armazeno num armário com capacidade limitada (o usuário 
 * informa a capacidade)
) */

/*cada produto possui:
 * int volume
 * String nome
 */

/*criar um menu (switch case & do while)*/

/*precisa ter opcao para sair do programa */

/* */

import java.util.Scanner;

public class ProdutosQuimicos {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int capacidadeMaxima = 0;
        int quantidade = 0;
        int volumeAtual = 0;
        String nome;
        int volume = 0;
        int volumes[] = new int[capacidadeMaxima];
        String nomes[] = new String[capacidadeMaxima];
        int opcao = 0;

        do {

            System.out.println("===== ARMAZENAMENTO DE PRODUTOS QUÍMICOS =====");
            System.out.println("1. Inserir um produto");
            System.out.println("2. Imprimir produtos armazenados");
            System.out.println("3. Produto mais volumoso");
            System.out.println("4. Ordenar produtos");
            System.out.println("5. Excluir produto");
            System.out.println("=======================================");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            System.out.println("Informe a capacidade Máxima de armazenamento no Armário:");
            capacidadeMaxima = scanner.nextInt();

            switch (opcao) {
                /*
                 * adiciona o produto no armario se tiver espaço disponivel e nao
                 * tiver atingido o volume maximo
                 */
                /*
                 * se o volume do produto ultrapassa o limite total do armario (ou nao tiver
                 * mais vaga)
                 * precisa informar na tela "Armário está cheio"
                 */
                case 1:
                    /*
                     * informa a quantidade de produtos mas se for maior doq comporta nao pode add
                     */

                    if (quantidade >= capacidadeMaxima) {
                        System.out.println("O armário atingiu o número máximo de produtos.");

                    } else {
                        System.out.println("Informe o nome do seu Produto Químico:");
                        nome = scanner.nextLine();

                        System.out.print("Volume do produto: ");
                        volume = scanner.nextInt();
                        scanner.nextLine();
                    
                    
                        if (volumeAtual + volume > capacidadeMaxima) {
                            System.out.println(
                                    "Não é possível adicionar. O armário está cheio ou o volume excede a capacidade.");

                        } else {
                            nomes[quantidade] = nome;
                            volumes[quantidade] = volume;
                            quantidade++;
                            volumeAtual += volume;
                            System.out.println("Produto adicionado com sucesso!");
                    
                        }
                    }
                }

                    break;

                /*
                 * imprime produtos armazenados na seguinte regra:
                 * imprime nome do produto
                 * imprime volume do produto
                 * imprime tudo isso na ordem inversa
                 * BUBBLE SORT
                 */
                case 2:

                if (quantidade == 0) {
                    System.out.println("Nenhum produto armazenado.");
                } else {
                System.out.println("Produtos armazenados na ordem INVERSA");
                for (int i = quantidade - 1; i >= 0; i--) {
                    System.out.println("Nome: " + nomes[i]);
                    System.out.println("Volume: " + volumes[i]);
                }
            } 
        

                    break;

                /*
                 * imprimir produto mais volumoso:
                 * mostrando qual é o produto q ocupa mais o espaço
                 * no armário e qual o seu volume
                 */
                case 3:

                if (quantidade == 0) {
                    System.out.println("Nenhum produto armazenado.");
                    return;
                }
        
                int maiorIndice = 0;
                for (int i = 1; i < quantidade; i++) {
                    if (volumes[i] > volumes[maiorIndice]) {
                        maiorIndice = i;
                    }
                }
        
                    break;

                /*
                 * devo ordenar os produtos na segguinte regra:
                 * ordenado com base no volume dos produtos
                 * do produto com maior volume para o menor >
                 * BUBBLE SORT
                 */
                case 4:
                //aqui é o for onde ele so vai percorrer o vetor formado
                for (int i = 0; i < quantidade - 1 - i; i++) {
                    //aqui é o for onde percorre as posicoes do vetor e vai ordenar em forma crescente
                        //ele formata em forma crescente usando o "- 1 - i", pois o length nao entende posicoes
                        //serve para nao estourar quando ele  for percorrer o prox elemento
                    for (int j = i + 1; j < quantidade; j++) {
                           //aqui vou comparar se a posicao 0 é maior que a posicao 1
                        if (volumes[i] < volumes[j]) {
                            int tempVolume = volumes[i];
                            volumes[i] = volumes[j];
                            volumes[j] = tempVolume;
        
                            //aqui comparo agora para o meu vetor de nome
                            String tempNome = nomes[i];
                            nomes[i] = nomes[j];
                            nomes[j] = tempNome;
                        }
                    }
                }
                System.out.println("Produtos ordenados por volume (maior para menor).");
            
        
                    break;

                /*
                 * excluo um produto com as informacoes:
                 * informo o nome do produto e ele é removido do vetor de nomes e volumes
                 * 
                 * 
                 * se nao for encontrado:
                 * informa que o produto nao existe
                 */
                case 5:

                if (quantidade == 0) {
                    System.out.println("Nenhum produto armazenado.");
                    
                } else {
        
                System.out.print("Informe o nome do produto a ser removido: ");
                 nome = scanner.nextLine();
        
                int indice = -1;
                for (int i = 0; i < quantidade; i++) {
                    if (nomes[i].equalsIgnoreCase(nome)) {
                        indice = i;
                        break;
                    }
             }   }
        
                if (indice == -1) {
                    System.out.println("Produto não encontrado.");
                    
                } else {
        
                volumeAtual -= volumes[indice];
        
                for (int i = indice; i < quantidade - 1; i++) {
                    nomes[i] = nomes[i + 1];
                    volumes[i] = volumes[i + 1];
                }}
        
                quantidade--;
                System.out.println("Produto removido com sucesso.");
            }
        }

    break;

    default:
    System.out.println("Opção não é válida.");
    break;
}

while(opcao!=6);
System.out.println("Fim do programa.");

scanner.close();
}
}

pelo amor de deus me ajude a implementar isso aqui que precisa ser em java, bem basico sem orientacao objeto e return, bem basico mas precisa funcionar, e deixa tudo comentado igual eu deixei