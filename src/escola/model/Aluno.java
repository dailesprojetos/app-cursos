package escola.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import escola.model.enums.SituacaoEstCadastro;
import escola.model.heranca.Pessoa;

public class Aluno extends Pessoa{
	
	private SituacaoEstCadastro situacaoEstCadastro;
	private List<Curso> turmas;
	
	public Aluno() {
	}

	public Aluno(Long id, String nome, LocalDate dataDeAniversario, Endereco endereco, Contato contato,
			SituacaoEstCadastro situacaoEstCadastro, List<Curso> turmas) {
		super(id, nome, dataDeAniversario, endereco, contato);
		this.situacaoEstCadastro = situacaoEstCadastro;
		this.turmas = turmas;
	}

	public SituacaoEstCadastro getSituacaoEstCadastro() {
		return situacaoEstCadastro;
	}

	public void setSituacaoEstCadastro(SituacaoEstCadastro situacaoEstCadastro) {
		this.situacaoEstCadastro = situacaoEstCadastro;
	}

	public List<Curso> getTurmas() {
		return turmas;
	}

	public void setCurso(List<Curso> turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "Aluno [situacaoEstCadastro=" + situacaoEstCadastro + ", curso=" + turmas + ", id=" + id + ", nome="
				+ nome + ", dataDeAniversario=" + dataDeAniversario + ", endereco=" + endereco + ", contato=" + contato
				+ "]";
	}
	
}
