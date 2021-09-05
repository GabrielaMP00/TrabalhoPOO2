package modelo;

public class AutenticacaoUsuario {
	private String usuario; //admin
	private String senha; //admin
	
	public AutenticacaoUsuario(){}

	public AutenticacaoUsuario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String login) {
		this.usuario = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}