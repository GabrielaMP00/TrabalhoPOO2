package modelo;

public class FormularioEstagio {
	private String Nome_CoordenadorUFCSPA;
	private String CPF_CoordenadorUFCSPA;
	private String RG_CoordenadorUFCSPA;
	
	private String Nome_EmpresaContratante;
	private String CNPJ_EmpresaContratante;
	private String Endereco_EmpresaContratante;
	private String CEP_EmpresaContratante;
	private String Cidade_EmpresaContratante;
	private String Contratante_EmpresaContratante;
	private String CargoContratante_EmpresaContratante;
	private String CPFContratante_EmpresaContratante;
	private String RGContratante_EmpresaContratante;
	
	private String Nome_Estudante;
	private String Nascimento_Estudante;
	private String RG_Estudante;
	private String CPF_Estudante;
	private String Endereco_Estudante;
	private String Cidade_Estudante;
	private String CEP_Estudante;
	private String Bairro_Estudante;
	private String Matricula_Estudante;
	private String Semestre_Estudante;
	
	private String Atuacao_Estagio;
	private String Inicio_Estagio;
	private String Termino_Estagio;
	private String CargaHoraria_Estagio;
	private String ValorDaolsa_Estagio;
	private String ValorValeTransporte_Estagio;
	private String ValorValeRefeicao_Estagio;
	private String Seguradora_Estagio;
	private String Apolice_Estagio;
	private String ProfessorResponsavel_Estagio;
	private String SIAPE_Estagio;
	private String OrientadorResponsavel_Estagio;
	private String CargoOrientador_Estagio;
	
	private String comboBox_Curso_CoordenadorUFCSPA;
	private String comboBox_Cadastro_UF_EmpresaContratante;
	private String comboBox_Cadastro_UF_Estudante;
	private String comboBox_Cadastro_Curso_Estudante;
	
	private String textPane_AtividadesRealizadas_Estagio;
	
	private String valeRefeicao;
	private String valeTransporte;
	private String SeguroAcidente;
	private String EstagioObrigatorio;
	private String cursoCoordenador;
	private String curdoEstudante;	
	
	public FormularioEstagio() {}

	public FormularioEstagio(String nome_CoordenadorUFCSPA, String cPF_CoordenadorUFCSPA, String rG_CoordenadorUFCSPA,
			String nome_EmpresaContratante, String cNPJ_EmpresaContratante, String endereco_EmpresaContratante,
			String cEP_EmpresaContratante, String cidade_EmpresaContratante, String contratante_EmpresaContratante,
			String cargoContratante_EmpresaContratante, String cPFContratante_EmpresaContratante,
			String rGContratante_EmpresaContratante, String nome_Estudante, String nascimento_Estudante,
			String rG_Estudante, String cPF_Estudante, String endereco_Estudante, String cidade_Estudante,
			String cEP_Estudante, String bairro_Estudante, String matricula_Estudante, String semestre_Estudante,
			String atuacao_Estagio, String inicio_Estagio, String termino_Estagio, String cargaHoraria_Estagio,
			String valorDaolsa_Estagio, String valorValeTransporte_Estagio, String valorValeRefeicao_Estagio,
			String seguradora_Estagio, String apolice_Estagio, String professorResponsavel_Estagio,
			String sIAPE_Estagio, String orientadorResponsavel_Estagio, String cargoOrientador_Estagio,
			String comboBox_Curso_CoordenadorUFCSPA, String comboBox_Cadastro_UF_EmpresaContratante,
			String comboBox_Cadastro_UF_Estudante, String comboBox_Cadastro_Curso_Estudante,
			String textPane_AtividadesRealizadas_Estagio, String valeRefeicao, String valeTransporte,
			String seguroAcidente, String estagioObrigatorio) {
		super();
		Nome_CoordenadorUFCSPA = nome_CoordenadorUFCSPA;
		CPF_CoordenadorUFCSPA = cPF_CoordenadorUFCSPA;
		RG_CoordenadorUFCSPA = rG_CoordenadorUFCSPA;
		Nome_EmpresaContratante = nome_EmpresaContratante;
		CNPJ_EmpresaContratante = cNPJ_EmpresaContratante;
		Endereco_EmpresaContratante = endereco_EmpresaContratante;
		CEP_EmpresaContratante = cEP_EmpresaContratante;
		Cidade_EmpresaContratante = cidade_EmpresaContratante;
		Contratante_EmpresaContratante = contratante_EmpresaContratante;
		CargoContratante_EmpresaContratante = cargoContratante_EmpresaContratante;
		CPFContratante_EmpresaContratante = cPFContratante_EmpresaContratante;
		RGContratante_EmpresaContratante = rGContratante_EmpresaContratante;
		Nome_Estudante = nome_Estudante;
		Nascimento_Estudante = nascimento_Estudante;
		RG_Estudante = rG_Estudante;
		CPF_Estudante = cPF_Estudante;
		Endereco_Estudante = endereco_Estudante;
		Cidade_Estudante = cidade_Estudante;
		CEP_Estudante = cEP_Estudante;
		Bairro_Estudante = bairro_Estudante;
		Matricula_Estudante = matricula_Estudante;
		Semestre_Estudante = semestre_Estudante;
		Atuacao_Estagio = atuacao_Estagio;
		Inicio_Estagio = inicio_Estagio;
		Termino_Estagio = termino_Estagio;
		CargaHoraria_Estagio = cargaHoraria_Estagio;
		ValorDaolsa_Estagio = valorDaolsa_Estagio;
		ValorValeTransporte_Estagio = valorValeTransporte_Estagio;
		ValorValeRefeicao_Estagio = valorValeRefeicao_Estagio;
		Seguradora_Estagio = seguradora_Estagio;
		Apolice_Estagio = apolice_Estagio;
		ProfessorResponsavel_Estagio = professorResponsavel_Estagio;
		SIAPE_Estagio = sIAPE_Estagio;
		OrientadorResponsavel_Estagio = orientadorResponsavel_Estagio;
		CargoOrientador_Estagio = cargoOrientador_Estagio;
		this.comboBox_Curso_CoordenadorUFCSPA = comboBox_Curso_CoordenadorUFCSPA;
		this.comboBox_Cadastro_UF_EmpresaContratante = comboBox_Cadastro_UF_EmpresaContratante;
		this.comboBox_Cadastro_UF_Estudante = comboBox_Cadastro_UF_Estudante;
		this.comboBox_Cadastro_Curso_Estudante = comboBox_Cadastro_Curso_Estudante;
		this.textPane_AtividadesRealizadas_Estagio = textPane_AtividadesRealizadas_Estagio;
		this.valeRefeicao = valeRefeicao;
		this.valeTransporte = valeTransporte;
		SeguroAcidente = seguroAcidente;
		EstagioObrigatorio = estagioObrigatorio;
	}

