package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.ParseException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class Cadastro extends JPanel {
	private JTextField textField_Cadastro_Nome_CoordenadorUFCSPA;
	private JTextField textField_Cadastro_RG_CoordenadorUFCSPA;
	
	private JTextField textField_Cadastro_Nome_EmpresaContratante;
	private JTextField textField_Cadastro_Endereco_EmpresaContratante;
	private JTextField textField_Cadastro_Cidade_EmpresaContratante;
	private JTextField textField_Cadastro_Contratante_EmpresaContratante;
	private JTextField textField_Cadastro_CargoContratante_EmpresaContratante;
	private JTextField textField_Cadastro_RGContratante_EmpresaContratante;
	
	private JTextField textField_Cadastro_Nome_Estudante;
	private JTextField textField_Cadastro_RG_Estudante;
	private JTextField textField_Cadastro_Endereco_Estudante;
	private JTextField textField_Cadastro_Cidade_Estudante;
	private JTextField textField_Cadastro_Bairro_Estudante;
	private JTextField textField_Cadastro_Matricula_Estudante;
	private JTextField textField_Cadastro_Semestre_Estudante;
	
	private JTextField textField_Cadastro_Atuacao_Estagio;
	private JTextField textField_Cadastro_CargaHoraria_Estagio;
	private JTextField textField_Cadastro_ValorDaolsa_Estagio;
	private JTextField textField_Cadastro_ValorValeTransporte_Estagio;
	private JTextField textField_Cadastro_ValorValeRefeicao_Estagio;
	private JTextField textField_Cadastro_Seguradora_Estagio;
	private JTextField textField_Cadastro_Apolice_Estagio;
	private JTextField textField_Cadastro_ProfessorResponsavel_Estagio;
	private JTextField textField_Cadastro_SIAPE_Estagio;
	private JTextField textField_Cadastro_OrientadorResponsavel_Estagio;
	private JTextField textField_Cadastro_CargoOrientadorResponsavel_Estagio;
	
	private JFormattedTextField textField_Cadastro_CPF_CoordenadorUFCSPA;
	private JFormattedTextField textField_Cadastro_CNPJ_EmpresaContratante;
	private JFormattedTextField textField_Cadastro_CEP_EmpresaContratante;
	private JFormattedTextField textField_Cadastro_CPFContratante_EmpresaContratante;
	private JFormattedTextField textField_Cadastro_CPF_Estudante;
	private JFormattedTextField textField_Cadastro_Nascimento_Estudante;
	private JFormattedTextField textField_Cadastro_CEP_Estudante;
	private JFormattedTextField textField_Cadastro_Inicio_Estagio;
	private JFormattedTextField textField_Cadastro_Termino_Estagio;
	
	private JButton btnCadastro_Cadastrar;
	private JButton btnCadastro_Limpar;
	private JButton btnCadastro_Voltar;
	
	private JComboBox comboBox_Curso_CoordenadorUFCSPA;
	private JComboBox comboBox_Cadastro_UF_EmpresaContratante;
	private JComboBox comboBox_Cadastro_UF_Estudante;
	private JComboBox comboBox_Cadastro_Curso_Estudante;
	
	private JTextPane textPane_AtividadesRealizadas_Estagio;
	
	private ButtonGroup bg_EstagioObrigatorio_Estagio;
	private ButtonGroup bg_ValeRefeicao_Estagio;
	private ButtonGroup bg_SeguroAcidente_Estagio;
	private ButtonGroup bg_ValeTransporte;
	
	private JRadioButton rdbtnCadastro_ValeRefeicao_NAO;
	private JRadioButton rdbtnCadastro_ValeRefeicao_SIM;
	private JRadioButton rdbtnCadastro_ValeTransporte_NAO;
	private JRadioButton rdbtnCadastro_ValeTransporte_SIM;
	private JRadioButton rdbtnCadastro_SeguroAcidente_NAO;
	private JRadioButton rdbtnCadastro_SeguroAcidente_SIM;
	private JRadioButton rdbtnCadastro_EstagioObrigatorio_NAO;
	private JRadioButton rdbtnCadastro_EstagioObrigatorio_SIM;

	public Cadastro() {
		setBackground(new Color(240, 248, 255));
		setLayout(new MigLayout("", "[100px,center][100px,center][100px,grow,center][100px,grow,center][100px,grow,center][100.00px,center][100px,grow,center][100px,grow,center][100px,grow,center][83.00px,center][100px,grow,center][81.00px,grow,center][100px,grow,center][82.00px,center][100px,grow,center][]", "[8.00][25.00][25.00][15.00][8.00][15.00][8.00][15.00,grow][][0.00][15.00][15.00][][][grow][][0.00][][][][][][grow][][0.00][][][][][][grow][][0.00][][][][][][][][1.00][][15.00][15.00,grow][0.00][][13.00]"));
		
		JLabel lblLogoRepublicaFederativa = new JLabel("");
		add(lblLogoRepublicaFederativa, "cell 0 1 2 3,alignx right");
		try {
			lblLogoRepublicaFederativa.setIcon(new ImageIcon(ImageIO.read(Cadastro.class.getResource("/icones_logos/logoRepublicaFederativa.png")).getScaledInstance(
					75, 80, BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e1) {
			e1.printStackTrace();}
		
		JLabel lblLogoUFCSPA = new JLabel("");
		add(lblLogoUFCSPA, "cell 13 1 2 3,alignx left");
		try {
			lblLogoUFCSPA.setIcon(new ImageIcon(ImageIO.read(Cadastro.class.getResource("/icones_logos/logoUFCSPA.png")).getScaledInstance(
							80, 70, BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e) {
			e.printStackTrace();}
		
		JLabel lblTitulo_TermoDeCompromisso = new JLabel("Formul\u00E1rio de Termo de Compromisso e Atividades de Est\u00E1gio");
		lblTitulo_TermoDeCompromisso.setForeground(new Color(0, 0, 0));
		lblTitulo_TermoDeCompromisso.setBackground(new Color(255, 255, 255));
		lblTitulo_TermoDeCompromisso.setFont(new Font("DejaVu Sans Light", Font.BOLD, 20));
		add(lblTitulo_TermoDeCompromisso, "cell 2 3 11 1,alignx center");
		
		JLabel lblTexto_ExplicacaoFormulario = new JLabel("Este formul\u00E1rio diz respeito as informa\u00E7\u00F5es a cerca do Termo de Compromisso e Plano de Atividades para realiza\u00E7\u00E3o de Est\u00E1gio Curricular");
		lblTexto_ExplicacaoFormulario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTexto_ExplicacaoFormulario.setToolTipText("");
		add(lblTexto_ExplicacaoFormulario, "cell 2 5 11 1,alignx center");
		
		JLabel lblNewLabel = new JLabel("_____________________________________________________________________________________________________________________________________________");
		add(lblNewLabel, "cell 1 6 13 1,alignx center");
		
		JLabel lblCadastro_DadosDaInstituicaoEducadora = new JLabel("Dados da Institui\u00E7\u00E3o Educadora");
		lblCadastro_DadosDaInstituicaoEducadora.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 18));
		add(lblCadastro_DadosDaInstituicaoEducadora, "cell 3 8 9 1,alignx center");
		
		JLabel lblNomeUFCSPA = new JLabel("Institui\u00E7\u00E3o: Universidade Federal de Ci\u00EAncias da Sa\u00FAde de Porto Alegre -UFCSPA");
		lblNomeUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNomeUFCSPA, "cell 1 10 7 1,alignx left");
		
		JLabel lblEnderecoUFCSPA = new JLabel("Rua Sarmento Leite 245, Centro, Porto Alegre -RS     CEP: 90050-170");
		lblEnderecoUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblEnderecoUFCSPA, "cell 1 11 7 1,alignx left");
		
		JLabel lblCadastro_Nome_CoordenadorUFCSPA = new JLabel("Coordenador: ");
		lblCadastro_Nome_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Nome_CoordenadorUFCSPA, "cell 1 12,alignx left");
		
		textField_Cadastro_Nome_CoordenadorUFCSPA = new JTextField();
		textField_Cadastro_Nome_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Nome_CoordenadorUFCSPA, "cell 2 12 7 1,growx");
		textField_Cadastro_Nome_CoordenadorUFCSPA.setColumns(10);		
		
		JLabel lblCadastro_Curso_CoordenadorUFCSPA = new JLabel("Curso: ");
		lblCadastro_Curso_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Curso_CoordenadorUFCSPA, "cell 10 12,alignx trailing");
		
		comboBox_Curso_CoordenadorUFCSPA = new JComboBox();
		comboBox_Curso_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(comboBox_Curso_CoordenadorUFCSPA, "cell 11 12 3 1,growx");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Selecione");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Biomedicina - diurno");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Biomedicina - noturno");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Enfermagem");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Farmácia");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Física Médica");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Fisioterapia");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Fonoaudiologia");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Gastronomia");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Gestão em Saúde");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Informática Biomédica");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Medicina");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Nutrição");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Psicologia");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Quimica Medicinal");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Tecnologia em Alimentos");
		comboBox_Curso_CoordenadorUFCSPA.addItem("Toxicologia Analítica");
		
		JLabel lblCadastro_RG_CoordenadorUFCSPA = new JLabel("RG: ");
		lblCadastro_RG_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_RG_CoordenadorUFCSPA, "cell 1 13,alignx trailing");
		
		textField_Cadastro_RG_CoordenadorUFCSPA = new JTextField();
		add(textField_Cadastro_RG_CoordenadorUFCSPA, "cell 2 13 3 1,growx");
		textField_Cadastro_RG_CoordenadorUFCSPA.setColumns(10);
		
		JLabel lblCadastro_CPF_CoordenadorUFCSPA = new JLabel("CPF: ");
		lblCadastro_CPF_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_CPF_CoordenadorUFCSPA, "cell 5 13,alignx trailing");
		
		
		textField_Cadastro_CPF_CoordenadorUFCSPA = new JFormattedTextField();
		add(textField_Cadastro_CPF_CoordenadorUFCSPA, "cell 6 13 3 1,growx");
		try {
			textField_Cadastro_CPF_CoordenadorUFCSPA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblCadastro_DadosDaUnidadeConcedenteDeEstagio = new JLabel("Dados da Unidade Concedente de Est\u00E1gio");
		lblCadastro_DadosDaUnidadeConcedenteDeEstagio.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 18));
		add(lblCadastro_DadosDaUnidadeConcedenteDeEstagio, "cell 3 15 9 1,alignx center");
		
		JLabel lblCadastro_Instituicao_EmpresaContratante = new JLabel("Institui\u00E7\u00E3o:");
		lblCadastro_Instituicao_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Instituicao_EmpresaContratante, "cell 1 17,alignx trailing");
		
		textField_Cadastro_Nome_EmpresaContratante = new JTextField();
		textField_Cadastro_Nome_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Nome_EmpresaContratante, "cell 2 17 7 1,growx");
		textField_Cadastro_Nome_EmpresaContratante.setColumns(10);
		
		JLabel lblCadastrar_CNPJ_EmpresaContratante = new JLabel("CNPJ: ");
		lblCadastrar_CNPJ_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastrar_CNPJ_EmpresaContratante, "cell 10 17,alignx trailing");
		
		textField_Cadastro_CNPJ_EmpresaContratante = new JFormattedTextField();
		add(textField_Cadastro_CNPJ_EmpresaContratante, "cell 11 17,growx");
		try {
			textField_Cadastro_CNPJ_EmpresaContratante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblCadastro_Endereco_EmpresaContratante = new JLabel("Endere\u00E7o: ");
		lblCadastro_Endereco_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Endereco_EmpresaContratante, "cell 1 18,alignx trailing");
		
		textField_Cadastro_Endereco_EmpresaContratante = new JTextField();
		textField_Cadastro_Endereco_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Endereco_EmpresaContratante, "cell 2 18 7 1,growx");
		textField_Cadastro_Endereco_EmpresaContratante.setColumns(10);
		
		JLabel lblCadastro_CEP_EmpresaContratante = new JLabel("CEP: ");
		lblCadastro_CEP_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_CEP_EmpresaContratante, "cell 10 18,alignx trailing");
		
		textField_Cadastro_CEP_EmpresaContratante = new JFormattedTextField();
		add(textField_Cadastro_CEP_EmpresaContratante, "cell 11 18,growx");
		try {
			textField_Cadastro_CEP_EmpresaContratante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblCadastro_UF_EmpresaContratante = new JLabel("UF: ");
		lblCadastro_UF_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_UF_EmpresaContratante, "cell 12 18,alignx trailing");
		
		comboBox_Cadastro_UF_EmpresaContratante = new JComboBox();
		comboBox_Cadastro_UF_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(comboBox_Cadastro_UF_EmpresaContratante, "cell 13 18,growx");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("AC");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("AL");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("AP");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("AM");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("BA");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("CE");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("DF");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("ES");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("GO");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("MA");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("MT");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("MS");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("MG");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("PA");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("PB");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("PR");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("PE");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("PI");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("RJ");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("RN");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("RS");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("RO");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("RR");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("SC");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("SP");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("SE");
		comboBox_Cadastro_UF_EmpresaContratante.addItem("TO");
		
		JLabel lblCadastro_Cidade_EmpresaContratante = new JLabel("Cidade: ");
		lblCadastro_Cidade_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Cidade_EmpresaContratante, "cell 1 19,alignx trailing");
		
		textField_Cadastro_Cidade_EmpresaContratante = new JTextField();
		textField_Cadastro_Cidade_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Cidade_EmpresaContratante, "cell 2 19 3 1,growx");
		textField_Cadastro_Cidade_EmpresaContratante.setColumns(10);
		
		JLabel lblCadastro_Contratante_EmpresaContratante = new JLabel("Contratante: ");
		lblCadastro_Contratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Contratante_EmpresaContratante, "cell 1 20,alignx trailing");
		
		textField_Cadastro_Contratante_EmpresaContratante = new JTextField();
		textField_Cadastro_Contratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Contratante_EmpresaContratante, "cell 2 20 7 1,growx");
		textField_Cadastro_Contratante_EmpresaContratante.setColumns(10);
		
		JLabel lblCadastro_CargoContratante_EmpresaContratante = new JLabel("Cargo: ");
		lblCadastro_CargoContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_CargoContratante_EmpresaContratante, "cell 10 20,alignx trailing");
		
		textField_Cadastro_CargoContratante_EmpresaContratante = new JTextField();
		textField_Cadastro_CargoContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_CargoContratante_EmpresaContratante, "cell 11 20 2 1,growx");
		textField_Cadastro_CargoContratante_EmpresaContratante.setColumns(10);
		
		JLabel lblCadastro_RGContratante_EmpresaContratante = new JLabel("RG: ");
		lblCadastro_RGContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_RGContratante_EmpresaContratante, "cell 1 21,alignx trailing");
		
		textField_Cadastro_RGContratante_EmpresaContratante = new JTextField();
		textField_Cadastro_RGContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_RGContratante_EmpresaContratante, "cell 2 21 3 1,growx");
		textField_Cadastro_RGContratante_EmpresaContratante.setColumns(10);
		
		JLabel lbl_Cadastro_CPFContratante_EmpresaContratante = new JLabel("CPF: ");
		lbl_Cadastro_CPFContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lbl_Cadastro_CPFContratante_EmpresaContratante, "cell 5 21,alignx trailing");
		
		textField_Cadastro_CPFContratante_EmpresaContratante = new JFormattedTextField();
		add(textField_Cadastro_CPFContratante_EmpresaContratante, "cell 6 21 3 1,growx");
		try {
			textField_Cadastro_CPFContratante_EmpresaContratante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblCadastro_DadosDoEstudante = new JLabel("Dados do Estudante");
		lblCadastro_DadosDoEstudante.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 18));
		add(lblCadastro_DadosDoEstudante, "cell 3 23 9 1,alignx center");
		
		JLabel lbladastro_Nome_Estudante = new JLabel("Nome: ");
		lbladastro_Nome_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lbladastro_Nome_Estudante, "cell 1 25,alignx trailing");
		
		textField_Cadastro_Nome_Estudante = new JTextField();
		textField_Cadastro_Nome_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Nome_Estudante, "cell 2 25 7 1,growx");
		textField_Cadastro_Nome_Estudante.setColumns(10);
		
		JLabel lblCadastro_DataNascimento_Estudante = new JLabel("Nascimento:");
		lblCadastro_DataNascimento_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_DataNascimento_Estudante, "cell 10 25,alignx trailing");
		
		textField_Cadastro_Nascimento_Estudante = new JFormattedTextField();
		add(textField_Cadastro_Nascimento_Estudante, "cell 11 25,growx");
		try {
			textField_Cadastro_Nascimento_Estudante .setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		JLabel lblCadastro_RG_Estudante = new JLabel("RG: ");
		lblCadastro_RG_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_RG_Estudante, "cell 1 26,alignx trailing");
		
		textField_Cadastro_RG_Estudante = new JTextField();
		textField_Cadastro_RG_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_RG_Estudante, "cell 2 26 3 1,growx");
		textField_Cadastro_RG_Estudante.setColumns(10);
		
		JLabel lblCadastro_CFP_Estudante = new JLabel("CPF: ");
		lblCadastro_CFP_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_CFP_Estudante, "cell 5 26,alignx trailing");
		
		textField_Cadastro_CPF_Estudante = new JFormattedTextField();
		add(textField_Cadastro_CPF_Estudante, "cell 6 26 3 1,growx");
		try {
			textField_Cadastro_CPF_Estudante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblCadastro_Endereco_Estudante = new JLabel("Endere\u00E7o: ");
		lblCadastro_Endereco_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Endereco_Estudante, "cell 1 27,alignx trailing");
		
		textField_Cadastro_Endereco_Estudante = new JTextField();
		textField_Cadastro_Endereco_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Endereco_Estudante, "cell 2 27 7 1,growx");
		textField_Cadastro_Endereco_Estudante.setColumns(10);
		
		JLabel lblCadastro_CEP_Estutante = new JLabel("CEP: ");
		lblCadastro_CEP_Estutante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_CEP_Estutante, "cell 10 27,alignx trailing");
		
		textField_Cadastro_CEP_Estudante = new JFormattedTextField();
		add(textField_Cadastro_CEP_Estudante, "cell 11 27,growx");
		try {
			textField_Cadastro_CEP_Estudante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblCadastro_UF_Estudante = new JLabel("UF: ");
		lblCadastro_UF_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_UF_Estudante, "cell 12 27,alignx trailing");
		
		comboBox_Cadastro_UF_Estudante = new JComboBox();
		comboBox_Cadastro_UF_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(comboBox_Cadastro_UF_Estudante, "cell 13 27,growx");
		comboBox_Cadastro_UF_Estudante.addItem("AC");
		comboBox_Cadastro_UF_Estudante.addItem("AL");
		comboBox_Cadastro_UF_Estudante.addItem("AP");
		comboBox_Cadastro_UF_Estudante.addItem("AM");
		comboBox_Cadastro_UF_Estudante.addItem("BA");
		comboBox_Cadastro_UF_Estudante.addItem("CE");
		comboBox_Cadastro_UF_Estudante.addItem("DF");
		comboBox_Cadastro_UF_Estudante.addItem("ES");
		comboBox_Cadastro_UF_Estudante.addItem("GO");
		comboBox_Cadastro_UF_Estudante.addItem("MA");
		comboBox_Cadastro_UF_Estudante.addItem("MT");
		comboBox_Cadastro_UF_Estudante.addItem("MS");
		comboBox_Cadastro_UF_Estudante.addItem("MG");
		comboBox_Cadastro_UF_Estudante.addItem("PA");
		comboBox_Cadastro_UF_Estudante.addItem("PB");
		comboBox_Cadastro_UF_Estudante.addItem("PR");
		comboBox_Cadastro_UF_Estudante.addItem("PE");
		comboBox_Cadastro_UF_Estudante.addItem("PI");
		comboBox_Cadastro_UF_Estudante.addItem("RJ");
		comboBox_Cadastro_UF_Estudante.addItem("RN");
		comboBox_Cadastro_UF_Estudante.addItem("RS");
		comboBox_Cadastro_UF_Estudante.addItem("RO");
		comboBox_Cadastro_UF_Estudante.addItem("RR");
		comboBox_Cadastro_UF_Estudante.addItem("SC");
		comboBox_Cadastro_UF_Estudante.addItem("SP");
		comboBox_Cadastro_UF_Estudante.addItem("SE");
		comboBox_Cadastro_UF_Estudante.addItem("TO");
		
		JLabel lblCadastro_Cidade_Estudante = new JLabel("Cidade: ");
		lblCadastro_Cidade_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Cidade_Estudante, "cell 1 28,alignx trailing");
		
		textField_Cadastro_Cidade_Estudante = new JTextField();
		textField_Cadastro_Cidade_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Cidade_Estudante, "cell 2 28 3 1,growx");
		textField_Cadastro_Cidade_Estudante.setColumns(10);
		
		JLabel lblCadastro_Bairro_Estudante = new JLabel("Bairro: ");
		lblCadastro_Bairro_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Bairro_Estudante, "cell 5 28,alignx trailing");
		
		textField_Cadastro_Bairro_Estudante = new JTextField();
		textField_Cadastro_Bairro_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Bairro_Estudante, "cell 6 28 3 1,growx");
		textField_Cadastro_Bairro_Estudante.setColumns(10);
		
		JLabel lblCadastro_Matricula_Estudante = new JLabel("Matricula: ");
		lblCadastro_Matricula_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Matricula_Estudante, "cell 1 29,alignx trailing");
		
		textField_Cadastro_Matricula_Estudante = new JTextField();
		textField_Cadastro_Matricula_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Matricula_Estudante, "cell 2 29 3 1,growx");
		textField_Cadastro_Matricula_Estudante.setColumns(10);
		
		JLabel lblCadastro_Semestre_Estudante = new JLabel("Semestre: ");
		lblCadastro_Semestre_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Semestre_Estudante, "cell 5 29,alignx trailing");
		
		textField_Cadastro_Semestre_Estudante = new JTextField();
		textField_Cadastro_Semestre_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Semestre_Estudante, "cell 6 29,growx");
		textField_Cadastro_Semestre_Estudante.setColumns(10);
		
		JLabel lblCadastro_Curso_Estudante = new JLabel("Curso: ");
		lblCadastro_Curso_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Curso_Estudante, "cell 10 29,alignx trailing");
		
		comboBox_Cadastro_Curso_Estudante = new JComboBox();
		comboBox_Cadastro_Curso_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(comboBox_Cadastro_Curso_Estudante, "cell 11 29 3 1,growx");
		comboBox_Cadastro_Curso_Estudante.addItem("Selecione");
		comboBox_Cadastro_Curso_Estudante.addItem("Biomedicina - diurno");
		comboBox_Cadastro_Curso_Estudante.addItem("Biomedicina - noturno");
		comboBox_Cadastro_Curso_Estudante.addItem("Enfermagem");
		comboBox_Cadastro_Curso_Estudante.addItem("Farmácia");
		comboBox_Cadastro_Curso_Estudante.addItem("Física Médica");
		comboBox_Cadastro_Curso_Estudante.addItem("Fisioterapia");
		comboBox_Cadastro_Curso_Estudante.addItem("Fonoaudiologia");
		comboBox_Cadastro_Curso_Estudante.addItem("Gastronomia");
		comboBox_Cadastro_Curso_Estudante.addItem("Gestão em Saúde");
		comboBox_Cadastro_Curso_Estudante.addItem("Informática Biomédica");
		comboBox_Cadastro_Curso_Estudante.addItem("Medicina");
		comboBox_Cadastro_Curso_Estudante.addItem("Nutrição");
		comboBox_Cadastro_Curso_Estudante.addItem("Psicologia");
		comboBox_Cadastro_Curso_Estudante.addItem("Quimica Medicinal");
		comboBox_Cadastro_Curso_Estudante.addItem("Tecnologia em Alimentos");
		comboBox_Cadastro_Curso_Estudante.addItem("Toxicologia Analítica");
		
		JLabel lblCadastro_DadosEstagio = new JLabel("Dados do Est\u00E1gio");
		lblCadastro_DadosEstagio.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 18));
		lblCadastro_DadosEstagio.setToolTipText("");
		add(lblCadastro_DadosEstagio, "cell 3 31 9 1");
		
		JLabel lblCadastro_AreaDeAtuacao_DadosEstagio = new JLabel("\u00C1rea de atua\u00E7\u00E3o: ");
		lblCadastro_AreaDeAtuacao_DadosEstagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_AreaDeAtuacao_DadosEstagio, "cell 0 33 2 1,alignx right");
		
		textField_Cadastro_Atuacao_Estagio = new JTextField();
		textField_Cadastro_Atuacao_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Atuacao_Estagio, "cell 2 33 3 1,growx");
		textField_Cadastro_Atuacao_Estagio.setColumns(10);
		
		JLabel lblCadastro_Inicio_Estagio = new JLabel("Data de In\u00EDcio: ");
		lblCadastro_Inicio_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Inicio_Estagio, "cell 5 33 2 1,alignx right");
		
		textField_Cadastro_Inicio_Estagio = new JFormattedTextField();
		add(textField_Cadastro_Inicio_Estagio, "cell 7 33 2 1,growx");
		try {
			textField_Cadastro_Inicio_Estagio .setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblCadastro_Termino_Estagio = new JLabel("Data de T\u00E9rmino: ");
		lblCadastro_Termino_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Termino_Estagio, "cell 10 33 2 1,alignx right");
		
		textField_Cadastro_Termino_Estagio = new JFormattedTextField();
		add(textField_Cadastro_Termino_Estagio, "cell 12 33 2 1,growx");
		try {
			textField_Cadastro_Termino_Estagio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblCadastro_CargaHoraria_Estagio = new JLabel("Carga hor\u00E1ria semanal: ");
		lblCadastro_CargaHoraria_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_CargaHoraria_Estagio, "cell 0 34 2 1,alignx right");
		
		textField_Cadastro_CargaHoraria_Estagio = new JTextField();
		textField_Cadastro_CargaHoraria_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_CargaHoraria_Estagio, "cell 2 34,growx");
		textField_Cadastro_CargaHoraria_Estagio.setColumns(10);
		
		JLabel lblCadastro_ValorBolsa_Estagio = new JLabel("Valor da Bolsa: ");
		lblCadastro_ValorBolsa_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_ValorBolsa_Estagio, "cell 5 34 2 1,alignx right");
		
		textField_Cadastro_ValorDaolsa_Estagio = new JTextField();
		textField_Cadastro_ValorDaolsa_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_ValorDaolsa_Estagio, "cell 7 34 2 1,growx");
		textField_Cadastro_ValorDaolsa_Estagio.setColumns(10);
		
		JLabel lblCadastro_TipoDeEstagio = new JLabel("Est\u00E1gio obrigat\u00F3rio: ");
		lblCadastro_TipoDeEstagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_TipoDeEstagio, "cell 0 35 2 1,alignx right");
		
		rdbtnCadastro_EstagioObrigatorio_SIM = new JRadioButton("Sim");
		rdbtnCadastro_EstagioObrigatorio_SIM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rdbtnCadastro_EstagioObrigatorio_SIM, "cell 2 35,alignx center");
		
		rdbtnCadastro_EstagioObrigatorio_NAO = new JRadioButton("N\u00E3o");
		rdbtnCadastro_EstagioObrigatorio_NAO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rdbtnCadastro_EstagioObrigatorio_NAO, "cell 3 35,alignx center");
		
		bg_EstagioObrigatorio_Estagio = new ButtonGroup();
		bg_EstagioObrigatorio_Estagio.add(rdbtnCadastro_EstagioObrigatorio_SIM);
		bg_EstagioObrigatorio_Estagio.add(rdbtnCadastro_EstagioObrigatorio_NAO);
		
		
		JLabel lblCadastro_ValeTransporte_Estagio = new JLabel("Vale transporte: ");
		lblCadastro_ValeTransporte_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_ValeTransporte_Estagio, "cell 5 35 2 1,alignx right");
		
		rdbtnCadastro_ValeTransporte_SIM = new JRadioButton("Sim");
		rdbtnCadastro_ValeTransporte_SIM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rdbtnCadastro_ValeTransporte_SIM, "cell 7 35");
		
		rdbtnCadastro_ValeTransporte_NAO = new JRadioButton("Nao");
		rdbtnCadastro_ValeTransporte_NAO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rdbtnCadastro_ValeTransporte_NAO, "cell 8 35");
		
		bg_ValeTransporte = new ButtonGroup();
		bg_ValeTransporte.add(rdbtnCadastro_ValeTransporte_SIM);
		bg_ValeTransporte.add(rdbtnCadastro_ValeTransporte_NAO);
		
		JLabel lblCadastro_Valor_Estagio = new JLabel("Valor: ");
		lblCadastro_Valor_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Valor_Estagio, "cell 10 35,alignx right");
		
		textField_Cadastro_ValorValeTransporte_Estagio = new JTextField();
		textField_Cadastro_ValorValeTransporte_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_ValorValeTransporte_Estagio, "cell 11 35,growx");
		textField_Cadastro_ValorValeTransporte_Estagio.setColumns(10);
		
		JLabel lblCadastro_SeguroAcidente = new JLabel("Seguro de acidentes: ");
		lblCadastro_SeguroAcidente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_SeguroAcidente, "cell 0 36 2 1,alignx right");
		
		rdbtnCadastro_SeguroAcidente_SIM = new JRadioButton("Sim");
		rdbtnCadastro_SeguroAcidente_SIM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rdbtnCadastro_SeguroAcidente_SIM, "cell 2 36,alignx center");
		
		rdbtnCadastro_SeguroAcidente_NAO = new JRadioButton("N\u00E3o");
		rdbtnCadastro_SeguroAcidente_NAO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rdbtnCadastro_SeguroAcidente_NAO, "cell 3 36,alignx center");
		
		bg_SeguroAcidente_Estagio = new ButtonGroup();
		bg_SeguroAcidente_Estagio.add(rdbtnCadastro_SeguroAcidente_SIM);
		bg_SeguroAcidente_Estagio.add(rdbtnCadastro_SeguroAcidente_NAO);
		
		JLabel lblCadastro_ValeRefeicao = new JLabel("Vale refei\u00E7\u00E3o: ");
		lblCadastro_ValeRefeicao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_ValeRefeicao, "cell 5 36 2 1,alignx right");
		
		rdbtnCadastro_ValeRefeicao_SIM = new JRadioButton("Sim");
		rdbtnCadastro_ValeRefeicao_SIM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rdbtnCadastro_ValeRefeicao_SIM, "cell 7 36");
		
		rdbtnCadastro_ValeRefeicao_NAO = new JRadioButton("N\u00E3o");
		rdbtnCadastro_ValeRefeicao_NAO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rdbtnCadastro_ValeRefeicao_NAO, "cell 8 36");
		
		bg_ValeRefeicao_Estagio = new ButtonGroup();
		bg_ValeRefeicao_Estagio.add(rdbtnCadastro_ValeRefeicao_SIM);
		bg_ValeRefeicao_Estagio.add(rdbtnCadastro_ValeRefeicao_NAO);
		
		JLabel lblCadastro_ValorValeRefeicao_Estagio = new JLabel("Valor: ");
		lblCadastro_ValorValeRefeicao_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_ValorValeRefeicao_Estagio, "cell 10 36,alignx right");
		
		textField_Cadastro_ValorValeRefeicao_Estagio = new JTextField();
		textField_Cadastro_ValorValeRefeicao_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_ValorValeRefeicao_Estagio, "cell 11 36,growx");
		textField_Cadastro_ValorValeRefeicao_Estagio.setColumns(10);
		
		JLabel lblCadastro_Seguradora_Estagio = new JLabel("Seguradora: ");
		lblCadastro_Seguradora_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Seguradora_Estagio, "cell 1 37,alignx right");
		
		textField_Cadastro_Seguradora_Estagio = new JTextField();
		textField_Cadastro_Seguradora_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Seguradora_Estagio, "cell 2 37 7 1,growx");
		textField_Cadastro_Seguradora_Estagio.setColumns(10);
		
		JLabel lblCadastro_Apolice_Seguradora = new JLabel("Ap\u00F3lice: ");
		lblCadastro_Apolice_Seguradora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Apolice_Seguradora, "cell 10 37,alignx right");
		
		textField_Cadastro_Apolice_Estagio = new JTextField();
		textField_Cadastro_Apolice_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_Apolice_Estagio, "cell 11 37 3 1,growx");
		textField_Cadastro_Apolice_Estagio.setColumns(10);
		
		JLabel lblCadastro_ProfessorResponsavel_Estagio = new JLabel("Professor respons\u00E1vel: ");
		lblCadastro_ProfessorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_ProfessorResponsavel_Estagio, "cell 0 38 2 1,alignx right");
		
		textField_Cadastro_ProfessorResponsavel_Estagio = new JTextField();
		textField_Cadastro_ProfessorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_ProfessorResponsavel_Estagio, "cell 2 38 7 1,growx");
		textField_Cadastro_ProfessorResponsavel_Estagio.setColumns(10);
		
		JLabel lblCadastro_SIAPE_Estagio = new JLabel("SIAPE: ");
		lblCadastro_SIAPE_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_SIAPE_Estagio, "cell 10 38,alignx trailing");
		
		textField_Cadastro_SIAPE_Estagio = new JTextField();
		textField_Cadastro_SIAPE_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_SIAPE_Estagio, "cell 11 38 3 1,growx");
		textField_Cadastro_SIAPE_Estagio.setColumns(10);
		
		JLabel lblCadastro_OrientadorResponsavel_Estagio = new JLabel("Orientador respons\u00E1vel: ");
		lblCadastro_OrientadorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_OrientadorResponsavel_Estagio, "cell 0 39 2 1,alignx right");
		
		textField_Cadastro_OrientadorResponsavel_Estagio = new JTextField();
		textField_Cadastro_OrientadorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_OrientadorResponsavel_Estagio, "cell 2 39 7 1,growx");
		textField_Cadastro_OrientadorResponsavel_Estagio.setColumns(10);
		
		JLabel lblCadastro_CargoOrientador_Estagio = new JLabel("Cargo: ");
		lblCadastro_CargoOrientador_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_CargoOrientador_Estagio, "cell 10 39,alignx trailing");
		
		textField_Cadastro_CargoOrientadorResponsavel_Estagio = new JTextField();
		textField_Cadastro_CargoOrientadorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Cadastro_CargoOrientadorResponsavel_Estagio, "cell 11 39 3 1,growx");
		textField_Cadastro_CargoOrientadorResponsavel_Estagio.setColumns(10);
		
		JLabel lblCadastro_Atividades_Estagio = new JLabel("Atividades realizadas: ");
		lblCadastro_Atividades_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCadastro_Atividades_Estagio, "cell 0 41 2 1,alignx right");
		
		textPane_AtividadesRealizadas_Estagio = new JTextPane();
		add(textPane_AtividadesRealizadas_Estagio, "cell 2 41 12 3,grow");
		
		btnCadastro_Cadastrar = new JButton("Cadastrar");
		btnCadastro_Cadastrar.setIcon(new ImageIcon(Cadastro.class.getResource("/icones_logos/check.png")));
		btnCadastro_Cadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnCadastro_Cadastrar, "cell 11 45");
		
		btnCadastro_Limpar = new JButton("Limpar");
		btnCadastro_Limpar.setIcon(new ImageIcon(Cadastro.class.getResource("/icones_logos/broom.png")));
		btnCadastro_Limpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnCadastro_Limpar, "cell 12 45");
		
		btnCadastro_Voltar = new JButton("Voltar");
		btnCadastro_Voltar.setIcon(new ImageIcon(Cadastro.class.getResource("/icones_logos/back.png")));
		btnCadastro_Voltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnCadastro_Voltar, "cell 13 45");
	}

	public JTextField getTextField_Cadastro_Nome_CoordenadorUFCSPA() {
		return textField_Cadastro_Nome_CoordenadorUFCSPA;
	}

	public void setTextField_Cadastro_Nome_CoordenadorUFCSPA(JTextField textField_Cadastro_Nome_CoordenadorUFCSPA) {
		this.textField_Cadastro_Nome_CoordenadorUFCSPA = textField_Cadastro_Nome_CoordenadorUFCSPA;
	}

	public JTextField getTextField_Cadastro_RG_CoordenadorUFCSPA() {
		return textField_Cadastro_RG_CoordenadorUFCSPA;
	}

	public void setTextField_Cadastro_RG_CoordenadorUFCSPA(JTextField textField_Cadastro_RG_CoordenadorUFCSPA) {
		this.textField_Cadastro_RG_CoordenadorUFCSPA = textField_Cadastro_RG_CoordenadorUFCSPA;
	}

	public JTextField getTextField_Cadastro_Nome_EmpresaContratante() {
		return textField_Cadastro_Nome_EmpresaContratante;
	}

	public void setTextField_Cadastro_Nome_EmpresaContratante(JTextField textField_Cadastro_Nome_EmpresaContratante) {
		this.textField_Cadastro_Nome_EmpresaContratante = textField_Cadastro_Nome_EmpresaContratante;
	}

	public JTextField getTextField_Cadastro_Endereco_EmpresaContratante() {
		return textField_Cadastro_Endereco_EmpresaContratante;
	}

	public void setTextField_Cadastro_Endereco_EmpresaContratante(
			JTextField textField_Cadastro_Endereco_EmpresaContratante) {
		this.textField_Cadastro_Endereco_EmpresaContratante = textField_Cadastro_Endereco_EmpresaContratante;
	}

	public JTextField getTextField_Cadastro_Cidade_EmpresaContratante() {
		return textField_Cadastro_Cidade_EmpresaContratante;
	}

	public void setTextField_Cadastro_Cidade_EmpresaContratante(JTextField textField_Cadastro_Cidade_EmpresaContratante) {
		this.textField_Cadastro_Cidade_EmpresaContratante = textField_Cadastro_Cidade_EmpresaContratante;
	}

	public JTextField getTextField_Cadastro_Contratante_EmpresaContratante() {
		return textField_Cadastro_Contratante_EmpresaContratante;
	}

	public void setTextField_Cadastro_Contratante_EmpresaContratante(
			JTextField textField_Cadastro_Contratante_EmpresaContratante) {
		this.textField_Cadastro_Contratante_EmpresaContratante = textField_Cadastro_Contratante_EmpresaContratante;
	}

	public JTextField getTextField_Cadastro_CargoContratante_EmpresaContratante() {
		return textField_Cadastro_CargoContratante_EmpresaContratante;
	}

	public void setTextField_Cadastro_CargoContratante_EmpresaContratante(
			JTextField textField_Cadastro_CargoContratante_EmpresaContratante) {
		this.textField_Cadastro_CargoContratante_EmpresaContratante = textField_Cadastro_CargoContratante_EmpresaContratante;
	}

	public JTextField getTextField_Cadastro_RGContratante_EmpresaContratante() {
		return textField_Cadastro_RGContratante_EmpresaContratante;
	}

	public void setTextField_Cadastro_RGContratante_EmpresaContratante(
			JTextField textField_Cadastro_RGContratante_EmpresaContratante) {
		this.textField_Cadastro_RGContratante_EmpresaContratante = textField_Cadastro_RGContratante_EmpresaContratante;
	}

	public JTextField getTextField_Cadastro_Nome_Estudante() {
		return textField_Cadastro_Nome_Estudante;
	}

	public void setTextField_Cadastro_Nome_Estudante(JTextField textField_Cadastro_Nome_Estudante) {
		this.textField_Cadastro_Nome_Estudante = textField_Cadastro_Nome_Estudante;
	}

	public JTextField getTextField_Cadastro_RG_Estudante() {
		return textField_Cadastro_RG_Estudante;
	}

	public void setTextField_Cadastro_RG_Estudante(JTextField textField_Cadastro_RG_Estudante) {
		this.textField_Cadastro_RG_Estudante = textField_Cadastro_RG_Estudante;
	}

	public JTextField getTextField_Cadastro_Endereco_Estudante() {
		return textField_Cadastro_Endereco_Estudante;
	}

	public void setTextField_Cadastro_Endereco_Estudante(JTextField textField_Cadastro_Endereco_Estudante) {
		this.textField_Cadastro_Endereco_Estudante = textField_Cadastro_Endereco_Estudante;
	}

	public JTextField getTextField_Cadastro_Cidade_Estudante() {
		return textField_Cadastro_Cidade_Estudante;
	}

	public void setTextField_Cadastro_Cidade_Estudante(JTextField textField_Cadastro_Cidade_Estudante) {
		this.textField_Cadastro_Cidade_Estudante = textField_Cadastro_Cidade_Estudante;
	}

	public JTextField getTextField_Cadastro_Bairro_Estudante() {
		return textField_Cadastro_Bairro_Estudante;
	}

	public void setTextField_Cadastro_Bairro_Estudante(JTextField textField_Cadastro_Bairro_Estudante) {
		this.textField_Cadastro_Bairro_Estudante = textField_Cadastro_Bairro_Estudante;
	}

	public JTextField getTextField_Cadastro_Matricula_Estudante() {
		return textField_Cadastro_Matricula_Estudante;
	}

	public void setTextField_Cadastro_Matricula_Estudante(JTextField textField_Cadastro_Matricula_Estudante) {
		this.textField_Cadastro_Matricula_Estudante = textField_Cadastro_Matricula_Estudante;
	}

	public JTextField getTextField_Cadastro_Semestre_Estudante() {
		return textField_Cadastro_Semestre_Estudante;
	}

	public void setTextField_Cadastro_Semestre_Estudante(JTextField textField_Cadastro_Semestre_Estudante) {
		this.textField_Cadastro_Semestre_Estudante = textField_Cadastro_Semestre_Estudante;
	}

	public JTextField getTextField_Cadastro_Atuacao_Estagio() {
		return textField_Cadastro_Atuacao_Estagio;
	}

	public void setTextField_Cadastro_Atuacao_Estagio(JTextField textField_Cadastro_Atuacao_Estagio) {
		this.textField_Cadastro_Atuacao_Estagio = textField_Cadastro_Atuacao_Estagio;
	}

	public JTextField getTextField_Cadastro_CargaHoraria_Estagio() {
		return textField_Cadastro_CargaHoraria_Estagio;
	}

	public void setTextField_Cadastro_CargaHoraria_Estagio(JTextField textField_Cadastro_CargaHoraria_Estagio) {
		this.textField_Cadastro_CargaHoraria_Estagio = textField_Cadastro_CargaHoraria_Estagio;
	}

	public JTextField getTextField_Cadastro_ValorDaolsa_Estagio() {
		return textField_Cadastro_ValorDaolsa_Estagio;
	}

	public void setTextField_Cadastro_ValorDaolsa_Estagio(JTextField textField_Cadastro_ValorDaolsa_Estagio) {
		this.textField_Cadastro_ValorDaolsa_Estagio = textField_Cadastro_ValorDaolsa_Estagio;
	}

	public JTextField getTextField_Cadastro_ValorValeTransporte_Estagio() {
		return textField_Cadastro_ValorValeTransporte_Estagio;
	}

	public void setTextField_Cadastro_ValorValeTransporte_Estagio(
			JTextField textField_Cadastro_ValorValeTransporte_Estagio) {
		this.textField_Cadastro_ValorValeTransporte_Estagio = textField_Cadastro_ValorValeTransporte_Estagio;
	}

	public JTextField getTextField_Cadastro_ValorValeRefeicao_Estagio() {
		return textField_Cadastro_ValorValeRefeicao_Estagio;
	}

	public void setTextField_Cadastro_ValorValeRefeicao_Estagio(JTextField textField_Cadastro_ValorValeRefeicao_Estagio) {
		this.textField_Cadastro_ValorValeRefeicao_Estagio = textField_Cadastro_ValorValeRefeicao_Estagio;
	}

	public JTextField getTextField_Cadastro_Seguradora_Estagio() {
		return textField_Cadastro_Seguradora_Estagio;
	}

	public void setTextField_Cadastro_Seguradora_Estagio(JTextField textField_Cadastro_Seguradora_Estagio) {
		this.textField_Cadastro_Seguradora_Estagio = textField_Cadastro_Seguradora_Estagio;
	}

	public JTextField getTextField_Cadastro_Apolice_Estagio() {
		return textField_Cadastro_Apolice_Estagio;
	}

	public void setTextField_Cadastro_Apolice_Estagio(JTextField textField_Cadastro_Apolice_Estagio) {
		this.textField_Cadastro_Apolice_Estagio = textField_Cadastro_Apolice_Estagio;
	}

	public JTextField getTextField_Cadastro_ProfessorResponsavel_Estagio() {
		return textField_Cadastro_ProfessorResponsavel_Estagio;
	}

	public void setTextField_Cadastro_ProfessorResponsavel_Estagio(
			JTextField textField_Cadastro_ProfessorResponsavel_Estagio) {
		this.textField_Cadastro_ProfessorResponsavel_Estagio = textField_Cadastro_ProfessorResponsavel_Estagio;
	}

	public JTextField getTextField_Cadastro_SIAPE_Estagio() {
		return textField_Cadastro_SIAPE_Estagio;
	}

	public void setTextField_Cadastro_SIAPE_Estagio(JTextField textField_Cadastro_SIAPE_Estagio) {
		this.textField_Cadastro_SIAPE_Estagio = textField_Cadastro_SIAPE_Estagio;
	}

	public JTextField getTextField_Cadastro_OrientadorResponsavel_Estagio() {
		return textField_Cadastro_OrientadorResponsavel_Estagio;
	}

	public void setTextField_Cadastro_OrientadorResponsavel_Estagio(
			JTextField textField_Cadastro_OrientadorResponsavel_Estagio) {
		this.textField_Cadastro_OrientadorResponsavel_Estagio = textField_Cadastro_OrientadorResponsavel_Estagio;
	}

	public JTextField getTextField_Cadastro_CargoOrientadorResponsavel_Estagio() {
		return textField_Cadastro_CargoOrientadorResponsavel_Estagio;
	}

	public void setTextField_Cadastro_CargoOrientadorResponsavel_Estagio(
			JTextField textField_Cadastro_CargoOrientadorResponsavel_Estagio) {
		this.textField_Cadastro_CargoOrientadorResponsavel_Estagio = textField_Cadastro_CargoOrientadorResponsavel_Estagio;
	}

	public JFormattedTextField getTextField_Cadastro_CPF_CoordenadorUFCSPA() {
		return textField_Cadastro_CPF_CoordenadorUFCSPA;
	}

	public void setTextField_Cadastro_CPF_CoordenadorUFCSPA(JFormattedTextField textField_Cadastro_CPF_CoordenadorUFCSPA) {
		this.textField_Cadastro_CPF_CoordenadorUFCSPA = textField_Cadastro_CPF_CoordenadorUFCSPA;
	}

	public JFormattedTextField getTextField_Cadastro_CNPJ_EmpresaContratante() {
		return textField_Cadastro_CNPJ_EmpresaContratante;
	}

	public void setTextField_Cadastro_CNPJ_EmpresaContratante(
			JFormattedTextField textField_Cadastro_CNPJ_EmpresaContratante) {
		this.textField_Cadastro_CNPJ_EmpresaContratante = textField_Cadastro_CNPJ_EmpresaContratante;
	}

	public JFormattedTextField getTextField_Cadastro_CEP_EmpresaContratante() {
		return textField_Cadastro_CEP_EmpresaContratante;
	}

	public void setTextField_Cadastro_CEP_EmpresaContratante(
			JFormattedTextField textField_Cadastro_CEP_EmpresaContratante) {
		this.textField_Cadastro_CEP_EmpresaContratante = textField_Cadastro_CEP_EmpresaContratante;
	}

	public JFormattedTextField getTextField_Cadastro_CPFContratante_EmpresaContratante() {
		return textField_Cadastro_CPFContratante_EmpresaContratante;
	}

	public void setTextField_Cadastro_CPFContratante_EmpresaContratante(
			JFormattedTextField textField_Cadastro_CPFContratante_EmpresaContratante) {
		this.textField_Cadastro_CPFContratante_EmpresaContratante = textField_Cadastro_CPFContratante_EmpresaContratante;
	}

	public JFormattedTextField getTextField_Cadastro_CPF_Estudante() {
		return textField_Cadastro_CPF_Estudante;
	}

	public void setTextField_Cadastro_CPF_Estudante(JFormattedTextField textField_Cadastro_CPF_Estudante) {
		this.textField_Cadastro_CPF_Estudante = textField_Cadastro_CPF_Estudante;
	}

	public JFormattedTextField getTextField_Cadastro_Nascimento_Estudante() {
		return textField_Cadastro_Nascimento_Estudante;
	}

	public void setTextField_Cadastro_Nascimento_Estudante(JFormattedTextField textField_Cadastro_Nascimento_Estudante) {
		this.textField_Cadastro_Nascimento_Estudante = textField_Cadastro_Nascimento_Estudante;
	}

	public JFormattedTextField getTextField_Cadastro_CEP_Estudante() {
		return textField_Cadastro_CEP_Estudante;
	}

	public void setTextField_Cadastro_CEP_Estudante(JFormattedTextField textField_Cadastro_CEP_Estudante) {
		this.textField_Cadastro_CEP_Estudante = textField_Cadastro_CEP_Estudante;
	}

	public JFormattedTextField getTextField_Cadastro_Inicio_Estagio() {
		return textField_Cadastro_Inicio_Estagio;
	}

	public void setTextField_Cadastro_Inicio_Estagio(JFormattedTextField textField_Cadastro_Inicio_Estagio) {
		this.textField_Cadastro_Inicio_Estagio = textField_Cadastro_Inicio_Estagio;
	}

	public JFormattedTextField getTextField_Cadastro_Termino_Estagio() {
		return textField_Cadastro_Termino_Estagio;
	}

	public void setTextField_Cadastro_Termino_Estagio(JFormattedTextField textField_Cadastro_Termino_Estagio) {
		this.textField_Cadastro_Termino_Estagio = textField_Cadastro_Termino_Estagio;
	}

	public JButton getBtnCadastro_Cadastrar() {
		return btnCadastro_Cadastrar;
	}

	public void setBtnCadastro_Cadastrar(JButton btnCadastro_Cadastrar) {
		this.btnCadastro_Cadastrar = btnCadastro_Cadastrar;
	}

	public JButton getBtnCadastro_Limpar() {
		return btnCadastro_Limpar;
	}

	public void setBtnCadastro_Limpar(JButton btnCadastro_Limpar) {
		this.btnCadastro_Limpar = btnCadastro_Limpar;
	}

	public JButton getBtnCadastro_Voltar() {
		return btnCadastro_Voltar;
	}

	public void setBtnCadastro_Voltar(JButton btnCadastro_Voltar) {
		this.btnCadastro_Voltar = btnCadastro_Voltar;
	}

	public JComboBox getComboBox_Curso_CoordenadorUFCSPA() {
		return comboBox_Curso_CoordenadorUFCSPA;
	}

	public void setComboBox_Curso_CoordenadorUFCSPA(JComboBox comboBox_Curso_CoordenadorUFCSPA) {
		this.comboBox_Curso_CoordenadorUFCSPA = comboBox_Curso_CoordenadorUFCSPA;
	}

	public JComboBox getComboBox_Cadastro_UF_EmpresaContratante() {
		return comboBox_Cadastro_UF_EmpresaContratante;
	}

	public void setComboBox_Cadastro_UF_EmpresaContratante(JComboBox comboBox_Cadastro_UF_EmpresaContratante) {
		this.comboBox_Cadastro_UF_EmpresaContratante = comboBox_Cadastro_UF_EmpresaContratante;
	}

	public JComboBox getComboBox_Cadastro_UF_Estudante() {
		return comboBox_Cadastro_UF_Estudante;
	}

	public void setComboBox_Cadastro_UF_Estudante(JComboBox comboBox_Cadastro_UF_Estudante) {
		this.comboBox_Cadastro_UF_Estudante = comboBox_Cadastro_UF_Estudante;
	}

	public JComboBox getComboBox_Cadastro_Curso_Estudante() {
		return comboBox_Cadastro_Curso_Estudante;
	}

	public void setComboBox_Cadastro_Curso_Estudante(JComboBox comboBox_Cadastro_Curso_Estudante) {
		this.comboBox_Cadastro_Curso_Estudante = comboBox_Cadastro_Curso_Estudante;
	}

	public JTextPane getTextPane_AtividadesRealizadas_Estagio() {
		return textPane_AtividadesRealizadas_Estagio;
	}

	public void setTextPane_AtividadesRealizadas_Estagio(JTextPane textPane_AtividadesRealizadas_Estagio) {
		this.textPane_AtividadesRealizadas_Estagio = textPane_AtividadesRealizadas_Estagio;
	}

	public ButtonGroup getBg_EstagioObrigatorio_Estagio() {
		return bg_EstagioObrigatorio_Estagio;
	}

	public void setBg_EstagioObrigatorio_Estagio(ButtonGroup bg_EstagioObrigatorio_Estagio) {
		this.bg_EstagioObrigatorio_Estagio = bg_EstagioObrigatorio_Estagio;
	}

	public ButtonGroup getBg_ValeRefeicao_Estagio() {
		return bg_ValeRefeicao_Estagio;
	}

	public void setBg_ValeRefeicao_Estagio(ButtonGroup bg_ValeRefeicao_Estagio) {
		this.bg_ValeRefeicao_Estagio = bg_ValeRefeicao_Estagio;
	}

	public ButtonGroup getBg_SeguroAcidente_Estagio() {
		return bg_SeguroAcidente_Estagio;
	}

	public void setBg_SeguroAcidente_Estagio(ButtonGroup bg_SeguroAcidente_Estagio) {
		this.bg_SeguroAcidente_Estagio = bg_SeguroAcidente_Estagio;
	}

	public ButtonGroup getBg_ValeTransporte() {
		return bg_ValeTransporte;
	}

	public void setBg_ValeTransporte(ButtonGroup bg_ValeTransporte) {
		this.bg_ValeTransporte = bg_ValeTransporte;
	}

	public JRadioButton getRdbtnCadastro_ValeRefeicao_NAO() {
		return rdbtnCadastro_ValeRefeicao_NAO;
	}

	public void setRdbtnCadastro_ValeRefeicao_NAO(JRadioButton rdbtnCadastro_ValeRefeicao_NAO) {
		this.rdbtnCadastro_ValeRefeicao_NAO = rdbtnCadastro_ValeRefeicao_NAO;
	}

	public JRadioButton getRdbtnCadastro_ValeRefeicao_SIM() {
		return rdbtnCadastro_ValeRefeicao_SIM;
	}

	public void setRdbtnCadastro_ValeRefeicao_SIM(JRadioButton rdbtnCadastro_ValeRefeicao_SIM) {
		this.rdbtnCadastro_ValeRefeicao_SIM = rdbtnCadastro_ValeRefeicao_SIM;
	}

	public JRadioButton getRdbtnCadastro_ValeTransporte_NAO() {
		return rdbtnCadastro_ValeTransporte_NAO;
	}

	public void setRdbtnCadastro_ValeTransporte_NAO(JRadioButton rdbtnCadastro_ValeTransporte_NAO) {
		this.rdbtnCadastro_ValeTransporte_NAO = rdbtnCadastro_ValeTransporte_NAO;
	}

	public JRadioButton getRdbtnCadastro_ValeTransporte_SIM() {
		return rdbtnCadastro_ValeTransporte_SIM;
	}

	public void setRdbtnCadastro_ValeTransporte_SIM(JRadioButton rdbtnCadastro_ValeTransporte_SIM) {
		this.rdbtnCadastro_ValeTransporte_SIM = rdbtnCadastro_ValeTransporte_SIM;
	}

	public JRadioButton getRdbtnCadastro_SeguroAcidente_NAO() {
		return rdbtnCadastro_SeguroAcidente_NAO;
	}

	public void setRdbtnCadastro_SeguroAcidente_NAO(JRadioButton rdbtnCadastro_SeguroAcidente_NAO) {
		this.rdbtnCadastro_SeguroAcidente_NAO = rdbtnCadastro_SeguroAcidente_NAO;
	}

	public JRadioButton getRdbtnCadastro_SeguroAcidente_SIM() {
		return rdbtnCadastro_SeguroAcidente_SIM;
	}

	public void setRdbtnCadastro_SeguroAcidente_SIM(JRadioButton rdbtnCadastro_SeguroAcidente_SIM) {
		this.rdbtnCadastro_SeguroAcidente_SIM = rdbtnCadastro_SeguroAcidente_SIM;
	}

	public JRadioButton getRdbtnCadastro_EstagioObrigatorio_NAO() {
		return rdbtnCadastro_EstagioObrigatorio_NAO;
	}

	public void setRdbtnCadastro_EstagioObrigatorio_NAO(JRadioButton rdbtnCadastro_EstagioObrigatorio_NAO) {
		this.rdbtnCadastro_EstagioObrigatorio_NAO = rdbtnCadastro_EstagioObrigatorio_NAO;
	}

	public JRadioButton getRdbtnCadastro_EstagioObrigatorio_SIM() {
		return rdbtnCadastro_EstagioObrigatorio_SIM;
	}

	public void setRdbtnCadastro_EstagioObrigatorio_SIM(JRadioButton rdbtnCadastro_EstagioObrigatorio_SIM) {
		this.rdbtnCadastro_EstagioObrigatorio_SIM = rdbtnCadastro_EstagioObrigatorio_SIM;
	}
}
