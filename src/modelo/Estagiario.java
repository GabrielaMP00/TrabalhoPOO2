package modelo;

public class Estagiario {
	
	public Estagiario(String cPF, String nome, String sexo, String dataNasc, String telefoneCelular,
			String telefoneCasa, String cep, String endere�o, String bairro, String cidade, String curso,
			String dataIngresso) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.telefoneCelular = telefoneCelular;
		this.telefoneCasa = telefoneCasa;
		this.cep = cep;
		this.endere�o = endere�o;
		this.bairro = bairro;
		this.cidade = cidade;
		this.curso = curso;
		this.dataIngresso = dataIngresso;
	}
	
	private String CPF;
	
	private String nome;
	private String sexo;
	private String dataNasc;
	private String telefoneCelular;
	private String telefoneCasa;
	private String cep;
	private String endere�o;
	private String bairro;
	private String cidade;
	private String curso; 
	private String dataIngresso;
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	public String getTelefoneCasa() {
		return telefoneCasa;
	}
	
	public void setTelefoneCasa(String telefoneCasa) {
		this.telefoneCasa = telefoneCasa;
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
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getDataIngresso() {
		return dataIngresso;
	}
	
	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	
}
