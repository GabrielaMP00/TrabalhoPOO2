package modelo;

public class Estagiario {

	public Estagiario(int idCurso, String cPF, String nome, String sexo, String dataNasc, String telefoneCelular,
			String telefoneCasa, String cep, String enderešo, String bairro, String cidade, String curso,
			String dataIngresso) {
		super();
		this.idCurso = idCurso;
		CPF = cPF;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.telefoneCelular = telefoneCelular;
		this.telefoneCasa = telefoneCasa;
		this.cep = cep;
		this.enderešo = enderešo;
		this.bairro = bairro;
		this.cidade = cidade;
		this.curso = curso;
		this.dataIngresso = dataIngresso;
	}

	public Estagiario() {

	}

	private int idCurso;
	private String CPF;
	private String nome;
	private String sexo;
	private String dataNasc;
	private String telefoneCelular;
	private String telefoneCasa;
	private String cep;
	private String enderešo;
	private String bairro;
	private String cidade;
	private String curso;
	private String dataIngresso;

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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