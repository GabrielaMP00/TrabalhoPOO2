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
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Concedente extends JPanel {
	private JTextField textFieldRazaoSocial;
	private JTextField textFieldTelefone;
	private JTextField textFieldCargoRepresentante;
	private JTextField textFieldEndereco;
	private JTextField textFieldCidade;
	private JTextField textFieldCNPJ;
	private JTextField textFieldRepresentante;
	private JTextField textFieldCep;
	private JTextField textFieldEstado;
	private JTextField textFieldBairro;
	private JButton btnCadastrar;
	private JButton btnAtualizar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnRemover;
	private JLabel labelConcedente;
	private JFormattedTextField formattedTextFieldTelefone;
	private JFormattedTextField formattedTextFieldCEP;
	private JFormattedTextField formattedTextFieldCNPJ;
	
	/**
	 * Create the panel.
	 */
	public Concedente() {
		
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
		panelPrincipal.setLayout(new MigLayout("", "[47.00][][grow][][][254.00,grow][48.00]", "[64.00][36.00][32.00][32.00][32.00][34.00][26.00][35.00][34.00][][20]"));
		
		labelConcedente = new JLabel("Concedente");
		labelConcedente.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panelPrincipal.add(labelConcedente, "cell 2 0 4 1,alignx center");
		
		JLabel labelRazaoSocial = new JLabel("Raz\u00E3o Social");
		labelRazaoSocial.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelRazaoSocial, "flowx,cell 1 1,spanx 2");
		
		JLabel labelCNPJ = new JLabel("CNPJ");
		labelCNPJ.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCNPJ, "flowx,cell 4 1 2 1");
		
		JLabel labelTelefone = new JLabel("Telefone");
		labelTelefone.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelTelefone, "flowx,cell 1 3,spanx 2");
		
		JLabel labelRepresentante = new JLabel("Representante");
		labelRepresentante.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelRepresentante, "flowx,cell 4 3 2 1");
		
		JLabel labelCargoRep = new JLabel("Cargo Representante");
		labelCargoRep.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCargoRep, "flowx,cell 1 5,spanx 2");
		
		JLabel labelCEP = new JLabel("CEP");
		labelCEP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCEP, "flowx,cell 4 5 2 1");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		labelEndereco.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelEndereco, "flowx,cell 1 7,spanx 2");
		
		JLabel labelEstado = new JLabel("Estado");
		labelEstado.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelEstado, "flowx,cell 4 7 2 1");
		
		JLabel labelCidade = new JLabel("Cidade");
		labelCidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelCidade, "flowx,cell 1 9 2 1");
		
		JLabel labelBairro = new JLabel("Bairro");
		labelBairro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panelPrincipal.add(labelBairro, "flowx,cell 4 9 2 1");
		
		textFieldRazaoSocial = new JTextField();
		textFieldRazaoSocial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldRazaoSocial, "cell 1 1 2 1,growx");
		textFieldRazaoSocial.setColumns(10);
		
		textFieldCargoRepresentante = new JTextField();
		textFieldCargoRepresentante.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCargoRepresentante, "cell 1 5 2 1,growx");
		textFieldCargoRepresentante.setColumns(10);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldEndereco, "cell 1 7 2 1,growx");
		textFieldEndereco.setColumns(10);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldCidade, "cell 1 9 2 1,growx");
		textFieldCidade.setColumns(10);
		
		MaskFormatter mascaraCEP;
		MaskFormatter mascaraTelefone;
		MaskFormatter mascaraCNPJ;
				
		try {
			mascaraTelefone= new MaskFormatter("(##)#####-####");		 
		    mascaraTelefone.setPlaceholder(" ");
			mascaraCEP = new MaskFormatter("#####-###");
			mascaraCEP.setPlaceholder(" ");
			mascaraCNPJ = new MaskFormatter("##.###.###/####-##");
			formattedTextFieldTelefone = new JFormattedTextField(mascaraTelefone);
			formattedTextFieldTelefone.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldTelefone, "cell 1 3 2 1,growx");
			formattedTextFieldCEP = new JFormattedTextField(mascaraCEP);
			formattedTextFieldCEP.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldCEP, "cell 4 5 2 1,growx");
			formattedTextFieldCNPJ = new JFormattedTextField(mascaraCNPJ);
			formattedTextFieldCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panelPrincipal.add(formattedTextFieldCNPJ, "cell 4 1 2 1,growx");

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//textFieldCNPJ = new JTextField();
		//textFieldCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		//panelPrincipal.add(textFieldCNPJ, "cell 4 1 2 1,growx");
		//textFieldCNPJ.setColumns(10);
		
		textFieldRepresentante = new JTextField();
		textFieldRepresentante.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldRepresentante, "cell 4 3 2 1,growx");
		textFieldRepresentante.setColumns(10);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldEstado, "cell 4 7 2 1,growx");
		textFieldEstado.setColumns(10);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelPrincipal.add(textFieldBairro, "cell 4 9 2 1,growx");
		textFieldBairro.setColumns(10);

	}

	public JTextField getTextFieldRazaoSocial() {
		return textFieldRazaoSocial;
	}

	public void setTextFieldRazaoSocial(JTextField textFieldRazaoSocial) {
		this.textFieldRazaoSocial = textFieldRazaoSocial;
	}

	public JTextField getTextFieldTelefone() {
		return textFieldTelefone;
	}

	public void setTextFieldTelefone(JTextField textFieldTelefone) {
		this.textFieldTelefone = textFieldTelefone;
	}

	public JTextField getTextFieldCargoRepresentante() {
		return textFieldCargoRepresentante;
	}

	public void setTextFieldCargoRepresentante(JTextField textFieldCargoRepresentante) {
		this.textFieldCargoRepresentante = textFieldCargoRepresentante;
	}

	public JTextField getTextFieldEndereco() {
		return textFieldEndereco;
	}

	public void setTextFieldEndereco(JTextField textFieldEndereco) {
		this.textFieldEndereco = textFieldEndereco;
	}

	public JTextField getTextFieldCidade() {
		return textFieldCidade;
	}

	public void setTextFieldCidade(JTextField textFieldCidade) {
		this.textFieldCidade = textFieldCidade;
	}

	public JTextField getTextFieldCnpj() {
		return textFieldCNPJ;
	}

	public void setTextFieldCnpj(JTextField textFieldCnpj) {
		this.textFieldCNPJ = textFieldCnpj;
	}

	public JTextField getTextFieldRepresentante() {
		return textFieldRepresentante;
	}

	public void setTextFieldRepresentante(JTextField textFieldRepresentante) {
		this.textFieldRepresentante = textFieldRepresentante;
	}

	public JTextField getTextFieldCep() {
		return textFieldCep;
	}

	public void setTextFieldCep(JTextField textFieldCep) {
		this.textFieldCep = textFieldCep;
	}

	public JTextField getTextFieldEstado() {
		return textFieldEstado;
	}

	public void setTextFieldEstado(JTextField textFieldEstado) {
		this.textFieldEstado = textFieldEstado;
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