	public String getNome_CoordenadorUFCSPA() {
		return Nome_CoordenadorUFCSPA;
	}

	public void setNome_CoordenadorUFCSPA(String nome_CoordenadorUFCSPA) {
		Nome_CoordenadorUFCSPA = nome_CoordenadorUFCSPA;
	}

	public String getCPF_CoordenadorUFCSPA() {
		return CPF_CoordenadorUFCSPA;
	}

	public void setCPF_CoordenadorUFCSPA(String cPF_CoordenadorUFCSPA) {
		CPF_CoordenadorUFCSPA = cPF_CoordenadorUFCSPA;
	}

	public String getRG_CoordenadorUFCSPA() {
		return RG_CoordenadorUFCSPA;
	}

	public void setRG_CoordenadorUFCSPA(String rG_CoordenadorUFCSPA) {
		RG_CoordenadorUFCSPA = rG_CoordenadorUFCSPA;
	}

	public String getNome_EmpresaContratante() {
		return Nome_EmpresaContratante;
	}

	public void setNome_EmpresaContratante(String nome_EmpresaContratante) {
		Nome_EmpresaContratante = nome_EmpresaContratante;
	}

	public String getCNPJ_EmpresaContratante() {
		return CNPJ_EmpresaContratante;
	}

	public void setCNPJ_EmpresaContratante(String cNPJ_EmpresaContratante) {
		CNPJ_EmpresaContratante = cNPJ_EmpresaContratante;
	}

	public String getEndereco_EmpresaContratante() {
		return Endereco_EmpresaContratante;
	}

	public void setEndereco_EmpresaContratante(String endereco_EmpresaContratante) {
		Endereco_EmpresaContratante = endereco_EmpresaContratante;
	}

	public String getCEP_EmpresaContratante() {
		return CEP_EmpresaContratante;
	}

	public void setCEP_EmpresaContratante(String cEP_EmpresaContratante) {
		CEP_EmpresaContratante = cEP_EmpresaContratante;
	}

	public String getCidade_EmpresaContratante() {
		return Cidade_EmpresaContratante;
	}

	public void setCidade_EmpresaContratante(String cidade_EmpresaContratante) {
		Cidade_EmpresaContratante = cidade_EmpresaContratante;
	}

