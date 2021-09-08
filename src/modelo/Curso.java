package modelo;

public class Curso {
	
	private String código;
	private String nomeCurso;
	private String telefoneCoordenacao;
	private String representanteCoordenacao;
	private String cargoRepresentante;
	private String nomeUniversidade;
	private String cnpj;
	private String cep;
	private String endereço;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefoneGeralUniversidade;
	private String representanteUniversidade;
	private String cargoRepresentanteUniversidade;	
	
	
	public Curso(String código, String nomeCurso, String telefoneCoordenacao, String representanteCoordenacao,
			String cargoRepresentante, String nomeUniversidade, String cnpj, String cep, String endereço, String bairro,
			String cidade, String estado, String telefoneGeralUniversidade, String representanteUniversidade,
			String cargoRepresentanteUniversidade) {
		super();
		this.código = código;
		this.nomeCurso = nomeCurso;
		this.telefoneCoordenacao = telefoneCoordenacao;
		this.representanteCoordenacao = representanteCoordenacao;
		this.cargoRepresentante = cargoRepresentante;
		this.nomeUniversidade = nomeUniversidade;
		this.cnpj = cnpj;
		this.cep = cep;
		this.endereço = endereço;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.telefoneGeralUniversidade = telefoneGeralUniversidade;
		this.representanteUniversidade = representanteUniversidade;
		this.cargoRepresentanteUniversidade = cargoRepresentanteUniversidade;
	}
	
	public Curso() {
		
	}
	
	public String getCódigo() {
		return código;
	}

	public void setCódigo(String código) {
		this.código = código;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getTelefoneCoordenacao() {
		return telefoneCoordenacao;
	}

	public void setTelefoneCoordenacao(String telefoneCoordenacao) {
		this.telefoneCoordenacao = telefoneCoordenacao;
	}

	public String getRepresentanteCoordenacao() {
		return representanteCoordenacao;
	}

	public void setRepresentanteCoordenacao(String representanteCoordenacao) {
		this.representanteCoordenacao = representanteCoordenacao;
	}

	public String getCargoRepresentante() {
		return cargoRepresentante;
	}

	public void setCargoRepresentante(String cargoRepresentante) {
		this.cargoRepresentante = cargoRepresentante;
	}

	public String getNomeUniversidade() {
		return nomeUniversidade;
	}

	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public String getTelefoneGeralUniversidade() {
		return telefoneGeralUniversidade;
	}

	public void setTelefoneGeralUniversidade(String telefoneGeralUniversidade) {
		this.telefoneGeralUniversidade = telefoneGeralUniversidade;
	}

	public String getRepresentanteUniversidade() {
		return representanteUniversidade;
	}

	public void setRepresentanteUniversidade(String representanteUniversidade) {
		this.representanteUniversidade = representanteUniversidade;
	}

	public String getCargoRepresentanteUniversidade() {
		return cargoRepresentanteUniversidade;
	}

	public void setCargoRepresentanteUniversidade(String cargoRepresentanteUniversidade) {
		this.cargoRepresentanteUniversidade = cargoRepresentanteUniversidade;
	}
	
}
