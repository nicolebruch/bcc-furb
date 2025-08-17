package questao_02;

public class Produto {

	private String nome;
	private double preco;
	private int estoque;

	public Produto(String nome, double preco, int estoque) {

		setNome(nome);
		setPreco(preco);
		setEstoque(estoque);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			System.out.println("Nome inválido");
		} else {
			this.nome = nome;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			System.out.println("Preço inválido");
		} else {
			this.preco = preco;
		}
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void vender(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Quantidade inválida");
		} else if (quantidade > estoque) {
			System.out.println("Estoque insuficiente. Estoque atual:" + estoque);
		} else {
			estoque = estoque - quantidade;
			System.out.println("Feito a venda. Estoque atual: " + estoque);
		}
	}

	public void repor(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Quantidade inválida para repor");
		} else {
			estoque = estoque + quantidade;
			System.out.println("Aumento de estoque realizado. Estoque atual: " + estoque);
		}
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", estoque=" + estoque + "]";
	}
}
