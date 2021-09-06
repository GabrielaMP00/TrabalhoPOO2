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
		setBounds(100, 100, 800, 500);
		
		JPanel panelBotoes = new JPanel();
		add(panelBotoes, BorderLayout.SOUTH);
		
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
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(135, 206, 235)));
		panelPrincipal.setBackground(new Color(240, 248, 255));
		add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new MigLayout("", "[47.00][][264.00,grow][][43.00][254.00,grow][48.00]", "[53.00][36.00][24.00][32.00][24.00][34.00][26.00][35.00][24.00][][][29.00][34.00]"));
		
		labelEstagiario = new JLabel("Estagi\u00E1rio");
		labelEstagiario.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panelPrincipal.add(labelEstagiario, "cell 0 0 7 1,alignx center");
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelNome, "flowx,cell 1 1,spanx 2");
		
		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCPF, "flowx,cell 4 1 2 1");
		
		JLabel labelData = new JLabel("Data");
		labelData.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelData, "flowx,cell 1 3,spanx 2");
		
		JLabel labelSexo = new JLabel("Sexo");
		labelSexo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelSexo, "flowx,cell 4 3 2 1");
		
		JLabel labelTelefone = new JLabel("Telefone");
		labelTelefone.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelTelefone, "flowx,cell 1 5,spanx 2");
		
		JLabel labelCEP = new JLabel("CEP");
		labelCEP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCEP, "flowx,cell 4 5 2 1");
		
		JLabel labelCelular = new JLabel("Celular");
		labelCelular.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCelular, "flowx,cell 1 7,spanx 2");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		labelEndereco.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelEndereco, "flowx,cell 4 7 2 1");
		
		JLabel labelCidade = new JLabel("Cidade");
		labelCidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCidade, "flowx,cell 1 9 2 1");
		
		JLabel labelBairro = new JLabel("Bairro");
		labelBairro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelBairro, "flowx,cell 4 9 2 1");
		
		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldNome, "cell 1 1 2 1,growx");
		textFieldNome.setColumns(10);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCidade, "cell 1 9 2 1,growx");
		textFieldCidade.setColumns(10);
		
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
			panelPrincipal.add(formattedTextFieldTelefone, "cell 1 5 2 1,growx");
			formattedTextFieldCelular = new JFormattedTextField(mascaraTelefone);
			formattedTextFieldCelular.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldCelular, "cell 1 7 2 1,growx");
			formattedTextFieldCEP = new JFormattedTextField(mascaraCEP);
			formattedTextFieldCEP.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldCEP, "cell 4 5 2 1,growx");
			formattedTextFieldCPF = new JFormattedTextField(mascaraCPF);
			formattedTextFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldCPF, "cell 4 1 2 1,growx");
			formattedTextFieldData = new JFormattedTextField(mascaraData);
			formattedTextFieldData.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldData, "cell 1 3 2 1,growx");

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldEndereco, "cell 4 7 2 1,growx");
		textFieldEndereco.setColumns(10);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldBairro, "cell 4 9 2 1,growx");
		textFieldBairro.setColumns(10);
		
		radioFeminino = new JRadioButton("Feminino");
		radioFeminino.setBackground(new Color(240, 248, 255));
		radioFeminino.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelPrincipal.add(radioFeminino, "cell 5 3,alignx center");
		
		lblNewLabel = new JLabel("                ");
		panelPrincipal.add(lblNewLabel, "cell 5 3");
		
		radioMasculino = new JRadioButton("Masculino");
		radioMasculino.setBackground(new Color(240, 248, 255));
		radioMasculino.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelPrincipal.add(radioMasculino, "cell 5 3");
		
		labelCurso = new JLabel("Curso");
		labelCurso.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCurso, "flowx,cell 1 11, spanx 2");
		
		textFieldCurso = new JTextField();
		textFieldCurso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCurso, "cell 1 11 2 1, growx");
		textFieldCurso.setColumns(10);
		
		labelIngresso = new JLabel("Ingresso");
		labelIngresso.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelIngresso, "flowx,cell 4 11, spanx 2");
		
		textFieldIngresso = new JTextField();
		textFieldIngresso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldIngresso, "cell 4 11 2 1, growx");
		textFieldIngresso.setColumns(10);
		
		botaoGrupo = new ButtonGroup();
		botaoGrupo.add(radioFeminino);
		botaoGrupo.add(radioMasculino);

	}

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
	
	

}