public class questao01 {

    public static void main(String[] args) {

        String cor = "Vermelha";
        String carro = "Fusca";

        if ((cor.isEmpty()) && (carro.isEmpty())) {
            System.out.println("Cor e Carro");
        } else {
            System.out.println("Teste Carro");
            if (carro.isEmpty()) {
                System.out.println("Carro Vazio");
                System.out.println("Cor Vazia");
            } else {
                System.out.println("Carro Cadastrado");
            }

        }

        System.out.println("Outro Carro");

    }

}