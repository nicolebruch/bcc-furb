package questao_02;

public class Livro {

	private static int totalLivros = 0;

	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Livro() {
		setTitulo("Sem título");
		setAutor("Desconhecido");
		setAnoPublicacao(0);
		totalLivros++;
	}

	public Livro(String titulo, String autor, int anoPublicacao) {
		setTitulo(titulo);
		setAutor(autor);
		setAnoPublicacao(anoPublicacao);
		totalLivros++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.isBlank()) {
			System.out.println("Título Inválido");
		} else {
			this.titulo = titulo;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == null || autor.isBlank()) {
			System.out.println("Autor Inválido");
		} else {
			this.autor = autor;
		}
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		if (anoPublicacao < 0) {
			System.out.println("Ano de Publicação Inválido");
		} else {
			this.anoPublicacao = anoPublicacao;
		}
	}

	public String exibirInfo(boolean resumido) {
		if (resumido == true) {
			return "Título: " + this.titulo;
		} else {
			return this.exibirInfo();
		}
	}

	public String exibirInfo() {
		return "Título: " + this.titulo
				+ "Autor: " + this.autor
				+ "Data de publicação: " + this.anoPublicacao;
	}
	
	/*
	 * ninguem deve alterar direto esse numero, pra nao atrapalhar a contagem, por
	 * isso nao tem setTotalLivros e sim só o get, que serve só pra consultar
	 */
	public static int getTotalLivros() {
		return totalLivros;
	}

}
