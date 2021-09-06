package visao;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TermoDeCompromisso extends JPanel {
	private JTextField textFieldInicio;
	private JTextField textFieldChSemanal;
	private JTextField textFieldHorarioDeFim;
	private JTextField textFieldBeneficios;
	private JTextField textFieldCurso;
	private JTextField textFieldRepresentanteUniversidade;
	private JTextField textFieldRepresentanteEmpresa;
	private JTextField textFieldFim;
	private JTextField textFieldChDiaria;
	private JTextField textFieldArea;
	private JTextField textFieldAtividades;
	private JTextField textFieldNomeAluno;
	private JTextField textFieldUniversidade;
	private JTextField textFieldCnpjEmpresa;
	private JTextField textFieldInfoComplementares;
	private JTextField textFieldHorarioDeInicio;
	private JTextField textFieldValor;
	private JTextField textFieldCpfAluno;
	private JTextField textFieldOrientador;
	private JTextField textFieldRazaoSocial;
	private JButton btnCadastrar;
	private JButton btnAtualizar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnRemover;
	
	/**
	 * Create the panel.
	 */
	public TermoDeCompromisso() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.SOUTH);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/add-documents (1).png")));
		btnCadastrar.setBackground(new Color(102, 204, 255));
		panel.add(btnCadastrar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(102, 204, 255));
		btnAtualizar.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/refresh (1).png")));
		panel.add(btnAtualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(102, 204, 255));
		btnConsultar.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/preview.png")));
		panel.add(btnConsultar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(102, 204, 255));
		btnLimpar.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/broom.png")));
		panel.add(btnLimpar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBackground(new Color(102, 204, 255));
		btnRemover.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/bin.png")));
		panel.add(btnRemover);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][grow][][grow][][grow]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("In\u00EDcio");
		panel_1.add(lblNewLabel, "cell 0 1,alignx center");
		
		textFieldInicio = new JTextField();
		panel_1.add(textFieldInicio, "cell 1 1,growx");
		textFieldInicio.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Fim");
		panel_1.add(lblNewLabel_7, "cell 2 1,alignx center");
		
		textFieldFim = new JTextField();
		panel_1.add(textFieldFim, "cell 3 1,growx");
		textFieldFim.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("CH Di\u00E1ria");
		panel_1.add(lblNewLabel_9, "cell 4 1,alignx center");
		
		textFieldChDiaria = new JTextField();
		panel_1.add(textFieldChDiaria, "cell 5 1,growx");
		textFieldChDiaria.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CH Semanal");
		panel_1.add(lblNewLabel_1, "cell 0 3,alignx center");
		
		textFieldChSemanal = new JTextField();
		panel_1.add(textFieldChSemanal, "cell 1 3,growx");
		textFieldChSemanal.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\u00C1rea");
		panel_1.add(lblNewLabel_8, "cell 2 3,alignx center");
		
		textFieldArea = new JTextField();
		panel_1.add(textFieldArea, "cell 3 3,growx");
		textFieldArea.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Hor\u00E1rio de In\u00EDcio");
		panel_1.add(lblNewLabel_15, "cell 4 3,alignx center");
		
		textFieldHorarioDeInicio = new JTextField();
		panel_1.add(textFieldHorarioDeInicio, "cell 5 3,growx");
		textFieldHorarioDeInicio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hor\u00E1rio de Fim");
		panel_1.add(lblNewLabel_2, "cell 0 5,alignx center");
		
		textFieldHorarioDeFim = new JTextField();
		panel_1.add(textFieldHorarioDeFim, "cell 1 5,growx");
		textFieldHorarioDeFim.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Atividades");
		panel_1.add(lblNewLabel_10, "cell 2 5,alignx center");
		
		textFieldAtividades = new JTextField();
		panel_1.add(textFieldAtividades, "cell 3 5,growx");
		textFieldAtividades.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Valor");
		panel_1.add(lblNewLabel_16, "cell 4 5,alignx center");
		
		textFieldValor = new JTextField();
		panel_1.add(textFieldValor, "cell 5 5,growx");
		textFieldValor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Benef\u00EDcios");
		panel_1.add(lblNewLabel_3, "cell 0 7,alignx center");
		
		textFieldBeneficios = new JTextField();
		panel_1.add(textFieldBeneficios, "cell 1 7,growx");
		textFieldBeneficios.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Nome Aluno");
		panel_1.add(lblNewLabel_11, "cell 2 7,alignx center");
		
		textFieldNomeAluno = new JTextField();
		panel_1.add(textFieldNomeAluno, "cell 3 7,growx");
		textFieldNomeAluno.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("CPF Aluno");
		panel_1.add(lblNewLabel_17, "cell 4 7,alignx center");
		
		textFieldCpfAluno = new JTextField();
		panel_1.add(textFieldCpfAluno, "cell 5 7,growx");
		textFieldCpfAluno.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Curso");
		panel_1.add(lblNewLabel_4, "cell 0 9,alignx center");
		
		textFieldCurso = new JTextField();
		panel_1.add(textFieldCurso, "cell 1 9,growx");
		textFieldCurso.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Universidade");
		panel_1.add(lblNewLabel_12, "cell 2 9,alignx center");
		
		textFieldUniversidade = new JTextField();
		panel_1.add(textFieldUniversidade, "cell 3 9,growx");
		textFieldUniversidade.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Orientador");
		panel_1.add(lblNewLabel_18, "cell 4 9,alignx center");
		
		textFieldOrientador = new JTextField();
		panel_1.add(textFieldOrientador, "cell 5 9,growx");
		textFieldOrientador.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Representante Universidade");
		panel_1.add(lblNewLabel_5, "cell 0 11,alignx center");
		
		textFieldRepresentanteUniversidade = new JTextField();
		panel_1.add(textFieldRepresentanteUniversidade, "cell 1 11,growx");
		textFieldRepresentanteUniversidade.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("CNPJ Empresa");
		panel_1.add(lblNewLabel_13, "cell 2 11,alignx center");
		
		textFieldCnpjEmpresa = new JTextField();
		panel_1.add(textFieldCnpjEmpresa, "cell 3 11,growx");
		textFieldCnpjEmpresa.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Raz\u00E3o Social");
		panel_1.add(lblNewLabel_19, "cell 4 11,alignx center");
		
		textFieldRazaoSocial = new JTextField();
		panel_1.add(textFieldRazaoSocial, "cell 5 11,growx");
		textFieldRazaoSocial.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Representante Empresa");
		panel_1.add(lblNewLabel_6, "cell 0 13,alignx center");
		
		textFieldRepresentanteEmpresa = new JTextField();
		panel_1.add(textFieldRepresentanteEmpresa, "cell 1 13,grow");
		textFieldRepresentanteEmpresa.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Info. Complementares");
		panel_1.add(lblNewLabel_14, "cell 2 13,alignx center");
		
		textFieldInfoComplementares = new JTextField();
		panel_1.add(textFieldInfoComplementares, "cell 3 13,growx");
		textFieldInfoComplementares.setColumns(10);

	}

	public JTextField getTextFieldInicio() {
		return textFieldInicio;
	}

	public void setTextFieldInicio(JTextField textFieldInicio) {
		this.textFieldInicio = textFieldInicio;
	}

	public JTextField getTextFieldChSemanal() {
		return textFieldChSemanal;
	}

	public void setTextFieldChSemanal(JTextField textFieldChSemanal) {
		this.textFieldChSemanal = textFieldChSemanal;
	}

	public JTextField getTextFieldHorarioDeFim() {
		return textFieldHorarioDeFim;
	}

	public void setTextFieldHorarioDeFim(JTextField textFieldHorarioDeFim) {
		this.textFieldHorarioDeFim = textFieldHorarioDeFim;
	}

	public JTextField getTextFieldBeneficios() {
		return textFieldBeneficios;
	}

	public void setTextFieldBeneficios(JTextField textFieldBeneficios) {
		this.textFieldBeneficios = textFieldBeneficios;
	}

	public JTextField getTextFieldCurso() {
		return textFieldCurso;
	}

	public void setTextFieldCurso(JTextField textFieldCurso) {
		this.textFieldCurso = textFieldCurso;
	}

	public JTextField getTextFieldRepresentanteUniversidade() {
		return textFieldRepresentanteUniversidade;
	}

	public void setTextFieldRepresentanteUniversidade(JTextField textFieldRepresentanteUniversidade) {
		this.textFieldRepresentanteUniversidade = textFieldRepresentanteUniversidade;
	}

	public JTextField getTextFieldRepresentanteEmpresa() {
		return textFieldRepresentanteEmpresa;
	}

	public void setTextFieldRepresentanteEmpresa(JTextField textFieldRepresentanteEmpresa) {
		this.textFieldRepresentanteEmpresa = textFieldRepresentanteEmpresa;
	}

	public JTextField getTextFieldFim() {
		return textFieldFim;
	}

	public void setTextFieldFim(JTextField textFieldFim) {
		this.textFieldFim = textFieldFim;
	}

	public JTextField getTextFieldChDiaria() {
		return textFieldChDiaria;
	}

	public void setTextFieldChDiaria(JTextField textFieldChDiaria) {
		this.textFieldChDiaria = textFieldChDiaria;
	}

	public JTextField getTextFieldArea() {
		return textFieldArea;
	}

	public void setTextFieldArea(JTextField textFieldArea) {
		this.textFieldArea = textFieldArea;
	}

	public JTextField getTextFieldAtividades() {
		return textFieldAtividades;
	}

	public void setTextFieldAtividades(JTextField textFieldAtividades) {
		this.textFieldAtividades = textFieldAtividades;
	}

	public JTextField getTextFieldNomeAluno() {
		return textFieldNomeAluno;
	}

	public void setTextFieldNomeAluno(JTextField textFieldNomeAluno) {
		this.textFieldNomeAluno = textFieldNomeAluno;
	}

	public JTextField getTextFieldUniversidade() {
		return textFieldUniversidade;
	}

	public void setTextFieldUniversidade(JTextField textFieldUniversidade) {
		this.textFieldUniversidade = textFieldUniversidade;
	}

	public JTextField getTextFieldCnpjEmpresa() {
		return textFieldCnpjEmpresa;
	}

	public void setTextFieldCnpjEmpresa(JTextField textFieldCnpjEmpresa) {
		this.textFieldCnpjEmpresa = textFieldCnpjEmpresa;
	}

	public JTextField getTextFieldInfoComplementares() {
		return textFieldInfoComplementares;
	}

	public void setTextFieldInfoComplementares(JTextField textFieldInfoComplementares) {
		this.textFieldInfoComplementares = textFieldInfoComplementares;
	}

	public JTextField getTextFieldHorarioDeInicio() {
		return textFieldHorarioDeInicio;
	}

	public void setTextFieldHorarioDeInicio(JTextField textFieldHorarioDeInicio) {
		this.textFieldHorarioDeInicio = textFieldHorarioDeInicio;
	}

	public JTextField getTextFieldValor() {
		return textFieldValor;
	}

	public void setTextFieldValor(JTextField textFieldValor) {
		this.textFieldValor = textFieldValor;
	}

	public JTextField getTextFieldCpfAluno() {
		return textFieldCpfAluno;
	}

	public void setTextFieldCpfAluno(JTextField textFieldCpfAluno) {
		this.textFieldCpfAluno = textFieldCpfAluno;
	}

	public JTextField getTextFieldOrientador() {
		return textFieldOrientador;
	}

	public void setTextFieldOrientador(JTextField textFieldOrientador) {
		this.textFieldOrientador = textFieldOrientador;
	}

	public JTextField getTextFieldRazaoSocial() {
		return textFieldRazaoSocial;
	}

	public void setTextFieldRazaoSocial(JTextField textFieldRazaoSocial) {
		this.textFieldRazaoSocial = textFieldRazaoSocial;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JButton getBtnRemover() {
		return btnRemover;
	}

	public void setBtnRemover(JButton btnRemover) {
		this.btnRemover = btnRemover;
	}

}