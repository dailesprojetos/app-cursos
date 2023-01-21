package escola.model.enums;

public enum SituacaoEstCadastro {

	ATIVO(1L, "Ativo"), INATIVO(2L, "Inativo"), EVADIDO(3L, "Evadido"), INADIMPLENTE(4L, "Inadimplente");
	
	private Long id;
	private String situacao;

	private SituacaoEstCadastro(Long id, String situacao) {
		this.id = id;
		this.situacao = situacao;
	}

	public Long getId() {
		return id;
	}
	
	public String getSituacao() {
		return situacao;
	}
}
