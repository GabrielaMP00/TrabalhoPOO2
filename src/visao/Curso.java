package visao;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Font;

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
	private JLabel labelTituloCurso;
	
	/**
	 * Create the panel.
	 */
	public Curso() {
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout(0, 0));
		setBounds(100, 100, 950, 550);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.SOUTH);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/add-documents (1).png")));
		btnCadastrar.setBackground(new Color(102, 204, 255));
		panel.add(btnCadastrar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/refresh (1).png")));
		btnAtualizar.setBackground(new Color(102, 204, 255));
		panel.add(btnAtualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/preview.png")));
		btnConsultar.setBackground(new Color(102, 204, 255));
		panel.add(btnConsultar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/eraser32.png")));
		btnLimpar.setBackground(new Color(102, 204, 255));
		panel.add(btnLimpar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setIcon(new ImageIcon(Curso.class.getResource("/icones_logos/trash32.png")));
		btnRemover.setBackground(new Color(102, 204, 255));
		panel.add(btnRemover);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(135, 206, 235)));
		panel_1.setBackground(new Color(240, 248, 255));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[46.00][329.00,grow][43.00][315.00,grow][49.00]", "[52.00][][][][][][][][][][][][][][9.00][6.00][][][][]"));
		
		labelTituloCurso = new JLabel("Curso");
		labelTituloCurso.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panel_1.add(labelTituloCurso, "cell 0 0 5 1,alignx center");
		
		JLabel labelUniversidade = new JLabel("Universidade");
		labelUniversidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelUniversidade, "flowx,cell 1 2,alignx left");
		
		textFieldUniversidade = new JTextField();
		textFieldUniversidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldUniversidade, "cell 1 2,growx");
		textFieldUniversidade.setColumns(10);
		
		JLabel labelCurso = new JLabel("Curso");
		labelCurso.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelCurso, "flowx,cell 3 2,alignx left");
		
		textFieldCurso = new JTextField();
		textFieldCurso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldCurso, "cell 3 2,growx");
		textFieldCurso.setColumns(10);
		
		JLabel labelCodigo = new JLabel("C\u00F3digo");
		labelCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelCodigo, "flowx,cell 1 4,alignx left");
		
		textFielCodigo = new JTextField();
		textFielCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFielCodigo, "cell 1 4,growx");
		textFielCodigo.setColumns(10);
		
		JLabel labelTelCoordenacao = new JLabel("Telefone Coordena\u00E7\u00E3o");
		labelTelCoordenacao.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelTelCoordenacao, "flowx,cell 3 4,alignx left");
		
		JLabel labelCargoRepre = new JLabel("Cargo Representante");
		labelCargoRepre.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelCargoRepre, "flowx,cell 1 6,alignx left");
		
		textFieldCargoRepre = new JTextField();
		textFieldCargoRepre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldCargoRepre, "cell 1 6,growx");
		textFieldCargoRepre.setColumns(10);
		
		JLabel labelCep = new JLabel("CEP");
		labelCep.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelCep, "flowx,cell 3 6,alignx left");
		
		JLabel labelCnpj = new JLabel("CNPJ");
		labelCnpj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelCnpj, "flowx,cell 1 8,alignx left");
		
		textFieldCnpj = new JTextField();
		textFieldCnpj.setText("  .   .   /    -  ");
		textFieldCnpj.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldCnpj, "cell 1 8,growx");
		textFieldCnpj.setColumns(10);
		
		JLabel labelEstado = new JLabel("Estado");
		labelEstado.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelEstado, "flowx,cell 3 8,aligny baseline");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		labelEndereco.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelEndereco, "flowx,cell 1 10,alignx left");
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldEndereco, "cell 1 10,growx");
		textFieldEndereco.setColumns(10);
		
		JLabel labelBairro = new JLabel("Bairro");
		labelBairro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelBairro, "flowx,cell 3 10,alignx left");
		
		JLabel labelCidade = new JLabel("Cidade");
		labelCidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelCidade, "flowx,cell 1 12,alignx left");
		
		textFieldCidade = new JTextField();
		textFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldCidade, "cell 1 12,growx");
		textFieldCidade.setColumns(10);
		
		JLabel labelTelUniversidade = new JLabel("Telefone Universidade");
		labelTelUniversidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelTelUniversidade, "flowx,cell 3 12,alignx left");
		
		JLabel labelRepresentanteUni = new JLabel("Representante da Universidade");
		labelRepresentanteUni.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelRepresentanteUni, "flowx,cell 1 14 3 1,alignx left");
		
		JLabel labelCargoRepresentanteUni = new JLabel("Cargo do Representante da Universidade");
		labelCargoRepresentanteUni.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelCargoRepresentanteUni, "flowx,cell 1 15 3 1,alignx left");
		
		textFieldCargoRepresentanteUni = new JTextField();
		textFieldCargoRepresentanteUni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldCargoRepresentanteUni, "cell 1 15 3 1,growx");
		textFieldCargoRepresentanteUni.setColumns(10);
		
		JLabel labelRepreCoordenacao = new JLabel("Representante da Coordenação");
		labelRepreCoordenacao.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(labelRepreCoordenacao, "flowx,cell 1 17 3 1,alignx left");
		
		textFieldRepreCoordenacao = new JTextField();
		textFieldRepreCoordenacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldRepreCoordenacao, "cell 1 14 3 1,growx");
		textFieldRepreCoordenacao.setColumns(10);
		
		textFieldRepresentanteUni = new JTextField();
		textFieldRepresentanteUni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldRepresentanteUni, "cell 1 17 3 1,growx");
		textFieldRepresentanteUni.setColumns(10);
		
		textFieldTelCoordenacao = new JTextField();
		textFieldTelCoordenacao.setText("(  )     -    ");
		textFieldTelCoordenacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldTelCoordenacao, "cell 3 4,growx");
		textFieldTelCoordenacao.setColumns(10);
		
		textFieldCep = new JTextField();
		textFieldCep.setText("     -   ");
		textFieldCep.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldCep, "cell 3 6,growx");
		textFieldCep.setColumns(10);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldEstado, "cell 3 8,growx");
		textFieldEstado.setColumns(10);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldBairro, "cell 3 10,growx");
		textFieldBairro.setColumns(10);
		
		textFieldTelUniversidade = new JTextField();
		textFieldTelUniversidade.setText("(  )     -    ");
		textFieldTelUniversidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(textFieldTelUniversidade, "cell 3 12,growx");
		textFieldTelUniversidade.setColumns(10);

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
