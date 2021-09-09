package modelo;

public class TermoModel {
	
	private int idTermoModel;
	private String inicioEstagio;
	private String fimFstagio;
	private String chDiaria;
	private String chSemanal;
	private String areEstagio;
	private String horaInicioAtividadesEstagio;
	private String horaFimAtividadesEstagio;
	private String principaisAtividades;
	private String valorBolsa;
	private String beneficios;
	private String cpfAluno;
	private String cnpjConcedente; 
	private String nomeAluno;                                 /* Não editável pelo usuário */ 
	private String nomeCurso;                                 /* Não editável pelo usuário */ 
	private String nomeOrientador;                            /* Não editável pelo usuário */ 
	private String nomeUniversidade;                          /* Não editável pelo usuário */ 
	private String nomeRepresentanteUniversidade;             /* Não editável pelo usuário */ 
	private String razaSocialEmpresaConcedente;               /* Não editável pelo usuário */ 
	private String nomeRepresentanteEmpresaConcedenteEstagio; /* Não editável pelo usuário */  
	
	
	
	public TermoModel(String inicioEstagio, String fimFstagio, String chDiaria, String chSemanal,
			String areEstagio, String horaInicioAtividadesEstagio, String horaFimAtividadesEstagio,
			String principaisAtividades, String valorBolsa, String beneficios, String cpfAluno, String cnpjConcedente,
			String nomeAluno, String nomeCurso, String nomeOrientador, String nomeUniversidade,
			String nomeRepresentanteUniversidade, String razaSocialEmpresaConcedente,
			String nomeRepresentanteEmpresaConcedenteEstagio, int idTermoModel) {
		super();
		this.inicioEstagio = inicioEstagio;
		this.fimFstagio = fimFstagio;
		this.chDiaria = chDiaria;
		this.chSemanal = chSemanal;
		this.areEstagio = areEstagio;
		this.horaInicioAtividadesEstagio = horaInicioAtividadesEstagio;
		this.horaFimAtividadesEstagio = horaFimAtividadesEstagio;
		this.principaisAtividades = principaisAtividades;
		this.valorBolsa = valorBolsa;
		this.beneficios = beneficios;
		this.cpfAluno = cpfAluno;
		this.cnpjConcedente = cnpjConcedente;
		this.nomeAluno = nomeAluno;
		this.nomeCurso = nomeCurso;
		this.nomeOrientador = nomeOrientador;
		this.nomeUniversidade = nomeUniversidade;
		this.nomeRepresentanteUniversidade = nomeRepresentanteUniversidade;
		this.razaSocialEmpresaConcedente = razaSocialEmpresaConcedente;
		this.nomeRepresentanteEmpresaConcedenteEstagio = nomeRepresentanteEmpresaConcedenteEstagio;
		this.idTermoModel = idTermoModel;
	}
	
	public TermoModel(String cpfAluno,String nomeAluno, String nomeCurso, String nomeOrientador, String nomeUniversidade,
			String nomeRepresentanteUniversidade) {
		this.cpfAluno = cpfAluno;
		this.nomeAluno = nomeAluno;
		this.nomeCurso = nomeCurso;
		this.nomeOrientador = nomeOrientador;
		this.nomeUniversidade = nomeUniversidade;
		this.nomeRepresentanteUniversidade = nomeRepresentanteUniversidade;
	}
	
	public TermoModel(String razaSocialEmpresaConcedente,String nomeRepresentanteEmpresaConcedenteEstagio) {
		this.razaSocialEmpresaConcedente = razaSocialEmpresaConcedente;
		this.nomeRepresentanteEmpresaConcedenteEstagio = nomeRepresentanteEmpresaConcedenteEstagio;
	}
	
	public TermoModel() {
		
	}

	public int getIdTermoModel() {
		return idTermoModel;
	}

	public void setIdTermoModel(int idTermoModel) {
		this.idTermoModel = idTermoModel;
	}

	public String getInicioEstagio() {
		return inicioEstagio;
	}

	public void setInicioEstagio(String inicioEstagio) {
		this.inicioEstagio = inicioEstagio;
	}

	public String getFimFstagio() {
		return fimFstagio;
	}

	public void setFimFstagio(String fimFstagio) {
		this.fimFstagio = fimFstagio;
	}


	public String getChDiaria() {
		return chDiaria;
	}

	public void setChDiaria(String chDiaria) {
		this.chDiaria = chDiaria;
	}

	public String getChSemanal() {
		return chSemanal;
	}

	public void setChSemanal(String chSemanal) {
		this.chSemanal = chSemanal;
	}

	public void setValorBolsa(String valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

	public String getAreEstagio() {
		return areEstagio;
	}

	public void setAreEstagio(String areEstagio) {
		this.areEstagio = areEstagio;
	}

	public String getHoraInicioAtividadesEstagio() {
		return horaInicioAtividadesEstagio;
	}

	public void setHoraInicioAtividadesEstagio(String horaInicioAtividadesEstagio) {
		this.horaInicioAtividadesEstagio = horaInicioAtividadesEstagio;
	}

	public String getHoraFimAtividadesEstagio() {
		return horaFimAtividadesEstagio;
	}

	public void setHoraFimAtividadesEstagio(String horaFimAtividadesEstagio) {
		this.horaFimAtividadesEstagio = horaFimAtividadesEstagio;
	}

	public String getPrincipaisAtividades() {
		return principaisAtividades;
	}

	public void setPrincipaisAtividades(String principaisAtividades) {
		this.principaisAtividades = principaisAtividades;
	}

	public String getValorBolsa() {
		return valorBolsa;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getCnpjConcedente() {
		return cnpjConcedente;
	}

	public void setCnpjConcedente(String cnpjConcedente) {
		this.cnpjConcedente = cnpjConcedente;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeOrientador() {
		return nomeOrientador;
	}

	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}

	public String getNomeUniversidade() {
		return nomeUniversidade;
	}

	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}

	public String getNomeRepresentanteUniversidade() {
		return nomeRepresentanteUniversidade;
	}

	public void setNomeRepresentanteUniversidade(String nomeRepresentanteUniversidade) {
		this.nomeRepresentanteUniversidade = nomeRepresentanteUniversidade;
	}

	public String getRazaSocialEmpresaConcedente() {
		return razaSocialEmpresaConcedente;
	}

	public void setRazaSocialEmpresaConcedente(String razaSocialEmpresaConcedente) {
		this.razaSocialEmpresaConcedente = razaSocialEmpresaConcedente;
	}

	public String getNomeRepresentanteEmpresaConcedenteEstagio() {
		return nomeRepresentanteEmpresaConcedenteEstagio;
	}

	public void setNomeRepresentanteEmpresaConcedenteEstagio(String nomeRepresentanteEmpresaConcedenteEstagio) {
		this.nomeRepresentanteEmpresaConcedenteEstagio = nomeRepresentanteEmpresaConcedenteEstagio;
	}

	
}
