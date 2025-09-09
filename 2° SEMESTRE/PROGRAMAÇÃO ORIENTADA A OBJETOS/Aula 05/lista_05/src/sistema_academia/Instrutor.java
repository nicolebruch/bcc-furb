package sistema_academia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Instrutor {

	private String nome;
	private String cref;
	private String especialidade;
	private List<Aluno> alunos;
	private Instrutor mentor;
	
	public Instrutor() {
	    setNome("");
	    this.alunos = new ArrayList<>();
	    setMentor(null);
	}

	public Instrutor(String nome, String cref, String especialidade, Instrutor mentor) {
		setNome(nome);
		setCref(cref);
		setEspecialidade(especialidade);
		this.alunos = new ArrayList<>();
		setMentor(mentor);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCref() {
		return cref;
	}
	public void setCref(String cref) {
		this.cref = cref;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public Instrutor getMentor() {
		return mentor;
	}
	public void setMentor(Instrutor mentor) {
			this.mentor = mentor;
		}
		
	
	public void adicionarAluno(Aluno aluno) {
		if (aluno != null) {
			alunos.add(aluno);
	}
	}
		
	public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
	
	}
	
	public String getResumo() {
		String resumo = "Instrutor: " + nome +
                " | CREF: " + cref +
                " | Especialidade: " + especialidade +
                " | Alunos associados: " + alunos.size();
		if (Objects.isNull(mentor)) {
			resumo = resumo + " | Mentor: Sem mentor";
		} else {
			resumo = resumo + " | Mentor: " + mentor.getNome();
		}
        return resumo;
	}
}
