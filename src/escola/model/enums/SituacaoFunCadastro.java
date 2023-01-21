package escola.model.enums;

public enum SituacaoFunCadastro {
	
	ATIVO(1L,"Ativo"), DESLIGADO(2L,"Desligado");
	
	private Long id;
	private String situacao;

	SituacaoFunCadastro(Long id, String situacao) {
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
