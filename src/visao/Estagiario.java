package visao;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import javax.swing.JRadioButton;

public class Estagiario extends JPanel {
	private JTextField textFieldNome;
	private JTextField textFieldCidade;
	private JTextField textFieldEndereco;
	private JTextField textFieldBairro;
	private JButton btnCadastrar;
	private JButton btnAtualizar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnRemover;
	private JLabel labelEstagiario;
	private JFormattedTextField formattedTextFieldTelefone;
	private JFormattedTextField formattedTextFieldCEP;
	private JFormattedTextField formattedTextFieldCPF;
	private JRadioButton radioFeminino;
	private JRadioButton radioMasculino;
	private JLabel lblNewLabel;
	private JLabel labelCurso;
	private JTextField textFieldCurso;
	private JLabel labelIngresso;
	private JTextField textFieldIngresso;
	private JFormattedTextField formattedTextFieldData;
	private JFormattedTextField formattedTextFieldCelular;
	private ButtonGroup botaoGrupo;
	
	/**
	 * Create the panel.
	 */
	public Estagiario() {
		
		setBackground(new Color(240, 250, 255));
		setLayout(new BorderLayout(0, 0));
		setBounds(100, 100, 950, 550);
		
		JPanel panelBotoes = new JPanel();
		add(panelBotoes, BorderLayout.SOUTH);
		
		//INICIO BOTOES
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon(Concedente.class.getResource("/icones_logos/add-documents (1).png")));
		btnCadastrar.setBackground(new Color(102, 204, 255));
		panelBotoes.add(btnCadastrar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setIcon(new ImageIcon(Concedente.class.getResource("/icones_logos/refresh (1).png")));
		btnAtualizar.setBackground(new Color(102, 204, 255));
		panelBotoes.add(btnAtualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(Concedente.class.getResource("/icones_logos/preview.png")));
		btnConsultar.setBackground(new Color(102, 204, 255));
		panelBotoes.add(btnConsultar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(Concedente.class.getResource("/icones_logos/eraser32.png")));
		btnLimpar.setBackground(new Color(102, 204, 255));
		panelBotoes.add(btnLimpar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setIcon(new ImageIcon(Concedente.class.getResource("/icones_logos/trash32.png")));
		btnRemover.setBackground(new Color(102, 204, 255));
		panelBotoes.add(btnRemover);
		
		//FIM BOTOES
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(135, 206, 235)));
		panelPrincipal.setBackground(new Color(240, 248, 255));
		add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new MigLayout("", "[47.00][54.00][188.00,grow][77.00][64.00][254.00,grow][48.00]", "[53.00][15.00][36.00][24.00][32.00][24.00][34.00][26.00][35.00][24.00][][28.00][29.00][34.00]"));
		
		labelEstagiario = new JLabel("Estagi\u00E1rio");
		labelEstagiario.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panelPrincipal.add(labelEstagiario, "cell 0 0 7 1,alignx center");
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelNome, "flowx,cell 1 2 2 1");
		
		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCPF, "flowx,cell 4 2 2 1");
		
		JLabel labelData = new JLabel("Data");
		labelData.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelData, "flowx,cell 1 4 2 1");
		
		JLabel labelSexo = new JLabel("Sexo");
		labelSexo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelSexo, "flowx,cell 4 4 2 1");
		
		JLabel labelTelefone = new JLabel("Telefone");
		labelTelefone.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelTelefone, "flowx,cell 1 6 2 1");
		
		JLabel labelCEP = new JLabel("CEP");
		labelCEP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCEP, "flowx,cell 4 6 2 1");
		
		JLabel labelCelular = new JLabel("Celular");
		labelCelular.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCelular, "flowx,cell 1 8 2 1");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		labelEndereco.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelEndereco, "flowx,cell 4 8 2 1");
		
		JLabel labelCidade = new JLabel("Cidade");
		labelCidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCidade, "flowx,cell 1 10 2 1");
		
		JLabel labelBairro = new JLabel("Bairro");
		labelBairro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelBairro, "flowx,cell 4 10 2 1");
		
		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldNome, "cell 1 2 2 1,growx");
		textFieldNome.setColumns(10);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCidade, "cell 1 10 2 1,growx");
		textFieldCidade.setColumns(10);
		
		//USANDO MASKS NOS TEXTFIELD
		
		MaskFormatter mascaraCEP;
		MaskFormatter mascaraTelefone;
		MaskFormatter mascaraCPF;
		MaskFormatter mascaraData;
		MaskFormatter mascaraCelular;
				
		try {
			mascaraTelefone= new MaskFormatter("(##)#####-####");		 
		    mascaraTelefone.setPlaceholder(" ");
			mascaraCEP = new MaskFormatter("#####-###");
			mascaraCEP.setPlaceholder(" ");
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCelular= new MaskFormatter("(##)#####-####");		 
		    mascaraCelular.setPlaceholder(" ");
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholder(" ");
			formattedTextFieldTelefone = new JFormattedTextField(mascaraTelefone);
			formattedTextFieldTelefone.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldTelefone, "cell 1 6 2 1,growx");
			formattedTextFieldCelular = new JFormattedTextField(mascaraTelefone);
			formattedTextFieldCelular.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldCelular, "cell 1 8 2 1,growx");
			formattedTextFieldCEP = new JFormattedTextField(mascaraCEP);
			formattedTextFieldCEP.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldCEP, "cell 4 6 2 1,growx");
			formattedTextFieldCPF = new JFormattedTextField(mascaraCPF);
			formattedTextFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldCPF, "cell 4 2 2 1,growx");
			formattedTextFieldData = new JFormattedTextField(mascaraData);
			formattedTextFieldData.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldData, "cell 1 4 2 1,growx");

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//FIM MASKS NOS TEXTFIELD
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldEndereco, "cell 4 8 2 1,growx");
		textFieldEndereco.setColumns(10);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldBairro, "cell 4 10 2 1,growx");
		textFieldBairro.setColumns(10);
		
		radioFeminino = new JRadioButton("Feminino");
		radioFeminino.setBackground(new Color(240, 248, 255));
		radioFeminino.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelPrincipal.add(radioFeminino, "cell 5 4,alignx center");
		
		lblNewLabel = new JLabel("                ");
		panelPrincipal.add(lblNewLabel, "cell 5 4");
		
		radioMasculino = new JRadioButton("Masculino");
		radioMasculino.setBackground(new Color(240, 248, 255));
		radioMasculino.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelPrincipal.add(radioMasculino, "cell 5 4");
		
		labelCurso = new JLabel("Curso");
		labelCurso.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCurso, "flowx,cell 1 12 2 1");
		
		textFieldCurso = new JTextField();
		textFieldCurso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCurso, "cell 1 12 2 1,growx");
		textFieldCurso.setColumns(10);
		
		labelIngresso = new JLabel("Ingresso");
		labelIngresso.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelIngresso, "flowx,cell 4 12 2 1");
		
		textFieldIngresso = new JTextField();
		textFieldIngresso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldIngresso, "cell 4 12 2 1,growx");
		textFieldIngresso.setColumns(10);
		
		//ADICIONANDO RABIOLABEL EM UM GRUPO PARA SOMENTE PODER SELECIONAR UMA OPÇAO
		
		botaoGrupo = new ButtonGroup();
		botaoGrupo.add(radioFeminino);
		botaoGrupo.add(radioMasculino);

	}
	
	//GETTERS E SETTERS

	public JTextField getTextFieldRazaoSocial() {
		return textFieldNome;
	}

	public void setTextFieldRazaoSocial(JTextField textFieldRazaoSocial) {
		this.textFieldNome = textFieldRazaoSocial;
	}

	public JTextField getTextFieldCidade() {
		return textFieldCidade;
	}

	public void setTextFieldCidade(JTextField textFieldCidade) {
		this.textFieldCidade = textFieldCidade;
	}

	public JTextField getTextFieldEstado() {
		return textFieldEndereco;
	}

	public void setTextFieldEstado(JTextField textFieldEstado) {
		this.textFieldEndereco = textFieldEstado;
	}

	public JTextField getTextFieldBairro() {
		return textFieldBairro;
	}

	public void setTextFieldBairro(JTextField textFieldBairro) {
		this.textFieldBairro = textFieldBairro;
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
	
	
	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public void setTextFieldNome(JTextField textFieldNome) {
		this.textFieldNome = textFieldNome;
	}

	public JTextField getTextFieldEndereco() {
		return textFieldEndereco;
	}

	public void setTextFieldEndereco(JTextField textFieldEndereco) {
		this.textFieldEndereco = textFieldEndereco;
	}

	public JFormattedTextField getFormattedTextFieldTelefone() {
		return formattedTextFieldTelefone;
	}

	public void setFormattedTextFieldTelefone(JFormattedTextField formattedTextFieldTelefone) {
		this.formattedTextFieldTelefone = formattedTextFieldTelefone;
	}

	public JFormattedTextField getFormattedTextFieldCEP() {
		return formattedTextFieldCEP;
	}

	public void setFormattedTextFieldCEP(JFormattedTextField formattedTextFieldCEP) {
		this.formattedTextFieldCEP = formattedTextFieldCEP;
	}

	public JFormattedTextField getFormattedTextFieldCPF() {
		return formattedTextFieldCPF;
	}

	public void setFormattedTextFieldCPF(JFormattedTextField formattedTextFieldCPF) {
		this.formattedTextFieldCPF = formattedTextFieldCPF;
	}

	public JRadioButton getRadioFeminino() {
		return radioFeminino;
	}

	public void setRadioFeminino(JRadioButton radioFeminino) {
		this.radioFeminino = radioFeminino;
	}

	public JRadioButton getRadioMasculino() {
		return radioMasculino;
	}

	public void setRadioMasculino(JRadioButton radioMasculino) {
		this.radioMasculino = radioMasculino;
	}

	public JTextField getTextFieldCurso() {
		return textFieldCurso;
	}

	public void setTextFieldCurso(JTextField textFieldCurso) {
		this.textFieldCurso = textFieldCurso;
	}

	public JTextField getTextFieldIngresso() {
		return textFieldIngresso;
	}

	public void setTextFieldIngresso(JTextField textFieldIngresso) {
		this.textFieldIngresso = textFieldIngresso;
	}

	public JFormattedTextField getFormattedTextFieldData() {
		return formattedTextFieldData;
	}

	public void setFormattedTextFieldData(JFormattedTextField formattedTextFieldData) {
		this.formattedTextFieldData = formattedTextFieldData;
	}

	public JFormattedTextField getFormattedTextFieldCelular() {
		return formattedTextFieldCelular;
	}

	public void setFormattedTextFieldCelular(JFormattedTextField formattedTextFieldCelular) {
		this.formattedTextFieldCelular = formattedTextFieldCelular;
	}

	public ButtonGroup getBotaoGrupo() {
		return botaoGrupo;
	}

	public void setBotaoGrupo(ButtonGroup botaoGrupo) {
		this.botaoGrupo = botaoGrupo;
	}

	public void limparEstagiario() {
		getTextFieldRazaoSocial().setText("");
		getTextFieldCidade().setText("");
		getTextFieldEstado().setText("");
		getTextFieldBairro().setText("");
		getTextFieldNome().setText("");
		getTextFieldEndereco().setText("");
		getFormattedTextFieldTelefone().setText("");
		getTextFieldCurso().setText("");
		getBotaoGrupo().setSelected(null, getFocusTraversalKeysEnabled());
		getFormattedTextFieldCelular().setText("");
		getFormattedTextFieldData().setText(""); 
		getTextFieldIngresso().setText("");
		getFormattedTextFieldCPF().setText("");
		getFormattedTextFieldCEP().setText("");
		
		
	}
	
	

}
