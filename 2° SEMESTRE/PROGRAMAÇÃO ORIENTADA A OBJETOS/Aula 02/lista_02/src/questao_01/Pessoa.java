package questao_01;

public class Pessoa {

	private double altura;
	private double peso;
	private String nome;

	public Pessoa(double altura, double peso, String nome) {
		setAltura(altura);
		setPeso(peso);
		setNome(nome);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 0) {
			System.out.println("Altura inválida");
		} else {
			this.altura = altura;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso < 0) {
			System.out.println("Peso inválido");
		} else {
			this.peso = peso;

		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			System.out.println("Nome inválido");
		} else {
			this.nome = nome;
		}

	}

	public double calcularImc() {
		return getPeso() / (getAltura() + getAltura());

	}

	@Override
	public String toString() {
		return "Pessoa [altura=" + altura + ", peso=" + peso + ", nome=" + nome + " calcularImc()=" + calcularImc()
				+ "]";
	}

}
