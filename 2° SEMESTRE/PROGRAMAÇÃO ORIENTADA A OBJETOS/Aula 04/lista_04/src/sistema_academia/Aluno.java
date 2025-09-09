package sistema_academia;

import java.util.ArrayList;
import java.util.List;

/**
 * Autor do projeto.
 * 
 * @author Nicole Bruch
 */
public class Aluno {

	private String nome;
	private String matricula;
	private int idade;
	private double peso;
	private double altura;
	private List<PlanoTreino> planosTreinos;

	/**
	 * Construtor padrão. Inicializa o aluno com valores padrão para nome e
	 * matrícula.
	 */
	public Aluno() {
		setNome("Sem nome");
		setMatricula("Sem matricula");
		setPlanosTreinos(new ArrayList<>());
	}

	/**
	 * Construtor completo.
	 * 
	 * @param nome      Nome do aluno
	 * @param matricula Matrícula do aluno
	 * @param idade     Idade do aluno (não pode ser negativa)
	 * @param peso      Peso do aluno
	 * @param altura    Altura do aluno
	 * @throws IllegalArgumentException se a idade for negativa
	 */
	public Aluno(String nome, String matricula, int idade, double peso, double altura) {
		setNome(nome);
		setMatricula(matricula);
		setIdade(idade);
		setPeso(peso);
		setAltura(altura);
		setPlanosTreinos(new ArrayList<>());

	}

	/**
	 * Retorna a lista de planos de treino do aluno.
	 * 
	 * @return a lista de planos de treino
	 */
	public List<PlanoTreino> getPlanosTreinos() {
		return planosTreinos;
	}

	/**
	 * Define a lista de planos de treino do aluno.
	 * 
	 * @param planosTreinos a lista de planos de treino
	 */
	public void setPlanosTreinos(List<PlanoTreino> planosTreinos) {
		this.planosTreinos = planosTreinos;
	}

	/**
	 * Adiciona um plano de treino à lista de planos do aluno.
	 *
	 * @param plano o plano de treino que será adicionado
	 */
	public void adicionarPlano(PlanoTreino plano) {
		this.planosTreinos.add(plano);

	}

	/**
	 * Retorna o nome do aluno.
	 * 
	 * @return nome do aluno
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do aluno.
	 * 
	 * @param nome Nome do aluno
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a matrícula do aluno.
	 * 
	 * @return matrícula do aluno
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Define a matrícula do aluno.
	 * 
	 * @param matricula Matrícula do aluno
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Retorna a idade do aluno.
	 * 
	 * @return idade do aluno
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * Define a idade do aluno.
	 * 
	 * @param idade Idade do aluno (não pode ser negativa)
	 * @throws IllegalArgumentException se a idade for negativa
	 */
	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade negativa");
		}
		this.idade = idade;
	}

	/**
	 * Retorna o peso do aluno.
	 * 
	 * @return peso do aluno
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Define o peso do aluno.
	 * 
	 * @param peso Peso do aluno
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Retorna a altura do aluno.
	 * 
	 * @return altura do aluno
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Define a altura do aluno.
	 * 
	 * @param altura Altura do aluno
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
