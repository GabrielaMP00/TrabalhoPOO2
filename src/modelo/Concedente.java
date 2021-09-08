package modelo;

public class Concedente {
	
	public Concedente(String razaoSocial, String cnpj, String telefone, String nomeRepresentante,
			String cargoRepresentante, String cep, String endere�o, String bairro, String cidade, String estado) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.nomeRepresentante = nomeRepresentante;
		this.cargoRepresentante = cargoRepresentante;
		this.cep = cep;
		this.endere�o = endere�o;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public Concedente() {
		
	}
	
	private String razaoSocial;
	private String cnpj;
	private String telefone;
	private String nomeRepresentante;
	private String cargoRepresentante;
	private String cep; 
	private String endere�o;
	private String bairro;
	private String cidade;
	private String estado;
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNomeRepresentante() {
		return nomeRepresentante;
	}
	public void setNomeRepresentante(String nomeRepresentante) {
		this.nomeRepresentante = nomeRepresentante;
	}
	public String getCargoRepresentante() {
		return cargoRepresentante;
	}
	public void setCargoRepresentante(String cargoRepresentante) {
		this.cargoRepresentante = cargoRepresentante;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	} 

}
