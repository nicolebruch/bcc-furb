package questao_01;

public class Funcionario {

	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {

		setNome(nome);
		setSalario(salario);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null | nome.isBlank()) {
			System.out.println("Nome Inválido");
		} else {
			this.nome = nome;
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario <= 0) {
			System.out.println("Salário Inválido");
		} else {
			this.salario = salario;
		}
	}

	public double calcularIrpf() {
		double calculoImposto = 0;

		// primeira faixa - ok
		if (getSalario() <= 1903.98) {
			System.out.println("1° Faixa com Insento de Imposto");

			// segunda faixa - ok
		} else if (getSalario() >= 1903.99 && getSalario() <= 2826.65) {
			calculoImposto = (salario - 1903.98) * 0.075;
			System.out.println("2° Faixa com Alíquota de 7,5%");

			// terceira faixa
		} else if (getSalario() >= 2826.66 && getSalario() <= 3751.05) {
			calculoImposto = (2826.65 - 1903.98) * 0.075; // desconto a faixa 2 (maior da segunda faixa - primeira
															// faixa)
			calculoImposto = calculoImposto + (salario - 2826.65) * 0.15; // desconto agora da faixa 3
			System.out.println("3° Faixa com Alíquota de 15,0%");

			// quarta faixa
		} else if (getSalario() >= 3751.06 && getSalario() <= 4664.68) {
			calculoImposto = (2826.65 - 1903.98) * 0.075; // desconto a faixa 2
			calculoImposto = calculoImposto + (3751.05 - 2826.65) * 0.15; // desconto a faixa 3 (maior da terceira faixa - maior da
															// segunda faixa)
			calculoImposto = calculoImposto + (salario - 2826.65) * 0.225; // desconto agora da faixa 4
			System.out.println("4° Faixa com Alíquota de 22,5%");

			// quinta faixa
		} else if (getSalario() >= 4664.69) {
			calculoImposto = (2826.65 - 1903.98) * 0.075; // desconto a faixa 2
			calculoImposto = calculoImposto + (3751.05 - 2826.65) * 0.15; // desconto a faixa 3
			calculoImposto = calculoImposto + (4664.68 - 3751.05) * 0.225; // desconto a faixa 4 (maior da quarta faixa - maior da
															// terceira faixa)
			calculoImposto = calculoImposto + (salario - 4664.68) * 0.275;// desconto agora da faixa 5
			System.out.println("5° Faixa com Alíquota de 27,5%.");

		} else {
			System.out.println("Não foi possível calcular o IRPF");
		}
		return calculoImposto;

	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", calcularIrpf()=" + calcularIrpf() + "]";
	}

}
