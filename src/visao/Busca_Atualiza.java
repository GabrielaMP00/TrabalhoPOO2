package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;

public class Busca_Atualiza extends JPanel {
	private JTextField textField_Buscar_Nome_CoordenadorUFCSPA;
	private JTextField textField_Buscar_RG_CoordenadorUFCSPA;
	
	private JTextField textField_Buscar_Nome_EmpresaContratante;
	private JTextField textField_Buscar_Endereco_EmpresaContratante;
	private JTextField textField_Buscar_Cidade_EmpresaContratante;
	private JTextField textField_Buscar_Contratante_EmpresaContratante;
	private JTextField textField_Buscar_CargoContratante_EmpresaContratante;
	private JTextField textField_Buscar_RGContratante_EmpresaContratante;
	
	private JTextField textField_Buscar_Nome_Estudante;
	private JTextField textField_Buscar_RG_Estudante;
	private JTextField textField_Buscar_Endereco_Estudante;
	private JTextField textField_Buscar_Cidade_Estudante;
	private JTextField textField_Buscar_Bairro_Estudante;
	private JTextField textField_Buscar_Matricula_Estudante;
	private JTextField textField_Buscar_Semestre_Estudante;
	
	private JTextField textField_Buscar_Atuacao_Estagio;
	private JTextField textField_Buscar_CargaHoraria_Estagio;
	private JTextField textField_Buscar_ValorDaolsa_Estagio;
	private JTextField textField_Buscar_ValorValeTransporte_Estagio;
	private JTextField textField_Buscar_ValorValeRefeicao_Estagio;
	private JTextField textField_Buscar_Seguradora_Estagio;
	private JTextField textField_Buscar_Apolice_Estagio;
	private JTextField textField_Buscar_ProfessorResponsavel_Estagio;
	private JTextField textField_Buscar_SIAPE_Estagio;
	private JTextField textField_Buscar_OrientadorResponsavel_Estagio;
	private JTextField textField_Buscar_CargoOrientadorResponsavel_Estagio;
	
	private JTextPane textPane_AtividadesRealizadas_Estagio;
	private JTextField textField_Buscar_EstagioObrigatorio;
	private JTextField textField_Buscar_SeguroAcidente;
	private JTextField textField_Buscar_ValeTransporte;
	private JTextField textField_Buscar_ValeRefeicao;
	private JTextField textField_Buscar_CursoCoordenadorUFCSPA;
	private JTextField textField_Buscar_CursoEstudante;
	private JTextField textField_Buscar_UFEmpresa;
	private JTextField textField_Buscar_UFEstudante;
	
	private JFormattedTextField textField_Buscar_CPF_QUERYBANCO;
	private JFormattedTextField textField_Buscar_CPF_CoordenadorUFCSPA;
	private JFormattedTextField textField_Buscar_CPFContratante_EmpresaContratante;
	private JFormattedTextField textField_Buscar_CNPJ_EmpresaContratante;
	private JFormattedTextField textField_Buscar_CEP_EmpresaContratante;
	private JFormattedTextField textField_Buscar_Nascimento_Estudante;
	private JFormattedTextField textField_Buscar_Inicio_Estagio;
	private JFormattedTextField textField_Buscar_Termino_Estagio;
	private JFormattedTextField textField_Buscar_CEP_Estudante;

	private JButton btnBuscar;
	private JButton btnAtualizar;
	private JButton btnLimpar;
	private JButton btnVoltar;
	
	public Busca_Atualiza() {
		setBackground(new Color(240, 248, 255));
		setLayout(new MigLayout("", "[100px,center][100px,center][100px,grow,center][100px,grow,center][100px,grow,center][100.00px,grow,center][100px,grow,center][100px,grow,center][100px,grow,center][100px,center][100px,center][81.00px,grow,center][100px,grow,center][82.00px,grow,center][100px][]", "[8.00][25.00][25][][8.00][15.00][][0.00][15.00][15.00][][][grow][][0.00][][][][][][grow][][0.00][][][][][][grow][][0.00][][][][][][][][1.00][][31.00][33.00][29.00,grow]"));
		
		JLabel lblDigiteOCPF = new JLabel("Digite o CPF do estudante que deseja buscar: ");
		lblDigiteOCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblDigiteOCPF, "cell 1 2 4 1,alignx center");
		