	public String getContratante_EmpresaContratante() {
		return Contratante_EmpresaContratante;
	}

	public void setContratante_EmpresaContratante(String contratante_EmpresaContratante) {
		Contratante_EmpresaContratante = contratante_EmpresaContratante;
	}

	public String getCargoContratante_EmpresaContratante() {
		return CargoContratante_EmpresaContratante;
	}

	public void setCargoContratante_EmpresaContratante(String cargoContratante_EmpresaContratante) {
		CargoContratante_EmpresaContratante = cargoContratante_EmpresaContratante;
	}

	public String getCPFContratante_EmpresaContratante() {
		return CPFContratante_EmpresaContratante;
	}

	public void setCPFContratante_EmpresaContratante(String cPFContratante_EmpresaContratante) {
		CPFContratante_EmpresaContratante = cPFContratante_EmpresaContratante;
	}

	public String getRGContratante_EmpresaContratante() {
		return RGContratante_EmpresaContratante;
	}

	public void setRGContratante_EmpresaContratante(String rGContratante_EmpresaContratante) {
		RGContratante_EmpresaContratante = rGContratante_EmpresaContratante;
	}

	public String getNome_Estudante() {
		return Nome_Estudante;
	}

	public void setNome_Estudante(String nome_Estudante) {
		Nome_Estudante = nome_Estudante;
	}

	public String getNascimento_Estudante() {
		return Nascimento_Estudante;
	}

	public void setNascimento_Estudante(String nascimento_Estudante) {
		Nascimento_Estudante = nascimento_Estudante;
	}

	public String getRG_Estudante() {
		return RG_Estudante;
	}

	public void setRG_Estudante(String rG_Estudante) {
		RG_Estudante = rG_Estudante;
	}

	public String getCPF_Estudante() {
		return CPF_Estudante;
	}

	public void setCPF_Estudante(String cPF_Estudante) {
		CPF_Estudante = cPF_Estudante;
	}

	public String getEndereco_Estudante() {
		return Endereco_Estudante;
	}

	public void setEndereco_Estudante(String endereco_Estudante) {
		Endereco_Estudante = endereco_Estudante;
	}

	public String getCidade_Estudante() {
		return Cidade_Estudante;
	}

	public void setCidade_Estudante(String cidade_Estudante) {
		Cidade_Estudante = cidade_Estudante;
	}

	public String getCEP_Estudante() {
		return CEP_Estudante;
	}

	public void setCEP_Estudante(String cEP_Estudante) {
		CEP_Estudante = cEP_Estudante;
	}

	public String getBairro_Estudante() {
		return Bairro_Estudante;
	}

	public void setBairro_Estudante(String bairro_Estudante) {
		Bairro_Estudante = bairro_Estudante;
	}

	public String getMatricula_Estudante() {
		return Matricula_Estudante;
	}

	public void setMatricula_Estudante(String matricula_Estudante) {
		Matricula_Estudante = matricula_Estudante;
	}

	public String getSemestre_Estudante() {
		return Semestre_Estudante;
	}

	public void setSemestre_Estudante(String semestre_Estudante) {
		Semestre_Estudante = semestre_Estudante;
	}

	public String getAtuacao_Estagio() {
		return Atuacao_Estagio;
	}

	public void setAtuacao_Estagio(String atuacao_Estagio) {
		Atuacao_Estagio = atuacao_Estagio;
	}

	public String getInicio_Estagio() {
		return Inicio_Estagio;
	}

	public void setInicio_Estagio(String inicio_Estagio) {
		Inicio_Estagio = inicio_Estagio;
	}

	public String getTermino_Estagio() {
		return Termino_Estagio;
	}

	public void setTermino_Estagio(String termino_Estagio) {
		Termino_Estagio = termino_Estagio;
	}

	public String getCargaHoraria_Estagio() {
		return CargaHoraria_Estagio;
	}

	public void setCargaHoraria_Estagio(String cargaHoraria_Estagio) {
		CargaHoraria_Estagio = cargaHoraria_Estagio;
	}

	public String getValorDaolsa_Estagio() {
		return ValorDaolsa_Estagio;
	}

	public void setValorDaolsa_Estagio(String valorDaolsa_Estagio) {
		ValorDaolsa_Estagio = valorDaolsa_Estagio;
	}

	public String getValorValeTransporte_Estagio() {
		return ValorValeTransporte_Estagio;
	}

	public void setValorValeTransporte_Estagio(String valorValeTransporte_Estagio) {
		ValorValeTransporte_Estagio = valorValeTransporte_Estagio;
	}

