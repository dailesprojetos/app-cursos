package escola.model;

public class Contato {
	
	private String telefone01;
	private String telefone02;
	private String email;
	
	public Contato() {
	}

	public Contato(String telefone01, String telefone02, String email) {
		this.telefone01 = telefone01;
		this.telefone02 = telefone02;
		this.email = email;
	}

	public String getTelefone01() {
		return telefone01;
	}

	public void setTelefone01(String telefone01) {
		this.telefone01 = telefone01;
	}

	public String getTelefone02() {
		return telefone02;
	}

	public void setTelefone02(String telefone02) {
		this.telefone02 = telefone02;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato [telefone01=" + telefone01 + ", telefone02=" + telefone02 + ", email=" + email + "]";
	}
}
