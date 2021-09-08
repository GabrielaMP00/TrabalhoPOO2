package modelo;

public class Concedente {
	
	public Concedente(String razaoSocial, String cnpj, String telefone, String nomeRepresentante,
			String cargoRepresentante, String cep, String endereço, String bairro, String cidade, String estado) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.nomeRepresentante = nomeRepresentante;
		this.cargoRepresentante = cargoRepresentante;
		this.cep = cep;
		this.endereço = endereço;
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
	private String endereço;
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