	public String getValorValeRefeicao_Estagio() {
		return ValorValeRefeicao_Estagio;
	}

	public void setValorValeRefeicao_Estagio(String valorValeRefeicao_Estagio) {
		ValorValeRefeicao_Estagio = valorValeRefeicao_Estagio;
	}

	public String getSeguradora_Estagio() {
		return Seguradora_Estagio;
	}

	public void setSeguradora_Estagio(String seguradora_Estagio) {
		Seguradora_Estagio = seguradora_Estagio;
	}

	public String getApolice_Estagio() {
		return Apolice_Estagio;
	}

	public void setApolice_Estagio(String apolice_Estagio) {
		Apolice_Estagio = apolice_Estagio;
	}

	public String getProfessorResponsavel_Estagio() {
		return ProfessorResponsavel_Estagio;
	}

	public void setProfessorResponsavel_Estagio(String professorResponsavel_Estagio) {
		ProfessorResponsavel_Estagio = professorResponsavel_Estagio;
	}

	public String getSIAPE_Estagio() {
		return SIAPE_Estagio;
	}

	public void setSIAPE_Estagio(String sIAPE_Estagio) {
		SIAPE_Estagio = sIAPE_Estagio;
	}

	public String getOrientadorResponsavel_Estagio() {
		return OrientadorResponsavel_Estagio;
	}

	public void setOrientadorResponsavel_Estagio(String orientadorResponsavel_Estagio) {
		OrientadorResponsavel_Estagio = orientadorResponsavel_Estagio;
	}

	public String getCargoOrientador_Estagio() {
		return CargoOrientador_Estagio;
	}

	public void setCargoOrientador_Estagio(String cargoOrientador_Estagio) {
		CargoOrientador_Estagio = cargoOrientador_Estagio;
	}

	public String getComboBox_Curso_CoordenadorUFCSPA() {
		return comboBox_Curso_CoordenadorUFCSPA;
	}

	public void setComboBox_Curso_CoordenadorUFCSPA(String comboBox_Curso_CoordenadorUFCSPA) {
		this.comboBox_Curso_CoordenadorUFCSPA = comboBox_Curso_CoordenadorUFCSPA;
	}

	public String getComboBox_Cadastro_UF_EmpresaContratante() {
		return comboBox_Cadastro_UF_EmpresaContratante;
	}

	public void setComboBox_Cadastro_UF_EmpresaContratante(String comboBox_Cadastro_UF_EmpresaContratante) {
		this.comboBox_Cadastro_UF_EmpresaContratante = comboBox_Cadastro_UF_EmpresaContratante;
	}

	public String getComboBox_Cadastro_UF_Estudante() {
		return comboBox_Cadastro_UF_Estudante;
	}

	public void setComboBox_Cadastro_UF_Estudante(String comboBox_Cadastro_UF_Estudante) {
		this.comboBox_Cadastro_UF_Estudante = comboBox_Cadastro_UF_Estudante;
	}

	public String getComboBox_Cadastro_Curso_Estudante() {
		return comboBox_Cadastro_Curso_Estudante;
	}

	public void setComboBox_Cadastro_Curso_Estudante(String comboBox_Cadastro_Curso_Estudante) {
		this.comboBox_Cadastro_Curso_Estudante = comboBox_Cadastro_Curso_Estudante;
	}

	public String getTextPane_AtividadesRealizadas_Estagio() {
		return textPane_AtividadesRealizadas_Estagio;
	}

	public void setTextPane_AtividadesRealizadas_Estagio(String textPane_AtividadesRealizadas_Estagio) {
		this.textPane_AtividadesRealizadas_Estagio = textPane_AtividadesRealizadas_Estagio;
	}

	public String getValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(String valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}

	public String getValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(String valeTransporte) {
		this.valeTransporte = valeTransporte;
	}

	public String getSeguroAcidente() {
		return SeguroAcidente;
	}

	public void setSeguroAcidente(String seguroAcidente) {
		SeguroAcidente = seguroAcidente;
	}

	public String getEstagioObrigatorio() {
		return EstagioObrigatorio;
	}

	public void setEstagioObrigatorio(String estagioObrigatorio) {
		EstagioObrigatorio = estagioObrigatorio;
	}

	public String getCursoCoordenador() {
		return cursoCoordenador;
	}

	public void setCursoCoordenador(String cursoCoordenador) {
		this.cursoCoordenador = cursoCoordenador;
	}

	public String getCurdoEstudante() {
		return curdoEstudante;
	}

	public void setCurdoEstudante(String curdoEstudante) {
		this.curdoEstudante = curdoEstudante;
	}	
}	
