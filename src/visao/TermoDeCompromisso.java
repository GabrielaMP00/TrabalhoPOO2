package visao;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

import java.awt.Font;

import javax.swing.UIManager;

public class TermoDeCompromisso extends JPanel {
	
	private JTextField textFieldChSemanal;
	private JTextField textFieldBeneficios;
	private JTextField textFieldCurso;
	private JTextField textFieldRepresentanteUniversidade;
	private JTextField textFieldRepresentanteEmpresa;
	private JTextField textFieldChDiaria;
	private JTextField textFieldArea;
	private JTextField textFieldAtividades;
	private JTextField textFieldNomeAluno;
	private JTextField textFieldUniversidade;
	private JTextField textFieldInfoComplementares;
	private JTextField textFieldOrientador;
	private JTextField textFieldRazaoSocial;
	private JTextField textFieldCpfAluno;
	private JTextField textFieldCnpjEmpresa;
	private JButton btnCadastrar;
	private JButton btnAtualizar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnRemover;
	private JLabel labelTermoDeCompromisso;
	private JFormattedTextField formattedTextFieldInicio;
	private JFormattedTextField formattedTextFieldHorarioDeFim;
	private JFormattedTextField formattedTextFieldFim;
	private JFormattedTextField formattedTextFieldHorarioDeInicio;
	private JFormattedTextField formattedTextFieldValor;
	/**
	 * Create the panel.
	 */
	public TermoDeCompromisso() {
		setLayout(new BorderLayout(0, 0));
		setBounds(100, 100, 950, 550);
		
		JPanel panelBotoes = new JPanel();
		panelBotoes.setBackground(UIManager.getColor("Button.background"));
		add(panelBotoes, BorderLayout.SOUTH);
		
		//ADICIONANDO BOTOES
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/add-documents (1).png")));
		btnCadastrar.setBackground(new Color(102, 204, 255));
		panelBotoes.add(btnCadastrar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(102, 204, 255));
		btnAtualizar.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/refresh (1).png")));
		panelBotoes.add(btnAtualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(102, 204, 255));
		btnConsultar.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/preview.png")));
		panelBotoes.add(btnConsultar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(102, 204, 255));
		btnLimpar.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/eraser32.png")));
		panelBotoes.add(btnLimpar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBackground(new Color(102, 204, 255));
		btnRemover.setIcon(new ImageIcon(TermoDeCompromisso.class.getResource("/icones_logos/trash32.png")));
		panelBotoes.add(btnRemover);
		
		// ADICIONANDO OS LABELS
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(135, 206, 235)));
		panelPrincipal.setBackground(new Color(240, 248, 255));
		add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new MigLayout("", "[24.00][346.00][36.00,grow][348.00][44.00][211.00][31.00,grow]", "[76.00][][][][][][][][][][][][][][][][][][][]"));
		
		labelTermoDeCompromisso = new JLabel("Termo De Compromisso");
		labelTermoDeCompromisso.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panelPrincipal.add(labelTermoDeCompromisso, "cell 0 0 7 1,alignx center");
		
		JLabel labelInicio = new JLabel("In\u00EDcio");
		labelInicio.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelInicio, "flowx,cell 1 1,alignx left");
		
		JLabel labelFim = new JLabel("Fim");
		labelFim.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelFim, "flowx,cell 3 1,alignx left");
		
		JLabel labelChDiaria = new JLabel("CH Di\u00E1ria");
		labelChDiaria.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelChDiaria, "flowx,cell 5 1,alignx left");
		
		JLabel labelChSemanal = new JLabel("CH Semanal");
		labelChSemanal.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelChSemanal, "flowx,cell 1 3,alignx left");
		
		JLabel labelArea = new JLabel("\u00C1rea");
		labelArea.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelArea, "flowx,cell 3 3,alignx left");
		
		JLabel labelHorarioDeInicio = new JLabel("Hor\u00E1rio de In\u00EDcio");
		labelHorarioDeInicio.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelHorarioDeInicio, "flowx,cell 5 3,alignx left");
		
		JLabel labelHorarioDeFim = new JLabel("Hor\u00E1rio de Fim");
		labelHorarioDeFim.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelHorarioDeFim, "flowx,cell 1 5,alignx left");
		
		JLabel labelAtividades = new JLabel("Atividades");
		labelAtividades.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelAtividades, "flowx,cell 3 5,alignx left");
		
		JLabel labelValor = new JLabel("Valor");
		labelValor.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelValor, "flowx,cell 5 5,alignx left");
		
		JLabel labelBeneficios = new JLabel("Benef\u00EDcios");
		labelBeneficios.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelBeneficios, "flowx,cell 1 7,alignx left");
		
		JLabel labelNomeAluno = new JLabel("Nome Aluno");
		labelNomeAluno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelNomeAluno, "flowx,cell 3 7,alignx left");
		
		JLabel labelCpfAluno = new JLabel("CPF Aluno");
		labelCpfAluno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCpfAluno, "flowx,cell 5 7,alignx left");
		
		JLabel labelCurso = new JLabel("Curso");
		labelCurso.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCurso, "flowx,cell 1 9,alignx left");
		
		JLabel labelUniversidade = new JLabel("Universidade");
		labelUniversidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelUniversidade, "flowx,cell 3 9,alignx left");
		
		JLabel labelRazaoSocial = new JLabel("Raz\u00E3o Social");
		labelRazaoSocial.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelRazaoSocial, "flowx,cell 5 9,alignx left");
		
		JLabel labelCnpjEmpresa = new JLabel("CNPJ Empresa");
		labelCnpjEmpresa.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCnpjEmpresa, "flowx,cell 1 11,alignx left");
		
		JLabel labelOrientador = new JLabel("Orientador");
		labelOrientador.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelOrientador, "flowx,cell 3 11,alignx left, spanx 3");
		
		JLabel labelRepresentanteUniversidade = new JLabel("Representante da Universidade");
		labelRepresentanteUniversidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelRepresentanteUniversidade, "flowx,cell 1 13,alignx left, spanx 5");
		
		JLabel labelRepresentanteEmpresa = new JLabel("Representante da Empresa");
		labelRepresentanteEmpresa.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelRepresentanteEmpresa, "flowx,cell 1 15,alignx left, spanx 5");
		
		JLabel labelInfoComplementares = new JLabel("Informa\u00E7\u00F5es Complementares");
		labelInfoComplementares.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelInfoComplementares, "flowx,cell 1 17,alignx left, spanx 5");
		
		// ADICIONANDO TEXTFIELDS
		
		textFieldChSemanal = new JTextField();
		textFieldChSemanal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldChSemanal, "cell 1 3,growx");
		textFieldChSemanal.setColumns(10);
		
		textFieldBeneficios = new JTextField();
		textFieldBeneficios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldBeneficios, "cell 1 7,growx");
		textFieldBeneficios.setColumns(10);
		
		textFieldCurso = new JTextField();
		textFieldCurso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCurso, "cell 1 9,growx");
		textFieldCurso.setColumns(10);
		textFieldCurso.setEditable(false);
		
		textFieldAtividades = new JTextField();
		textFieldAtividades.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldAtividades, "cell 3 5,growx");
		textFieldAtividades.setColumns(10);
		
		textFieldNomeAluno = new JTextField();
		textFieldNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldNomeAluno, "cell 3 7,growx");
		textFieldNomeAluno.setColumns(10);
		textFieldNomeAluno.setEditable(false);
		
		textFieldUniversidade = new JTextField();
		textFieldUniversidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldUniversidade, "cell 3 9,growx");
		textFieldUniversidade.setColumns(10);
		textFieldUniversidade.setEditable(false);
		
		textFieldChDiaria = new JTextField();
		textFieldChDiaria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldChDiaria, "cell 5 1,growx");
		textFieldChDiaria.setColumns(10);
		
		textFieldArea = new JTextField();
		textFieldArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldArea, "cell 3 3,growx");
		textFieldArea.setColumns(10);

		textFieldOrientador = new JTextField();
		textFieldOrientador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldOrientador, "cell 3 11 3 1,growx");
		textFieldOrientador.setColumns(10);
		textFieldOrientador.setEditable(false);
		
		textFieldRazaoSocial = new JTextField();
		textFieldRazaoSocial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldRazaoSocial, "cell 5 9,growx");
		textFieldRazaoSocial.setColumns(10);
		textFieldRazaoSocial.setEditable(false);
		
		textFieldRepresentanteUniversidade = new JTextField();
		textFieldRepresentanteUniversidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldRepresentanteUniversidade, "cell 1 13 5 1,growx");
		textFieldRepresentanteUniversidade.setColumns(10);
		textFieldRepresentanteUniversidade.setEditable(false);
		
		textFieldRepresentanteEmpresa = new JTextField();
		textFieldRepresentanteEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldRepresentanteEmpresa, "cell 1 15 5 1,grow");
		textFieldRepresentanteEmpresa.setColumns(10);
		textFieldRepresentanteEmpresa.setEditable(false);
		
		textFieldInfoComplementares = new JTextField();
		textFieldInfoComplementares.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldInfoComplementares, "cell 1 17 5 1,growx");
		textFieldInfoComplementares.setColumns(10);
		
		textFieldCnpjEmpresa = new JTextField();
		textFieldCnpjEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCnpjEmpresa, "cell 1 11,growx");
		textFieldCnpjEmpresa.setColumns(10);
		
		textFieldCpfAluno = new JTextField();
		textFieldCpfAluno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCpfAluno, "cell 5 7,growx");
		textFieldCpfAluno.setColumns(10);
		
		// ADICIONANDO MASCARA NOS TEXTFIELDS QUE POSSUEM FORMATA\C7\C3O
		
		MaskFormatter mascaraInicio;
		MaskFormatter mascaraHorarioDeFim;
		MaskFormatter mascaraFim;
		MaskFormatter mascaraHorarioDeInicio;
		MaskFormatter mascaraValor;
				
		try {
			mascaraInicio= new MaskFormatter("##/##/####");		 
			mascaraInicio.setPlaceholder(" ");
			mascaraHorarioDeFim = new MaskFormatter("##:##");
			mascaraHorarioDeFim.setPlaceholder(" ");
			mascaraFim= new MaskFormatter("##:##");		 
		    mascaraFim.setPlaceholder(" ");
			mascaraHorarioDeInicio = new MaskFormatter("##:##");	 
		    mascaraHorarioDeInicio.setPlaceholder(" ");
			mascaraValor = new MaskFormatter("R$###");
			mascaraValor.setPlaceholder(" ");
			
			formattedTextFieldInicio = new JFormattedTextField(mascaraInicio);
			formattedTextFieldInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldInicio, "cell 1 1,growx");
			formattedTextFieldHorarioDeFim = new JFormattedTextField(mascaraFim);
			formattedTextFieldHorarioDeFim.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldHorarioDeFim, "cell 1 5,growx");
			formattedTextFieldFim = new JFormattedTextField(mascaraFim);
			formattedTextFieldFim.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldFim, "cell 3 1,growx");
			formattedTextFieldHorarioDeInicio = new JFormattedTextField(mascaraHorarioDeInicio);
			formattedTextFieldHorarioDeInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldHorarioDeInicio, "cell 5 3,growx");
			formattedTextFieldValor = new JFormattedTextField(mascaraValor);
			formattedTextFieldValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldValor, "cell 5 5,growx");

		} catch (ParseException e) {
			e.printStackTrace();
		}
	

	}
	//GETTERS E SETTERS
	
	public JTextField getTextFieldChSemanal() {
		return textFieldChSemanal;
	}
	public void setTextFieldChSemanal(JTextField textFieldChSemanal) {
		this.textFieldChSemanal = textFieldChSemanal;
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
	public void setTextFieldRepresentanteUniversidade(
			JTextField textFieldRepresentanteUniversidade) {
		this.textFieldRepresentanteUniversidade = textFieldRepresentanteUniversidade;
	}
	public JTextField getTextFieldRepresentanteEmpresa() {
		return textFieldRepresentanteEmpresa;
	}
	public void setTextFieldRepresentanteEmpresa(
			JTextField textFieldRepresentanteEmpresa) {
		this.textFieldRepresentanteEmpresa = textFieldRepresentanteEmpresa;
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
	public JTextField getTextFieldInfoComplementares() {
		return textFieldInfoComplementares;
	}
	public void setTextFieldInfoComplementares(
			JTextField textFieldInfoComplementares) {
		this.textFieldInfoComplementares = textFieldInfoComplementares;
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
	public JFormattedTextField getFormattedTextFieldInicio() {
		return formattedTextFieldInicio;
	}
	public void setFormattedTextFieldInicio(
			JFormattedTextField formattedTextFieldInicio) {
		this.formattedTextFieldInicio = formattedTextFieldInicio;
	}
	public JFormattedTextField getFormattedTextFieldHorarioDeFim() {
		return formattedTextFieldHorarioDeFim;
	}
	public void setFormattedTextFieldHorarioDeFim(
			JFormattedTextField formattedTextFieldHorarioDeFim) {
		this.formattedTextFieldHorarioDeFim = formattedTextFieldHorarioDeFim;
	}
	public JFormattedTextField getFormattedTextFieldFim() {
		return formattedTextFieldFim;
	}
	public void setFormattedTextFieldFim(JFormattedTextField formattedTextFieldFim) {
		this.formattedTextFieldFim = formattedTextFieldFim;
	}

	public JTextField getTextFieldCpfAluno() {
		return textFieldCpfAluno;
	}

	public void setTextFieldCpfAluno(JTextField textFieldCpfAluno) {
		this.textFieldCpfAluno = textFieldCpfAluno;
	}

	public JTextField getTextFieldCnpjEmpresa() {
		return textFieldCnpjEmpresa;
	}

	public void setTextFieldCnpjEmpresa(JTextField textFieldCnpjEmpresa) {
		this.textFieldCnpjEmpresa = textFieldCnpjEmpresa;
	}

	public JFormattedTextField getFormattedTextFieldHorarioDeInicio() {
		return formattedTextFieldHorarioDeInicio;
	}
	public void setFormattedTextFieldHorarioDeInicio(
			JFormattedTextField formattedTextFieldHorarioDeInicio) {
		this.formattedTextFieldHorarioDeInicio = formattedTextFieldHorarioDeInicio;
	}
	public JFormattedTextField getFormattedTextFieldValor() {
		return formattedTextFieldValor;
	}
	public void setFormattedTextFieldValor(
			JFormattedTextField formattedTextFieldValor) {
		this.formattedTextFieldValor = formattedTextFieldValor;
	}
	
	
	//FUN\C7AO LIMPAR CAMPOS 
		
	public void limparTermo() {
			getFormattedTextFieldInicio().setText("");
			getTextFieldChSemanal().setText("");
			getFormattedTextFieldHorarioDeFim().setText("");
			getTextFieldBeneficios().setText("");
			getTextFieldCurso().setText("");
			getTextFieldRepresentanteUniversidade().setText("");
			getTextFieldRepresentanteEmpresa().setText("");
			getFormattedTextFieldFim().setText("");
			getTextFieldChDiaria().setText("");
			getTextFieldArea().setText("");
			getTextFieldAtividades().setText("");
			getTextFieldNomeAluno().setText("");
			getTextFieldUniversidade().setText("");
			getTextFieldCnpjEmpresa().setText("");
			getTextFieldInfoComplementares().setText("");
			getFormattedTextFieldHorarioDeInicio().setText("");
			getFormattedTextFieldValor().setText("");
			getTextFieldCpfAluno().setText("");
			getTextFieldOrientador().setText("");
			getTextFieldRazaoSocial().setText("");
		}

}