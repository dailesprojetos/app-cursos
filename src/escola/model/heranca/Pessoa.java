package escola.model.heranca;

import java.time.LocalDate;

import escola.model.Contato;
import escola.model.Endereco;

public abstract class Pessoa {

	protected Long id;
	protected String nome;
	protected LocalDate dataDeAniversario;
	protected Endereco endereco;
	protected Contato contato;
	
	public Pessoa() {
	}

	public Pessoa(Long id, String nome, LocalDate dataDeAniversario, Endereco endereco, Contato contato) {
		this.id = id;
		this.nome = nome;
		this.dataDeAniversario = dataDeAniversario;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeAniversario() {
		return dataDeAniversario;
	}

	public void setDataDeAniversario(LocalDate dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
