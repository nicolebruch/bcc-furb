package questao_02;

public class App {

	public static void main(String[] args) {
		Livro[] livros = new Livro[3];
		
		livros[0] = new Livro("Livro da Nicole e do Luiz", "Nic", 2025);
		livros[1] = new Livro();
		livros[2] = new Livro();
		
		System.out.println("Mostrando informações completas dos livros");
		for (int i = 0; i < 3; i++) {
			System.out.println(livros[i].exibirInfo());
		}
		
		System.out.println("Mostrando informações resumidas dos livros");
		for (int i = 0; i < 3; i++) {
			System.out.println(livros[i].exibirInfo(true));
		}
		
		System.out.println("Quantidade total de livros cadastrados: " + Livro.getTotalLivros());
	}
	
}