		textField_Buscar_CPF_QUERYBANCO = new JFormattedTextField();
		textField_Buscar_CPF_QUERYBANCO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(textField_Buscar_CPF_QUERYBANCO, "cell 5 2 4 1,growx");
		try {
			textField_Buscar_CPF_QUERYBANCO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(Busca_Atualiza.class.getResource("/icones_logos/zoom-tool.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnBuscar, "cell 9 2,growx");
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setIcon(new ImageIcon(Busca_Atualiza.class.getResource("/icones_logos/save.png")));
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnAtualizar, "cell 10 2,growx");
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(Busca_Atualiza.class.getResource("/icones_logos/broom.png")));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnLimpar, "cell 11 2,growx");
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon(Busca_Atualiza.class.getResource("/icones_logos/back.png")));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnVoltar, "cell 12 2,growx");
		
		JLabel lblLinha = new JLabel("_____________________________________________________________________________________________________________________________________________");
		add(lblLinha, "cell 0 4 15 1,alignx center");
		
		JLabel lblDadosDaInstituicaoEducadora = new JLabel("Dados da Institui\u00E7\u00E3o Educadora");
		lblDadosDaInstituicaoEducadora.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 18));
		add(lblDadosDaInstituicaoEducadora, "cell 3 6 9 1,alignx center");
		
		JLabel lblNomeUFCSPA = new JLabel("Institui\u00E7\u00E3o: Universidade Federal de Ci\u00EAncias da Sa\u00FAde de Porto Alegre -UFCSPA");
		lblNomeUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNomeUFCSPA, "cell 1 8 7 1,alignx left");
		
		JLabel lblEnderecoUFCSPA = new JLabel("Rua Sarmento Leite 245, Centro, Porto Alegre -RS     CEP: 90050-170");
		lblEnderecoUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblEnderecoUFCSPA, "cell 1 9 7 1,alignx left");
		
		JLabel lblBuscar_Nome_CoordenadorUFCSPA = new JLabel("Coordenador: ");
		lblBuscar_Nome_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Nome_CoordenadorUFCSPA, "cell 1 10,alignx right");
		
		textField_Buscar_Nome_CoordenadorUFCSPA = new JTextField();
		textField_Buscar_Nome_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Nome_CoordenadorUFCSPA, "cell 2 10 7 1,growx");
		textField_Buscar_Nome_CoordenadorUFCSPA.setColumns(10);		
		
		JLabel lblBuscar_Curso_CoordenadorUFCSPA = new JLabel("Curso: ");
		lblBuscar_Curso_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Curso_CoordenadorUFCSPA, "cell 10 10,alignx trailing");
		
		textField_Buscar_CursoCoordenadorUFCSPA = new JTextField();
		textField_Buscar_CursoCoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_CursoCoordenadorUFCSPA, "cell 11 10 3 1,growx");
		textField_Buscar_CursoCoordenadorUFCSPA.setColumns(10);
		
		JLabel lblBuscar_RG_CoordenadorUFCSPA = new JLabel("RG: ");
		lblBuscar_RG_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_RG_CoordenadorUFCSPA, "cell 1 11,alignx trailing");
		
		textField_Buscar_RG_CoordenadorUFCSPA = new JTextField();
		add(textField_Buscar_RG_CoordenadorUFCSPA, "cell 2 11 3 1,growx");
		textField_Buscar_RG_CoordenadorUFCSPA.setColumns(10);
		
		JLabel lblBuscar_CPF_CoordenadorUFCSPA = new JLabel("CPF: ");
		lblBuscar_CPF_CoordenadorUFCSPA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_CPF_CoordenadorUFCSPA, "cell 5 11,alignx trailing");
		
		textField_Buscar_CPF_CoordenadorUFCSPA = new JFormattedTextField();
		add(textField_Buscar_CPF_CoordenadorUFCSPA, "cell 6 11 3 1,growx");
		try {
			textField_Buscar_CPF_CoordenadorUFCSPA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblBuscar_DadosDaUnidadeConcedenteDeEstagio = new JLabel("Dados da Unidade Concedente de Est\u00E1gio");
		lblBuscar_DadosDaUnidadeConcedenteDeEstagio.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 18));
		add(lblBuscar_DadosDaUnidadeConcedenteDeEstagio, "cell 3 13 9 1,alignx center");
		
		JLabel lblBuscar_Instituicao_EmpresaContratante = new JLabel("Institui\u00E7\u00E3o:");
		lblBuscar_Instituicao_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Instituicao_EmpresaContratante, "cell 1 15,alignx trailing");
		
		textField_Buscar_Nome_EmpresaContratante = new JTextField();
		textField_Buscar_Nome_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Nome_EmpresaContratante, "cell 2 15 7 1,growx");
		textField_Buscar_Nome_EmpresaContratante.setColumns(10);
		
		JLabel lblBuscar_CNPJ_EmpresaContratante = new JLabel("CNPJ: ");
		lblBuscar_CNPJ_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_CNPJ_EmpresaContratante, "cell 10 15,alignx trailing");
		
		textField_Buscar_CNPJ_EmpresaContratante = new JFormattedTextField();
		add(textField_Buscar_CNPJ_EmpresaContratante, "cell 11 15 2 1,growx");
		try {
			textField_Buscar_CNPJ_EmpresaContratante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		JLabel lblBuscar_Endereco_EmpresaContratante = new JLabel("Endere\u00E7o: ");
		lblBuscar_Endereco_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Endereco_EmpresaContratante, "cell 1 16,alignx trailing");
		
		textField_Buscar_Endereco_EmpresaContratante = new JTextField();
		textField_Buscar_Endereco_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Endereco_EmpresaContratante, "cell 2 16 7 1,growx");
		textField_Buscar_Endereco_EmpresaContratante.setColumns(10);
		
		JLabel lblBuscar_CEP_EmpresaContratante = new JLabel("CEP: ");
		lblBuscar_CEP_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_CEP_EmpresaContratante, "cell 10 16,alignx trailing");
		
		textField_Buscar_CEP_EmpresaContratante = new JFormattedTextField();
		add(textField_Buscar_CEP_EmpresaContratante, "cell 11 16,growx");
		try {
			textField_Buscar_CEP_EmpresaContratante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		JLabel lblBuscar_UF_EmpresaContratante = new JLabel("UF: ");
		lblBuscar_UF_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_UF_EmpresaContratante, "cell 12 16,alignx trailing");
		
		textField_Buscar_UFEmpresa = new JTextField();
		textField_Buscar_UFEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_UFEmpresa, "cell 13 16,growx");
		textField_Buscar_UFEmpresa.setColumns(10);
		
		JLabel lblBuscar_Cidade_EmpresaContratante = new JLabel("Cidade: ");
		lblBuscar_Cidade_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Cidade_EmpresaContratante, "cell 1 17,alignx trailing");
		
		textField_Buscar_Cidade_EmpresaContratante = new JTextField();
		textField_Buscar_Cidade_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Cidade_EmpresaContratante, "cell 2 17 3 1,growx");
		textField_Buscar_Cidade_EmpresaContratante.setColumns(10);
		
		JLabel lblBuscar_Contratante_EmpresaContratante = new JLabel("Contratante: ");
		lblBuscar_Contratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Contratante_EmpresaContratante, "cell 1 18,alignx trailing");
		
		textField_Buscar_Contratante_EmpresaContratante = new JTextField();
		textField_Buscar_Contratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Contratante_EmpresaContratante, "cell 2 18 7 1,growx");
		textField_Buscar_Contratante_EmpresaContratante.setColumns(10);
		
		JLabel lblBuscar_CargoContratante_EmpresaContratante = new JLabel("Cargo: ");
		lblBuscar_CargoContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_CargoContratante_EmpresaContratante, "cell 10 18,alignx trailing");
		
		textField_Buscar_CargoContratante_EmpresaContratante = new JTextField();
		textField_Buscar_CargoContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_CargoContratante_EmpresaContratante, "cell 11 18 2 1,growx");
		textField_Buscar_CargoContratante_EmpresaContratante.setColumns(10);
		
		JLabel lblBuscar_RGContratante_EmpresaContratante = new JLabel("RG: ");
		lblBuscar_RGContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_RGContratante_EmpresaContratante, "cell 1 19,alignx trailing");
		
		textField_Buscar_RGContratante_EmpresaContratante = new JTextField();
		textField_Buscar_RGContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_RGContratante_EmpresaContratante, "cell 2 19 3 1,growx");
		textField_Buscar_RGContratante_EmpresaContratante.setColumns(10);
		
		JLabel lbl_Buscar_CPFContratante_EmpresaContratante = new JLabel("CPF: ");
		lbl_Buscar_CPFContratante_EmpresaContratante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lbl_Buscar_CPFContratante_EmpresaContratante, "cell 5 19,alignx trailing");
		
		textField_Buscar_CPFContratante_EmpresaContratante = new JFormattedTextField();
		add(textField_Buscar_CPFContratante_EmpresaContratante, "cell 6 19 3 1,growx");
		try {
			textField_Buscar_CPFContratante_EmpresaContratante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblBuscar_DadosDoEstudante = new JLabel("Dados do Estudante");
		lblBuscar_DadosDoEstudante.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 18));
		add(lblBuscar_DadosDoEstudante, "cell 3 21 9 1,alignx center");
		
		JLabel lblBuscar_Nome_Estudante = new JLabel("Nome: ");
		lblBuscar_Nome_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Nome_Estudante, "cell 1 23,alignx trailing");
		
		textField_Buscar_Nome_Estudante = new JTextField();
		textField_Buscar_Nome_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Nome_Estudante, "cell 2 23 7 1,growx");
		textField_Buscar_Nome_Estudante.setColumns(10);
		
		JLabel lblBuscar_DataNascimento_Estudante = new JLabel("Nascimento:");
		lblBuscar_DataNascimento_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_DataNascimento_Estudante, "cell 10 23,alignx trailing");
		
		textField_Buscar_Nascimento_Estudante = new JFormattedTextField();
		add(textField_Buscar_Nascimento_Estudante, "cell 11 23 2 1,growx");
		try {
			textField_Buscar_Nascimento_Estudante .setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblBuscar_RG_Estudante = new JLabel("RG: ");
		lblBuscar_RG_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_RG_Estudante, "cell 1 24,alignx trailing");
		
		textField_Buscar_RG_Estudante = new JTextField();
		textField_Buscar_RG_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_RG_Estudante, "cell 2 24 3 1,growx");
		textField_Buscar_RG_Estudante.setColumns(10);
		
		JLabel lblBuscar_Endereco_Estudante = new JLabel("Endere\u00E7o: ");
		lblBuscar_Endereco_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Endereco_Estudante, "cell 1 25,alignx trailing");
		
		textField_Buscar_Endereco_Estudante = new JTextField();
		textField_Buscar_Endereco_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Endereco_Estudante, "cell 2 25 7 1,growx");
		textField_Buscar_Endereco_Estudante.setColumns(10);
		
		JLabel lblBuscar_CEP_Estutante = new JLabel("CEP: ");
		lblBuscar_CEP_Estutante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_CEP_Estutante, "cell 10 25,alignx trailing");
		
		textField_Buscar_CEP_Estudante = new JFormattedTextField();
		add(textField_Buscar_CEP_Estudante, "cell 11 25,growx");
		try {
			textField_Buscar_CEP_Estudante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		JLabel lblBuscar_UF_Estudante = new JLabel("UF: ");
		lblBuscar_UF_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_UF_Estudante, "cell 12 25,alignx trailing");
		
		textField_Buscar_UFEstudante = new JTextField();
		textField_Buscar_UFEstudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_UFEstudante, "cell 13 25,growx");
		textField_Buscar_UFEstudante.setColumns(10);
		
		JLabel lblBuscar_Cidade_Estudante = new JLabel("Cidade: ");
		lblBuscar_Cidade_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Cidade_Estudante, "cell 1 26,alignx trailing");
		
		textField_Buscar_Cidade_Estudante = new JTextField();
		textField_Buscar_Cidade_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Cidade_Estudante, "cell 2 26 3 1,growx");
		textField_Buscar_Cidade_Estudante.setColumns(10);
		
		JLabel lblBuscar_Bairro_Estudante = new JLabel("Bairro: ");
		lblBuscar_Bairro_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Bairro_Estudante, "cell 5 26,alignx trailing");
		
		textField_Buscar_Bairro_Estudante = new JTextField();
		textField_Buscar_Bairro_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Bairro_Estudante, "cell 6 26 3 1,growx");
		textField_Buscar_Bairro_Estudante.setColumns(10);
		
		JLabel lblBuscar_Matricula_Estudante = new JLabel("Matricula: ");
		lblBuscar_Matricula_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Matricula_Estudante, "cell 1 27,alignx trailing");
		
		textField_Buscar_Matricula_Estudante = new JTextField();
		textField_Buscar_Matricula_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Matricula_Estudante, "cell 2 27 3 1,growx");
		textField_Buscar_Matricula_Estudante.setColumns(10);
		
		JLabel lblBuscar_Semestre_Estudante = new JLabel("Semestre: ");
		lblBuscar_Semestre_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Semestre_Estudante, "cell 5 27,alignx trailing");
		
		textField_Buscar_Semestre_Estudante = new JTextField();
		textField_Buscar_Semestre_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Semestre_Estudante, "cell 6 27,growx");
		textField_Buscar_Semestre_Estudante.setColumns(10);
		
		JLabel lblBuscar__Curso_Estudante = new JLabel("Curso: ");
		lblBuscar__Curso_Estudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar__Curso_Estudante, "cell 10 27,alignx trailing");
		
		textField_Buscar_CursoEstudante = new JTextField();
		textField_Buscar_CursoEstudante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_CursoEstudante, "cell 11 27 3 1,growx");
		textField_Buscar_CursoEstudante.setColumns(10);
		
		JLabel lblBuscar_DadosEstagio = new JLabel("Dados do Est\u00E1gio");
		lblBuscar_DadosEstagio.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 18));
		lblBuscar_DadosEstagio.setToolTipText("");
		add(lblBuscar_DadosEstagio, "cell 3 29 9 1");
		
		JLabel lblBuscar_AreaDeAtuacao_DadosEstagio = new JLabel("\u00C1rea de atua\u00E7\u00E3o: ");
		lblBuscar_AreaDeAtuacao_DadosEstagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_AreaDeAtuacao_DadosEstagio, "cell 0 31 2 1,alignx right");
		
		textField_Buscar_Atuacao_Estagio = new JTextField();
		textField_Buscar_Atuacao_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Atuacao_Estagio, "cell 2 31 3 1,growx");
		textField_Buscar_Atuacao_Estagio.setColumns(10);
		
		JLabel lblBuscar_Inicio_Estagio = new JLabel("Data de In\u00EDcio: ");
		lblBuscar_Inicio_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Inicio_Estagio, "cell 5 31 2 1,alignx right");
		
		textField_Buscar_Inicio_Estagio = new JFormattedTextField();
		add(textField_Buscar_Inicio_Estagio, "cell 7 31 2 1,growx");
		try {
			textField_Buscar_Inicio_Estagio .setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblBuscar_Termino_Estagio = new JLabel("Data de T\u00E9rmino: ");
		lblBuscar_Termino_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Termino_Estagio, "cell 10 31,alignx right");
		
		textField_Buscar_Termino_Estagio = new JFormattedTextField();
		add(textField_Buscar_Termino_Estagio, "cell 11 31,growx");
		try {
			textField_Buscar_Termino_Estagio .setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JLabel lblBuscar_CargaHoraria_Estagio = new JLabel("Carga hor\u00E1ria semanal: ");
		lblBuscar_CargaHoraria_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_CargaHoraria_Estagio, "cell 0 32 2 1,alignx right");
		
		textField_Buscar_CargaHoraria_Estagio = new JTextField();
		textField_Buscar_CargaHoraria_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_CargaHoraria_Estagio, "cell 2 32,growx");
		textField_Buscar_CargaHoraria_Estagio.setColumns(10);
		
		JLabel lblBuscar_ValorBolsa_Estagio = new JLabel("Valor da Bolsa: ");
		lblBuscar_ValorBolsa_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_ValorBolsa_Estagio, "cell 5 32 2 1,alignx right");
		
		textField_Buscar_ValorDaolsa_Estagio = new JTextField();
		textField_Buscar_ValorDaolsa_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_ValorDaolsa_Estagio, "cell 7 32 2 1,growx");
		textField_Buscar_ValorDaolsa_Estagio.setColumns(10);
		
		JLabel lblBuscar_TipoDeEstagio = new JLabel("Est\u00E1gio obrigat\u00F3rio: ");
		lblBuscar_TipoDeEstagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_TipoDeEstagio, "cell 0 33 2 1,alignx right");
		
		textField_Buscar_EstagioObrigatorio = new JTextField();
		textField_Buscar_EstagioObrigatorio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_EstagioObrigatorio, "cell 2 33,growx");
		textField_Buscar_EstagioObrigatorio.setColumns(10);
		
		
		JLabel lblBuscar_ValeTransporte_Estagio = new JLabel("Vale transporte: ");
		lblBuscar_ValeTransporte_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_ValeTransporte_Estagio, "cell 5 33 2 1,alignx right");
		
		textField_Buscar_ValeTransporte = new JTextField();
		textField_Buscar_ValeTransporte.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_ValeTransporte, "cell 7 33,growx");
		textField_Buscar_ValeTransporte.setColumns(10);
		
		JLabel lblBuscar_Valor_Estagio = new JLabel("Valor: ");
		lblBuscar_Valor_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Valor_Estagio, "cell 10 33,alignx right");
		
		textField_Buscar_ValorValeTransporte_Estagio = new JTextField();
		textField_Buscar_ValorValeTransporte_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_ValorValeTransporte_Estagio, "cell 11 33,growx");
		textField_Buscar_ValorValeTransporte_Estagio.setColumns(10);
		
		JLabel lblBuscar_SeguroAcidente = new JLabel("Seguro de acidentes: ");
		lblBuscar_SeguroAcidente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_SeguroAcidente, "cell 0 34 2 1,alignx right");
		
		textField_Buscar_SeguroAcidente = new JTextField();
		textField_Buscar_SeguroAcidente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_SeguroAcidente, "cell 2 34,growx");
		textField_Buscar_SeguroAcidente.setColumns(10);
		
		JLabel lblBuscar_ValeRefeicao = new JLabel("Vale refei\u00E7\u00E3o: ");
		lblBuscar_ValeRefeicao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_ValeRefeicao, "cell 5 34 2 1,alignx right");
		
		textField_Buscar_ValeRefeicao = new JTextField();
		textField_Buscar_ValeRefeicao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_ValeRefeicao, "cell 7 34,growx");
		textField_Buscar_ValeRefeicao.setColumns(10);
		
		JLabel lblBuscar_ValorValeRefeicao_Estagio = new JLabel("Valor: ");
		lblBuscar_ValorValeRefeicao_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_ValorValeRefeicao_Estagio, "cell 10 34,alignx right");
		
		textField_Buscar_ValorValeRefeicao_Estagio = new JTextField();
		textField_Buscar_ValorValeRefeicao_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_ValorValeRefeicao_Estagio, "cell 11 34,growx");
		textField_Buscar_ValorValeRefeicao_Estagio.setColumns(10);
		
		JLabel lblBuscar_Seguradora_Estagio = new JLabel("Seguradora: ");
		lblBuscar_Seguradora_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Seguradora_Estagio, "cell 1 35,alignx right");
		
		textField_Buscar_Seguradora_Estagio = new JTextField();
		textField_Buscar_Seguradora_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Seguradora_Estagio, "cell 2 35 7 1,growx");
		textField_Buscar_Seguradora_Estagio.setColumns(10);
		
		JLabel lblBuscar_Apolice_Seguradora = new JLabel("Ap\u00F3lice: ");
		lblBuscar_Apolice_Seguradora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Apolice_Seguradora, "cell 10 35,alignx right");
		
		textField_Buscar_Apolice_Estagio = new JTextField();
		textField_Buscar_Apolice_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_Apolice_Estagio, "cell 11 35 3 1,growx");
		textField_Buscar_Apolice_Estagio.setColumns(10);
		
		JLabel lblBuscar_ProfessorResponsavel_Estagio = new JLabel("Professor respons\u00E1vel: ");
		lblBuscar_ProfessorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_ProfessorResponsavel_Estagio, "cell 0 36 2 1,alignx right");
		
		textField_Buscar_ProfessorResponsavel_Estagio = new JTextField();
		textField_Buscar_ProfessorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_ProfessorResponsavel_Estagio, "cell 2 36 7 1,growx");
		textField_Buscar_ProfessorResponsavel_Estagio.setColumns(10);
		
		JLabel lblBuscar_SIAPE_Estagio = new JLabel("SIAPE: ");
		lblBuscar_SIAPE_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_SIAPE_Estagio, "cell 10 36,alignx trailing");
		
		textField_Buscar_SIAPE_Estagio = new JTextField();
		textField_Buscar_SIAPE_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_SIAPE_Estagio, "cell 11 36 3 1,growx");
		textField_Buscar_SIAPE_Estagio.setColumns(10);
		
		JLabel lblBuscar_OrientadorResponsavel_Estagio = new JLabel("Orientador respons\u00E1vel: ");
		lblBuscar_OrientadorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_OrientadorResponsavel_Estagio, "cell 0 37 2 1,alignx right");
		
		textField_Buscar_OrientadorResponsavel_Estagio = new JTextField();
		textField_Buscar_OrientadorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_OrientadorResponsavel_Estagio, "cell 2 37 7 1,growx");
		textField_Buscar_OrientadorResponsavel_Estagio.setColumns(10);
		
		JLabel lblBuscar_CargoOrientador_Estagio = new JLabel("Cargo: ");
		lblBuscar_CargoOrientador_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_CargoOrientador_Estagio, "cell 10 37,alignx trailing");
		
		textField_Buscar_CargoOrientadorResponsavel_Estagio = new JTextField();
		textField_Buscar_CargoOrientadorResponsavel_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(textField_Buscar_CargoOrientadorResponsavel_Estagio, "cell 11 37 3 1,growx");
		textField_Buscar_CargoOrientadorResponsavel_Estagio.setColumns(10);
		
		JLabel lblBuscar_Atividades_Estagio = new JLabel("Atividades realizadas: ");
		lblBuscar_Atividades_Estagio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblBuscar_Atividades_Estagio, "cell 0 39 2 1,alignx right");
		
		textPane_AtividadesRealizadas_Estagio = new JTextPane();
		add(textPane_AtividadesRealizadas_Estagio, "cell 2 39 12 4,grow");
	}

	public JTextField getTextField_Buscar_Nome_CoordenadorUFCSPA() {
		return textField_Buscar_Nome_CoordenadorUFCSPA;
	}

	public void setTextField_Buscar_Nome_CoordenadorUFCSPA(JTextField textField_Buscar_Nome_CoordenadorUFCSPA) {
		this.textField_Buscar_Nome_CoordenadorUFCSPA = textField_Buscar_Nome_CoordenadorUFCSPA;
	}

	public JTextField getTextField_Buscar_RG_CoordenadorUFCSPA() {
		return textField_Buscar_RG_CoordenadorUFCSPA;
	}

	public void setTextField_Buscar_RG_CoordenadorUFCSPA(JTextField textField_Buscar_RG_CoordenadorUFCSPA) {
		this.textField_Buscar_RG_CoordenadorUFCSPA = textField_Buscar_RG_CoordenadorUFCSPA;
	}

	public JTextField getTextField_Buscar_Nome_EmpresaContratante() {
		return textField_Buscar_Nome_EmpresaContratante;
	}

	public void setTextField_Buscar_Nome_EmpresaContratante(JTextField textField_Buscar_Nome_EmpresaContratante) {
		this.textField_Buscar_Nome_EmpresaContratante = textField_Buscar_Nome_EmpresaContratante;
	}

	public JTextField getTextField_Buscar_Endereco_EmpresaContratante() {
		return textField_Buscar_Endereco_EmpresaContratante;
	}

	public void setTextField_Buscar_Endereco_EmpresaContratante(JTextField textField_Buscar_Endereco_EmpresaContratante) {
		this.textField_Buscar_Endereco_EmpresaContratante = textField_Buscar_Endereco_EmpresaContratante;
	}

	public JTextField getTextField_Buscar_Cidade_EmpresaContratante() {
		return textField_Buscar_Cidade_EmpresaContratante;
	}

	public void setTextField_Buscar_Cidade_EmpresaContratante(JTextField textField_Buscar_Cidade_EmpresaContratante) {
		this.textField_Buscar_Cidade_EmpresaContratante = textField_Buscar_Cidade_EmpresaContratante;
	}

	public JTextField getTextField_Buscar_Contratante_EmpresaContratante() {
		return textField_Buscar_Contratante_EmpresaContratante;
	}

	public void setTextField_Buscar_Contratante_EmpresaContratante(
			JTextField textField_Buscar_Contratante_EmpresaContratante) {
		this.textField_Buscar_Contratante_EmpresaContratante = textField_Buscar_Contratante_EmpresaContratante;
	}

	public JTextField getTextField_Buscar_CargoContratante_EmpresaContratante() {
		return textField_Buscar_CargoContratante_EmpresaContratante;
	}

	public void setTextField_Buscar_CargoContratante_EmpresaContratante(
			JTextField textField_Buscar_CargoContratante_EmpresaContratante) {
		this.textField_Buscar_CargoContratante_EmpresaContratante = textField_Buscar_CargoContratante_EmpresaContratante;
	}

	public JTextField getTextField_Buscar_RGContratante_EmpresaContratante() {
		return textField_Buscar_RGContratante_EmpresaContratante;
	}

	public void setTextField_Buscar_RGContratante_EmpresaContratante(
			JTextField textField_Buscar_RGContratante_EmpresaContratante) {
		this.textField_Buscar_RGContratante_EmpresaContratante = textField_Buscar_RGContratante_EmpresaContratante;
	}

	public JTextField getTextField_Buscar_Nome_Estudante() {
		return textField_Buscar_Nome_Estudante;
	}

	public void setTextField_Buscar_Nome_Estudante(JTextField textField_Buscar_Nome_Estudante) {
		this.textField_Buscar_Nome_Estudante = textField_Buscar_Nome_Estudante;
	}

	public JTextField getTextField_Buscar_RG_Estudante() {
		return textField_Buscar_RG_Estudante;
	}

	public void setTextField_Buscar_RG_Estudante(JTextField textField_Buscar_RG_Estudante) {
		this.textField_Buscar_RG_Estudante = textField_Buscar_RG_Estudante;
	}

	public JTextField getTextField_Buscar_Endereco_Estudante() {
		return textField_Buscar_Endereco_Estudante;
	}

	public void setTextField_Buscar_Endereco_Estudante(JTextField textField_Buscar_Endereco_Estudante) {
		this.textField_Buscar_Endereco_Estudante = textField_Buscar_Endereco_Estudante;
	}

	public JTextField getTextField_Buscar_Cidade_Estudante() {
		return textField_Buscar_Cidade_Estudante;
	}

	public void setTextField_Buscar_Cidade_Estudante(JTextField textField_Buscar_Cidade_Estudante) {
		this.textField_Buscar_Cidade_Estudante = textField_Buscar_Cidade_Estudante;
	}

	public JTextField getTextField_Buscar_Bairro_Estudante() {
		return textField_Buscar_Bairro_Estudante;
	}

	public void setTextField_Buscar_Bairro_Estudante(JTextField textField_Buscar_Bairro_Estudante) {
		this.textField_Buscar_Bairro_Estudante = textField_Buscar_Bairro_Estudante;
	}

	public JTextField getTextField_Buscar_Matricula_Estudante() {
		return textField_Buscar_Matricula_Estudante;
	}

	public void setTextField_Buscar_Matricula_Estudante(JTextField textField_Buscar_Matricula_Estudante) {
		this.textField_Buscar_Matricula_Estudante = textField_Buscar_Matricula_Estudante;
	}

	public JTextField getTextField_Buscar_Semestre_Estudante() {
		return textField_Buscar_Semestre_Estudante;
	}

	public void setTextField_Buscar_Semestre_Estudante(JTextField textField_Buscar_Semestre_Estudante) {
		this.textField_Buscar_Semestre_Estudante = textField_Buscar_Semestre_Estudante;
	}

	public JTextField getTextField_Buscar_Atuacao_Estagio() {
		return textField_Buscar_Atuacao_Estagio;
	}

	public void setTextField_Buscar_Atuacao_Estagio(JTextField textField_Buscar_Atuacao_Estagio) {
		this.textField_Buscar_Atuacao_Estagio = textField_Buscar_Atuacao_Estagio;
	}

	public JTextField getTextField_Buscar_CargaHoraria_Estagio() {
		return textField_Buscar_CargaHoraria_Estagio;
	}

	public void setTextField_Buscar_CargaHoraria_Estagio(JTextField textField_Buscar_CargaHoraria_Estagio) {
		this.textField_Buscar_CargaHoraria_Estagio = textField_Buscar_CargaHoraria_Estagio;
	}

	public JTextField getTextField_Buscar_ValorDaolsa_Estagio() {
		return textField_Buscar_ValorDaolsa_Estagio;
	}

	public void setTextField_Buscar_ValorDaolsa_Estagio(JTextField textField_Buscar_ValorDaolsa_Estagio) {
		this.textField_Buscar_ValorDaolsa_Estagio = textField_Buscar_ValorDaolsa_Estagio;
	}

	public JTextField getTextField_Buscar_ValorValeTransporte_Estagio() {
		return textField_Buscar_ValorValeTransporte_Estagio;
	}

	public void setTextField_Buscar_ValorValeTransporte_Estagio(JTextField textField_Buscar_ValorValeTransporte_Estagio) {
		this.textField_Buscar_ValorValeTransporte_Estagio = textField_Buscar_ValorValeTransporte_Estagio;
	}

	public JTextField getTextField_Buscar_ValorValeRefeicao_Estagio() {
		return textField_Buscar_ValorValeRefeicao_Estagio;
	}

	public void setTextField_Buscar_ValorValeRefeicao_Estagio(JTextField textField_Buscar_ValorValeRefeicao_Estagio) {
		this.textField_Buscar_ValorValeRefeicao_Estagio = textField_Buscar_ValorValeRefeicao_Estagio;
	}

	public JTextField getTextField_Buscar_Seguradora_Estagio() {
		return textField_Buscar_Seguradora_Estagio;
	}

	public void setTextField_Buscar_Seguradora_Estagio(JTextField textField_Buscar_Seguradora_Estagio) {
		this.textField_Buscar_Seguradora_Estagio = textField_Buscar_Seguradora_Estagio;
	}

	public JTextField getTextField_Buscar_Apolice_Estagio() {
		return textField_Buscar_Apolice_Estagio;
	}

	public void setTextField_Buscar_Apolice_Estagio(JTextField textField_Buscar_Apolice_Estagio) {
		this.textField_Buscar_Apolice_Estagio = textField_Buscar_Apolice_Estagio;
	}

	public JTextField getTextField_Buscar_ProfessorResponsavel_Estagio() {
		return textField_Buscar_ProfessorResponsavel_Estagio;
	}

	public void setTextField_Buscar_ProfessorResponsavel_Estagio(JTextField textField_Buscar_ProfessorResponsavel_Estagio) {
		this.textField_Buscar_ProfessorResponsavel_Estagio = textField_Buscar_ProfessorResponsavel_Estagio;
	}

	public JTextField getTextField_Buscar_SIAPE_Estagio() {
		return textField_Buscar_SIAPE_Estagio;
	}

	public void setTextField_Buscar_SIAPE_Estagio(JTextField textField_Buscar_SIAPE_Estagio) {
		this.textField_Buscar_SIAPE_Estagio = textField_Buscar_SIAPE_Estagio;
	}

	public JTextField getTextField_Buscar_OrientadorResponsavel_Estagio() {
		return textField_Buscar_OrientadorResponsavel_Estagio;
	}

	public void setTextField_Buscar_OrientadorResponsavel_Estagio(
			JTextField textField_Buscar_OrientadorResponsavel_Estagio) {
		this.textField_Buscar_OrientadorResponsavel_Estagio = textField_Buscar_OrientadorResponsavel_Estagio;
	}

	public JTextField getTextField_Buscar_CargoOrientadorResponsavel_Estagio() {
		return textField_Buscar_CargoOrientadorResponsavel_Estagio;
	}

	public void setTextField_Buscar_CargoOrientadorResponsavel_Estagio(
			JTextField textField_Buscar_CargoOrientadorResponsavel_Estagio) {
		this.textField_Buscar_CargoOrientadorResponsavel_Estagio = textField_Buscar_CargoOrientadorResponsavel_Estagio;
	}

	public JTextPane getTextPane_AtividadesRealizadas_Estagio() {
		return textPane_AtividadesRealizadas_Estagio;
	}

	public void setTextPane_AtividadesRealizadas_Estagio(JTextPane textPane_AtividadesRealizadas_Estagio) {
		this.textPane_AtividadesRealizadas_Estagio = textPane_AtividadesRealizadas_Estagio;
	}

	public JTextField getTextField_Buscar_EstagioObrigatorio() {
		return textField_Buscar_EstagioObrigatorio;
	}

	public void setTextField_Buscar_EstagioObrigatorio(JTextField textField_Buscar_EstagioObrigatorio) {
		this.textField_Buscar_EstagioObrigatorio = textField_Buscar_EstagioObrigatorio;
	}

	public JTextField getTextField_Buscar_SeguroAcidente() {
		return textField_Buscar_SeguroAcidente;
	}

	public void setTextField_Buscar_SeguroAcidente(JTextField textField_Buscar_SeguroAcidente) {
		this.textField_Buscar_SeguroAcidente = textField_Buscar_SeguroAcidente;
	}

	public JTextField getTextField_Buscar_ValeTransporte() {
		return textField_Buscar_ValeTransporte;
	}

	public void setTextField_Buscar_ValeTransporte(JTextField textField_Buscar_ValeTransporte) {
		this.textField_Buscar_ValeTransporte = textField_Buscar_ValeTransporte;
	}

	public JTextField getTextField_Buscar_ValeRefeicao() {
		return textField_Buscar_ValeRefeicao;
	}

	public void setTextField_Buscar_ValeRefeicao(JTextField textField_Buscar_ValeRefeicao) {
		this.textField_Buscar_ValeRefeicao = textField_Buscar_ValeRefeicao;
	}

	public JTextField getTextField_Buscar_CursoCoordenadorUFCSPA() {
		return textField_Buscar_CursoCoordenadorUFCSPA;
	}

	public void setTextField_Buscar_CursoCoordenadorUFCSPA(JTextField textField_Buscar_CursoCoordenadorUFCSPA) {
		this.textField_Buscar_CursoCoordenadorUFCSPA = textField_Buscar_CursoCoordenadorUFCSPA;
	}

	public JTextField getTextField_Buscar_CursoEstudante() {
		return textField_Buscar_CursoEstudante;
	}

	public void setTextField_Buscar_CursoEstudante(JTextField textField_Buscar_CursoEstudante) {
		this.textField_Buscar_CursoEstudante = textField_Buscar_CursoEstudante;
	}

	public JTextField getTextField_Buscar_UFEmpresa() {
		return textField_Buscar_UFEmpresa;
	}

	public void setTextField_Buscar_UFEmpresa(JTextField textField_Buscar_UFEmpresa) {
		this.textField_Buscar_UFEmpresa = textField_Buscar_UFEmpresa;
	}

	public JTextField getTextField_Buscar_UFEstudante() {
		return textField_Buscar_UFEstudante;
	}

	public void setTextField_Buscar_UFEstudante(JTextField textField_Buscar_UFEstudante) {
		this.textField_Buscar_UFEstudante = textField_Buscar_UFEstudante;
	}

	public JFormattedTextField getTextField_Buscar_CPF_QUERYBANCO() {
		return textField_Buscar_CPF_QUERYBANCO;
	}

	public void setTextField_Buscar_CPF_QUERYBANCO(JFormattedTextField textField_Buscar_CPF_QUERYBANCO) {
		this.textField_Buscar_CPF_QUERYBANCO = textField_Buscar_CPF_QUERYBANCO;
	}

	public JFormattedTextField getTextField_Buscar_CPF_CoordenadorUFCSPA() {
		return textField_Buscar_CPF_CoordenadorUFCSPA;
	}

	public void setTextField_Buscar_CPF_CoordenadorUFCSPA(JFormattedTextField textField_Buscar_CPF_CoordenadorUFCSPA) {
		this.textField_Buscar_CPF_CoordenadorUFCSPA = textField_Buscar_CPF_CoordenadorUFCSPA;
	}

	public JFormattedTextField getTextField_Buscar_CPFContratante_EmpresaContratante() {
		return textField_Buscar_CPFContratante_EmpresaContratante;
	}

	public void setTextField_Buscar_CPFContratante_EmpresaContratante(
			JFormattedTextField textField_Buscar_CPFContratante_EmpresaContratante) {
		this.textField_Buscar_CPFContratante_EmpresaContratante = textField_Buscar_CPFContratante_EmpresaContratante;
	}

	public JFormattedTextField getTextField_Buscar_CNPJ_EmpresaContratante() {
		return textField_Buscar_CNPJ_EmpresaContratante;
	}

	public void setTextField_Buscar_CNPJ_EmpresaContratante(JFormattedTextField textField_Buscar_CNPJ_EmpresaContratante) {
		this.textField_Buscar_CNPJ_EmpresaContratante = textField_Buscar_CNPJ_EmpresaContratante;
	}

	public JFormattedTextField getTextField_Buscar_CEP_EmpresaContratante() {
		return textField_Buscar_CEP_EmpresaContratante;
	}

	public void setTextField_Buscar_CEP_EmpresaContratante(JFormattedTextField textField_Buscar_CEP_EmpresaContratante) {
		this.textField_Buscar_CEP_EmpresaContratante = textField_Buscar_CEP_EmpresaContratante;
	}

	public JFormattedTextField getTextField_Buscar_Nascimento_Estudante() {
		return textField_Buscar_Nascimento_Estudante;
	}

	public void setTextField_Buscar_Nascimento_Estudante(JFormattedTextField textField_Buscar_Nascimento_Estudante) {
		this.textField_Buscar_Nascimento_Estudante = textField_Buscar_Nascimento_Estudante;
	}

	public JFormattedTextField getTextField_Buscar_Inicio_Estagio() {
		return textField_Buscar_Inicio_Estagio;
	}

	public void setTextField_Buscar_Inicio_Estagio(JFormattedTextField textField_Buscar_Inicio_Estagio) {
		this.textField_Buscar_Inicio_Estagio = textField_Buscar_Inicio_Estagio;
	}

	public JFormattedTextField getTextField_Buscar_Termino_Estagio() {
		return textField_Buscar_Termino_Estagio;
	}

	public void setTextField_Buscar_Termino_Estagio(JFormattedTextField textField_Buscar_Termino_Estagio) {
		this.textField_Buscar_Termino_Estagio = textField_Buscar_Termino_Estagio;
	}

	public JFormattedTextField getTextField_Buscar_CEP_Estudante() {
		return textField_Buscar_CEP_Estudante;
	}

	public void setTextField_Buscar_CEP_Estudante(JFormattedTextField textField_Buscar_CEP_Estudante) {
		this.textField_Buscar_CEP_Estudante = textField_Buscar_CEP_Estudante;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}
}
