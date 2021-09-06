package visao;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Curso extends JPanel {
	private JTextField textFieldUniversidade;
	private JTextField textFieldCurso;
	private JTextField textFielCodigo;
	private JTextField textFieldCargoRepre;
	private JTextField textFieldCnpj;
	private JTextField textFieldEndereco;
	private JTextField textFieldCidade;
	private JTextField textFieldTelUniversidade;
	private JTextField textFieldCargoRepresentanteUni;
	private JTextField textFieldRepreCoordenacao;
	private JTextField textFieldTelCoordenacao;
	private JTextField textFieldCep;
	private JTextField textFieldEstado;
	private JTextField textFieldBairro;
	private JTextField textFieldRepresentanteUni;
	private JButton btnCadastrar;
	private JButton btnAtualizar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnRemover;
	
	/**
	 * Create the panel.
	 */
	public Curso() {
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.SOUTH);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/add-file.png")));
		btnCadastrar.setBackground(new Color(102, 204, 255));
		panel.add(btnCadastrar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/refresh.png")));
		btnAtualizar.setBackground(new Color(102, 204, 255));
		panel.add(btnAtualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/preview.png")));
		btnConsultar.setBackground(new Color(102, 204, 255));
		panel.add(btnConsultar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/broom.png")));
		btnLimpar.setBackground(new Color(102, 204, 255));
		panel.add(btnLimpar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/bin.png")));
		btnRemover.setBackground(new Color(102, 204, 255));
		panel.add(btnRemover);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][grow][][grow]", "[][][][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Universidade");
		panel_1.add(lblNewLabel, "cell 0 1,alignx center");
		
		textFieldUniversidade = new JTextField();
		panel_1.add(textFieldUniversidade, "cell 1 1,growx");
		textFieldUniversidade.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Curso");
		panel_1.add(lblNewLabel_1, "cell 2 1,alignx center");
		
		textFieldCurso = new JTextField();
		panel_1.add(textFieldCurso, "cell 3 1,growx");
		textFieldCurso.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo");
		panel_1.add(lblNewLabel_2, "cell 0 3,alignx center");
		
		textFielCodigo = new JTextField();
		panel_1.add(textFielCodigo, "cell 1 3,growx");
		textFielCodigo.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Representante Coord.");
		panel_1.add(lblNewLabel_9, "cell 2 3,alignx center");
		
		textFieldRepreCoordenacao = new JTextField();
		panel_1.add(textFieldRepreCoordenacao, "cell 3 3,growx");
		textFieldRepreCoordenacao.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cargo Representate");
		panel_1.add(lblNewLabel_3, "cell 0 5,alignx center");
		
		textFieldCargoRepre = new JTextField();
		panel_1.add(textFieldCargoRepre, "cell 1 5,growx");
		textFieldCargoRepre.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Tel. Coordena\u00E7\u00E3o");
		panel_1.add(lblNewLabel_10, "cell 2 5,alignx center");
		
		textFieldTelCoordenacao = new JTextField();
		panel_1.add(textFieldTelCoordenacao, "cell 3 5,growx");
		textFieldTelCoordenacao.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CNPJ");
		panel_1.add(lblNewLabel_4, "cell 0 7,alignx center");
		
		textFieldCnpj = new JTextField();
		panel_1.add(textFieldCnpj, "cell 1 7,growx");
		textFieldCnpj.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("CEP");
		panel_1.add(lblNewLabel_11, "cell 2 7,alignx center");
		
		textFieldCep = new JTextField();
		panel_1.add(textFieldCep, "cell 3 7,growx");
		textFieldCep.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Endere\u00E7o");
		panel_1.add(lblNewLabel_5, "cell 0 9,alignx center");
		
		textFieldEndereco = new JTextField();
		panel_1.add(textFieldEndereco, "cell 1 9,growx");
		textFieldEndereco.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Estado");
		panel_1.add(lblNewLabel_12, "cell 2 9,alignx center");
		
		textFieldEstado = new JTextField();
		panel_1.add(textFieldEstado, "cell 3 9,growx");
		textFieldEstado.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Cidade");
		panel_1.add(lblNewLabel_6, "cell 0 11,alignx center");
		
		textFieldCidade = new JTextField();
		panel_1.add(textFieldCidade, "cell 1 11,growx");
		textFieldCidade.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Bairro");
		panel_1.add(lblNewLabel_13, "cell 2 11,alignx center");
		
		textFieldBairro = new JTextField();
		panel_1.add(textFieldBairro, "cell 3 11,growx");
		textFieldBairro.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Tel. Universidade");
		panel_1.add(lblNewLabel_7, "cell 0 13,alignx center");
		
		textFieldTelUniversidade = new JTextField();
		panel_1.add(textFieldTelUniversidade, "cell 1 13,growx");
		textFieldTelUniversidade.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Representante da Uni.");
		panel_1.add(lblNewLabel_14, "cell 2 13,alignx center");
		
		textFieldRepresentanteUni = new JTextField();
		panel_1.add(textFieldRepresentanteUni, "cell 3 13,growx");
		textFieldRepresentanteUni.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Cargo Representante da Uni.");
		panel_1.add(lblNewLabel_8, "cell 0 15,alignx center");
		
		textFieldCargoRepresentanteUni = new JTextField();
		panel_1.add(textFieldCargoRepresentanteUni, "cell 1 15,growx");
		textFieldCargoRepresentanteUni.setColumns(10);

	}

	public JTextField getTextFieldUniversidade() {
		return textFieldUniversidade;
	}

	public void setTextFieldUniversidade(JTextField textFieldUniversidade) {
		this.textFieldUniversidade = textFieldUniversidade;
	}

	public JTextField getTextFieldCurso() {
		return textFieldCurso;
	}

	public void setTextFieldCurso(JTextField textFieldCurso) {
		this.textFieldCurso = textFieldCurso;
	}

	public JTextField getTextFielCodigo() {
		return textFielCodigo;
	}

	public void setTextFielCodigo(JTextField textFielCodigo) {
		this.textFielCodigo = textFielCodigo;
	}

	public JTextField getTextFieldCargoRepre() {
		return textFieldCargoRepre;
	}

	public void setTextFieldCargoRepre(JTextField textFieldCargoRepre) {
		this.textFieldCargoRepre = textFieldCargoRepre;
	}

	public JTextField getTextFieldCnpj() {
		return textFieldCnpj;
	}

	public void setTextFieldCnpj(JTextField textFieldCnpj) {
		this.textFieldCnpj = textFieldCnpj;
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

	public JTextField getTextFieldTelUniversidade() {
		return textFieldTelUniversidade;
	}

	public void setTextFieldTelUniversidade(JTextField textFieldTelUniversidade) {
		this.textFieldTelUniversidade = textFieldTelUniversidade;
	}

	public JTextField getTextFieldCargoRepresentanteUni() {
		return textFieldCargoRepresentanteUni;
	}

	public void setTextFieldCargoRepresentanteUni(JTextField textFieldCargoRepresentanteUni) {
		this.textFieldCargoRepresentanteUni = textFieldCargoRepresentanteUni;
	}

	public JTextField getTextFieldRepreCoordenacao() {
		return textFieldRepreCoordenacao;
	}

	public void setTextFieldRepreCoordenacao(JTextField textFieldRepreCoordenacao) {
		this.textFieldRepreCoordenacao = textFieldRepreCoordenacao;
	}

	public JTextField getTextFieldTelCoordenacao() {
		return textFieldTelCoordenacao;
	}

	public void setTextFieldTelCoordenacao(JTextField textFieldTelCoordenacao) {
		this.textFieldTelCoordenacao = textFieldTelCoordenacao;
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

	public JTextField getTextFieldRepresentanteUni() {
		return textFieldRepresentanteUni;
	}

	public void setTextFieldRepresentanteUni(JTextField textFieldRepresentanteUni) {
		this.textFieldRepresentanteUni = textFieldRepresentanteUni;
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
