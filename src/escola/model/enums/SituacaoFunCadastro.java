package escola.model.enums;

public enum SituacaoFunCadastro {
	
	ATIVO(1L,"ativo"), DESLIGADO(2L,"desligado");
	
	private Long id;
	private String situacao;

	private SituacaoFunCadastro(Long id, String situacao) {
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
