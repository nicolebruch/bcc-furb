public class questao2 {
    public static void main(String[] args) {
        int aux = 0;
        int vetor[] = { 10, 5, 3, 8, 9 };
        int numero = vetor.length;
        int tamanho = numero;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < i; j++) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;

            }
            numero++;
        }
    }

}
