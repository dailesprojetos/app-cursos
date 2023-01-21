package escola.model;

public class Endereco {
	
	private String logradouro;
	private String numeroLogradouro;
	private String bairro;
	private String cep;
	private String municipio;
	private String estado;
	private String pais;
	
	public Endereco() {
		
	}

	public Endereco(String logradouro, String numeroLogradouro, String bairro, String cep, String municipio,
			String estado, String pais) {
		this.logradouro = logradouro;
		this.numeroLogradouro = numeroLogradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.municipio = municipio;
		this.estado = estado;
		this.pais = pais;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numeroLogradouro=" + numeroLogradouro + ", bairro=" + bairro
				+ ", cep=" + cep + ", municipio=" + municipio + ", estado=" + estado + ", pais=" + pais + "]";
	}
	
}
