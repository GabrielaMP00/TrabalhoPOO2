package controle;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dao.Dao;
import modelo.AutenticacaoUsuario;
import modelo.FormularioEstagio;
import visao.Busca_Atualiza;
import visao.Cadastro;
import visao.Deleta;
import visao.JanelaPrincipal;
import visao.Login;
import visao.Menu;

public class Controle implements ActionListener {
	private AutenticacaoUsuario autenticacao = new AutenticacaoUsuario();
	private FormularioEstagio formulario = new FormularioEstagio();
	
	private JanelaPrincipal janelaPrincipal;
	private Login login;
	private Cadastro cadastro = new Cadastro();
	private Busca_Atualiza buscaAtualiza = new Busca_Atualiza();
	private Menu menu = new Menu();
	private Deleta deleta = new Deleta();
	
	private Dao dao;
	
	
	public Controle(AutenticacaoUsuario autenticacao, JanelaPrincipal janelaPrincipal, Login login) {
		super();
		this.autenticacao = autenticacao;
		this.janelaPrincipal = janelaPrincipal;
		this.login = login;
		
		this.janelaPrincipal.getLogin().getBtnLogin_Limpar().addActionListener(this);
		this.janelaPrincipal.getLogin().getBtnLogin_Entrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Limpar Tela")) {
			this.janelaPrincipal.getLogin().limparLogin();
		} 
		
		if(janelaPrincipal.getContentPane()==login) {
			if(e.getActionCommand().equals("Entrar")) {
				autenticacao.setUsuario(login.getTextField_Usuario().getText());
				autenticacao.setSenha(login.getTextField_Senha().getText());
				if(dao.autenticarUsuario(autenticacao)) {
					janelaPrincipal.getMenuGerenciar().setVisible(true);
					JOptionPane.showMessageDialog(login, "Login realizado com sucesso!", "Login Efetuado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/check.png")));
				}
				else 
					JOptionPane.showMessageDialog(login,"Falha ao realizar login!","Erro",JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));
			
		}
		
		if(janelaPrincipal.getContentPane()==menu) {
			if(e.getActionCommand().equals("Cadastrar Formulário")) {
				janelaPrincipal.setContentPane(cadastro);
				janelaPrincipal.setVisible(true);
				janelaPrincipal.setSize(1200, 1000);
				janelaPrincipal.setLocationRelativeTo(null);
			}
			if(e.getActionCommand().equals("Atualizar Formulário")) {
				janelaPrincipal.setContentPane(buscaAtualiza);
				janelaPrincipal.setVisible(true);
				janelaPrincipal.setSize(1200, 1000);
				janelaPrincipal.setLocationRelativeTo(null);
			}
			if(e.getActionCommand().equals("Excluir Formulário")) {
				janelaPrincipal.setContentPane(deleta);
				janelaPrincipal.setVisible(true);
				janelaPrincipal.setSize(560, 250);
				janelaPrincipal.setLocationRelativeTo(null);
			}
			if(e.getActionCommand().equals("Fechar Aplicação")){
				loginSair();
			}
		}
		
		if(janelaPrincipal.getContentPane()==cadastro) {
			if(e.getActionCommand().equals("Cadastrar")) {
				cadastroCadastrar();
			}else if(e.getActionCommand().equals("Limpar")) {
				cadastroLimpar();
			}else if(e.getActionCommand().equals("Voltar")) {
				menuVoltar();
			}
		}
		
		if(janelaPrincipal.getContentPane()==buscaAtualiza) {
			if(e.getActionCommand().equals("Buscar")) {
				buscarFormulario();
			}else if(e.getActionCommand().equals("Atualizar")) {
				atualizarFormulario();
			}else if(e.getActionCommand().equals("Voltar")) {
				menuVoltar();
			}else if(e.getActionCommand().equals("Limpar")){
				limparBusca_Atualiza();
			}
		}
		
		if(janelaPrincipal.getContentPane()==deleta) {
			if(e.getActionCommand().equals("Voltar")){
				menuVoltar();
			}else if(e.getActionCommand().equals("Limpar")){
				limparDeleta();
			}else if(e.getActionCommand().equals("Excluir")) {
				excluirDeleta();
			}
		}}
	}
	
	// Método de Autenticação do painel Login
	public void loginEntrar() {
		autenticacao.setUsuario(login.getTextField_Usuario().getText()); //admin
		autenticacao.setSenha(login.getTextField_Senha().getText()); //admin
		
		if(dao.autenticarUsuario(autenticacao)) {
			janelaPrincipal.setContentPane(menu);
			janelaPrincipal.setVisible(true);
			janelaPrincipal.setSize(940, 440);
			janelaPrincipal.setLocationRelativeTo(null);
		}else {
			JOptionPane.showMessageDialog(null, "Falha ao realizar a autenticação!","Falha", 1);
		}
	}
	
	// Método para limpar todos os jtextField do painel login
	public void loginLimpar(){
		login.getTextField_Usuario().setText("");
		login.getTextField_Senha().setText("");
	}
	
	// Método para finalizar o programa 
	public void loginSair(){
		System.exit(0);
	}
	
	// Método do botão voltar para todos os Panels
	public void menuVoltar() {
		janelaPrincipal.setContentPane(menu);
		janelaPrincipal.setVisible(true);
		janelaPrincipal.setSize(940, 440);
		janelaPrincipal.setLocationRelativeTo(null);
	}
	
	// Método para limpar todos os campos do jpanel Cadastro
	public void cadastroLimpar(){
		cadastro.getTextField_Cadastro_Apolice_Estagio().setText("");
		cadastro.getTextField_Cadastro_Atuacao_Estagio().setText("");
		cadastro.getTextField_Cadastro_Bairro_Estudante().setText("");
		cadastro.getTextField_Cadastro_CargaHoraria_Estagio().setText("");
		cadastro.getTextField_Cadastro_CargoContratante_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_CargoOrientadorResponsavel_Estagio().setText("");
		cadastro.getTextField_Cadastro_CEP_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_CEP_Estudante().setText("");
		cadastro.getTextField_Cadastro_Cidade_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_Cidade_Estudante().setText("");
		cadastro.getTextField_Cadastro_CNPJ_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_Contratante_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_CPF_CoordenadorUFCSPA().setText("");
		cadastro.getTextField_Cadastro_CPF_Estudante().setText("");
		cadastro.getTextField_Cadastro_CPFContratante_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_Endereco_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_Endereco_Estudante().setText("");
		cadastro.getTextField_Cadastro_Inicio_Estagio().setText("");
		cadastro.getTextField_Cadastro_Matricula_Estudante().setText("");
		cadastro.getTextField_Cadastro_Nascimento_Estudante().setText("");
		cadastro.getTextField_Cadastro_Nome_CoordenadorUFCSPA().setText("");
		cadastro.getTextField_Cadastro_Nome_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_Nome_Estudante().setText("");
		cadastro.getTextField_Cadastro_OrientadorResponsavel_Estagio().setText("");
		cadastro.getTextField_Cadastro_ProfessorResponsavel_Estagio().setText("");
		cadastro.getTextField_Cadastro_RG_CoordenadorUFCSPA().setText("");
		cadastro.getTextField_Cadastro_RG_Estudante().setText("");
		cadastro.getTextField_Cadastro_RGContratante_EmpresaContratante().setText("");
		cadastro.getTextField_Cadastro_Seguradora_Estagio().setText("");
		cadastro.getTextField_Cadastro_Semestre_Estudante().setText("");
		cadastro.getTextField_Cadastro_SIAPE_Estagio().setText("");		
		cadastro.getTextField_Cadastro_Termino_Estagio().setText("");
		cadastro.getTextField_Cadastro_ValorDaolsa_Estagio().setText("");
		cadastro.getTextField_Cadastro_ValorValeRefeicao_Estagio().setText("");
		cadastro.getTextField_Cadastro_ValorValeTransporte_Estagio().setText("");
		cadastro.getTextPane_AtividadesRealizadas_Estagio().setText("");		
		cadastro.getComboBox_Cadastro_Curso_Estudante().setSelectedIndex(0);
		cadastro.getComboBox_Cadastro_UF_EmpresaContratante().setSelectedIndex(0);
		cadastro.getComboBox_Cadastro_UF_Estudante().setSelectedIndex(0);
		cadastro.getComboBox_Curso_CoordenadorUFCSPA().setSelectedIndex(0);		
		cadastro.getBg_EstagioObrigatorio_Estagio().clearSelection();
		cadastro.getBg_SeguroAcidente_Estagio().clearSelection();
		cadastro.getBg_ValeRefeicao_Estagio().clearSelection();
		cadastro.getBg_ValeTransporte().clearSelection();	
	}
	
	// Método para cadastrar um novo formulário no jpanel Cadastro
	public void cadastroCadastrar(){		
		if(	   cadastro.getTextField_Cadastro_Atuacao_Estagio().getText().isEmpty() 
			|| cadastro.getTextField_Cadastro_Bairro_Estudante().getText().isEmpty() 
			|| cadastro.getTextField_Cadastro_CargaHoraria_Estagio().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_CargoContratante_EmpresaContratante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_CargoOrientadorResponsavel_Estagio().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_CEP_EmpresaContratante().getText().isEmpty() 
			|| cadastro.getTextField_Cadastro_CEP_Estudante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Cidade_EmpresaContratante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Cidade_Estudante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_CNPJ_EmpresaContratante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Contratante_EmpresaContratante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_CPF_CoordenadorUFCSPA().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_CPF_Estudante().getText().isEmpty()				
			|| cadastro.getTextField_Cadastro_CPFContratante_EmpresaContratante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Endereco_EmpresaContratante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Endereco_Estudante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Inicio_Estagio().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Matricula_Estudante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Nascimento_Estudante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Nome_CoordenadorUFCSPA().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Nome_EmpresaContratante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Nome_Estudante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_OrientadorResponsavel_Estagio().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_ProfessorResponsavel_Estagio().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_RG_CoordenadorUFCSPA().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_RG_Estudante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_RGContratante_EmpresaContratante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Semestre_Estudante().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_SIAPE_Estagio().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_Termino_Estagio().getText().isEmpty()
			|| cadastro.getTextField_Cadastro_ValorDaolsa_Estagio().getText().isEmpty()
			|| cadastro.getTextPane_AtividadesRealizadas_Estagio().getText().isEmpty())
		{			
			JOptionPane.showMessageDialog(null, "Existem valores obrigatórios que não foram preenchidos!", "Dados Faltantes", 1);		
		}
		else{
			
			formulario = new FormularioEstagio();
			boolean camposPreenchidos = true;
			int mensagem = 0;
			
			if(cadastro.getRdbtnCadastro_EstagioObrigatorio_SIM().isSelected()) {
				formulario.setEstagioObrigatorio(cadastro.getRdbtnCadastro_EstagioObrigatorio_SIM().getText());
			}else{
				formulario.setEstagioObrigatorio(cadastro.getRdbtnCadastro_EstagioObrigatorio_NAO().getText());}
			
			if(cadastro.getRdbtnCadastro_SeguroAcidente_SIM().isSelected()) {
				if(cadastro.getTextField_Cadastro_Apolice_Estagio().getText().isEmpty() || cadastro.getTextField_Cadastro_Seguradora_Estagio().getText().isEmpty()) {
					camposPreenchidos = false;
					mensagem = 1;
				}else {
					formulario.setSeguroAcidente(cadastro.getRdbtnCadastro_SeguroAcidente_SIM().getText());
					formulario.setSeguradora_Estagio(cadastro.getTextField_Cadastro_Seguradora_Estagio().getText());
					formulario.setApolice_Estagio(cadastro.getTextField_Cadastro_Apolice_Estagio().getText());
				}	
			}else {
				formulario.setSeguroAcidente(cadastro.getRdbtnCadastro_SeguroAcidente_NAO().getText());
				formulario.setSeguradora_Estagio(null);
				formulario.setApolice_Estagio(null);
			}
			
			if(cadastro.getRdbtnCadastro_ValeRefeicao_SIM().isSelected()){
				if(cadastro.getTextField_Cadastro_ValorValeRefeicao_Estagio().getText().isEmpty()){
					camposPreenchidos = false;
					mensagem = 2;
				}else {
					formulario.setValeRefeicao(cadastro.getRdbtnCadastro_ValeRefeicao_SIM().getText());
					formulario.setValorValeRefeicao_Estagio(cadastro.getTextField_Cadastro_ValorValeRefeicao_Estagio().getText());
				}
			}else {
				formulario.setValeRefeicao(cadastro.getRdbtnCadastro_ValeRefeicao_NAO().getText());
				formulario.setValorValeRefeicao_Estagio("0");
			}
			
			if(cadastro.getRdbtnCadastro_ValeTransporte_SIM().isSelected()){
				if(cadastro.getTextField_Cadastro_ValorValeTransporte_Estagio().getText().isEmpty()) {
					camposPreenchidos = false;
					mensagem = 3;
				}else {
					formulario.setValeTransporte(cadastro.getRdbtnCadastro_ValeTransporte_SIM().getText());
					formulario.setValorValeTransporte_Estagio(cadastro.getTextField_Cadastro_ValorValeTransporte_Estagio().getText());
				}
			}else {
				formulario.setValeTransporte(cadastro.getRdbtnCadastro_ValeTransporte_NAO().getText());
				formulario.setValorValeTransporte_Estagio("0");
			}
			
			if(cadastro.getComboBox_Cadastro_Curso_Estudante().getSelectedItem().toString().equals("Selecione") || cadastro.getComboBox_Curso_CoordenadorUFCSPA().getSelectedItem().toString().equals("Selecione")){
				camposPreenchidos = false;
				mensagem = 4;
			}
					
			if(camposPreenchidos == true) {
				formulario.setAtuacao_Estagio(cadastro.getTextField_Cadastro_Atuacao_Estagio().getText());
				formulario.setBairro_Estudante(cadastro.getTextField_Cadastro_Bairro_Estudante().getText());
				formulario.setCargoContratante_EmpresaContratante(cadastro.getTextField_Cadastro_CargoContratante_EmpresaContratante().getText());
				formulario.setCargoOrientador_Estagio(cadastro.getTextField_Cadastro_CargoOrientadorResponsavel_Estagio().getText());
				formulario.setCEP_EmpresaContratante(cadastro.getTextField_Cadastro_CEP_EmpresaContratante().getText());
				formulario.setCEP_Estudante(cadastro.getTextField_Cadastro_CEP_Estudante().getText());
				formulario.setCidade_EmpresaContratante(cadastro.getTextField_Cadastro_Cidade_EmpresaContratante().getText());
				formulario.setCidade_Estudante(cadastro.getTextField_Cadastro_Cidade_Estudante().getText());
				formulario.setCNPJ_EmpresaContratante(cadastro.getTextField_Cadastro_CNPJ_EmpresaContratante().getText());
				formulario.setContratante_EmpresaContratante(cadastro.getTextField_Cadastro_Contratante_EmpresaContratante().getText());
				formulario.setCPF_CoordenadorUFCSPA(cadastro.getTextField_Cadastro_CPF_CoordenadorUFCSPA().getText());
				formulario.setCPF_Estudante(cadastro.getTextField_Cadastro_CPF_Estudante().getText());
				formulario.setCPFContratante_EmpresaContratante(cadastro.getTextField_Cadastro_CPFContratante_EmpresaContratante().getText());
				formulario.setEndereco_EmpresaContratante(cadastro.getTextField_Cadastro_Endereco_EmpresaContratante().getText());
				formulario.setEndereco_Estudante(cadastro.getTextField_Cadastro_Endereco_Estudante().getText());
				formulario.setInicio_Estagio(cadastro.getTextField_Cadastro_Inicio_Estagio().getText());
				formulario.setMatricula_Estudante(cadastro.getTextField_Cadastro_Matricula_Estudante().getText());
				formulario.setNascimento_Estudante(cadastro.getTextField_Cadastro_Nascimento_Estudante().getText());
				formulario.setNome_CoordenadorUFCSPA(cadastro.getTextField_Cadastro_Nome_CoordenadorUFCSPA().getText());
				formulario.setNome_EmpresaContratante(cadastro.getTextField_Cadastro_Nome_EmpresaContratante().getText());
				formulario.setNome_Estudante(cadastro.getTextField_Cadastro_Nome_Estudante().getText());
				formulario.setOrientadorResponsavel_Estagio(cadastro.getTextField_Cadastro_OrientadorResponsavel_Estagio().getText());
				formulario.setProfessorResponsavel_Estagio(cadastro.getTextField_Cadastro_ProfessorResponsavel_Estagio().getText());
				formulario.setRG_CoordenadorUFCSPA(cadastro.getTextField_Cadastro_RG_CoordenadorUFCSPA().getText());
				formulario.setRG_Estudante(cadastro.getTextField_Cadastro_RG_Estudante().getText());
				formulario.setRGContratante_EmpresaContratante(cadastro.getTextField_Cadastro_RGContratante_EmpresaContratante().getText());
				formulario.setSIAPE_Estagio(cadastro.getTextField_Cadastro_SIAPE_Estagio().getText());
				formulario.setTermino_Estagio(cadastro.getTextField_Cadastro_Termino_Estagio().getText());
				formulario.setSemestre_Estudante(cadastro.getTextField_Cadastro_Semestre_Estudante().getText());
				formulario.setCargaHoraria_Estagio(cadastro.getTextField_Cadastro_CargaHoraria_Estagio().getText());
				formulario.setValorDaolsa_Estagio(cadastro.getTextField_Cadastro_ValorDaolsa_Estagio().getText());				
				formulario.setTextPane_AtividadesRealizadas_Estagio(cadastro.getTextPane_AtividadesRealizadas_Estagio().getText());
				formulario.setComboBox_Cadastro_Curso_Estudante(cadastro.getComboBox_Cadastro_Curso_Estudante().getSelectedItem().toString());
				formulario.setComboBox_Cadastro_UF_EmpresaContratante(cadastro.getComboBox_Cadastro_UF_EmpresaContratante().getSelectedItem().toString());
				formulario.setComboBox_Cadastro_UF_Estudante(cadastro.getComboBox_Cadastro_UF_Estudante().getSelectedItem().toString());
				formulario.setComboBox_Curso_CoordenadorUFCSPA(cadastro.getComboBox_Curso_CoordenadorUFCSPA().getSelectedItem().toString());
				
				dao.cadastraFormulario(formulario);
				
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				
			}else {
				if(mensagem == 1) {
					JOptionPane.showMessageDialog(null, "Os dados de Seguradora estão faltando!", "Dados Faltantes", 1);
				}else if(mensagem == 2){
					JOptionPane.showMessageDialog(null, "Por favor preencha o valor do vale refeição!", "Dados Faltantes", 1);
				}else if(mensagem == 3) {
					JOptionPane.showMessageDialog(null, "Por favor preencha o valor do vale transporte", "Dados Faltantes", 1);
				}else if(mensagem == 4) {
					JOptionPane.showMessageDialog(null, "Não esqueça de preencher os campos de seleção de curso!", "Dados Faltantes", 1);
				}
			}			
		}	
	}
	
	// Métodos para buscar um formulário no DAO através do CPF do estudante
	public void buscarFormulario(){
		formulario = dao.buscaFormulario(buscaAtualiza.getTextField_Buscar_CPF_QUERYBANCO().getText());
		
		if(formulario == null) {
			JOptionPane.showMessageDialog(null, "CPF não encontrado!", "CPF não encontrado", 1);
		}else {
			buscaAtualiza.getTextField_Buscar_Apolice_Estagio().setText(formulario.getApolice_Estagio());
			buscaAtualiza.getTextField_Buscar_Atuacao_Estagio().setText(formulario.getAtuacao_Estagio());
			buscaAtualiza.getTextField_Buscar_Bairro_Estudante().setText(formulario.getBairro_Estudante());
			buscaAtualiza.getTextField_Buscar_CargoContratante_EmpresaContratante().setText(formulario.getCargoContratante_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_CargoOrientadorResponsavel_Estagio().setText(formulario.getCargoOrientador_Estagio());
			buscaAtualiza.getTextField_Buscar_CEP_EmpresaContratante().setText(formulario.getCEP_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_CEP_Estudante().setText(formulario.getCEP_Estudante());
			buscaAtualiza.getTextField_Buscar_Cidade_EmpresaContratante().setText(formulario.getCidade_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_Cidade_Estudante().setText(formulario.getCidade_Estudante());
			buscaAtualiza.getTextField_Buscar_CNPJ_EmpresaContratante().setText(formulario.getCNPJ_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_Contratante_EmpresaContratante().setText(formulario.getContratante_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_CPF_CoordenadorUFCSPA().setText(formulario.getCPF_CoordenadorUFCSPA());
			buscaAtualiza.getTextField_Buscar_CPFContratante_EmpresaContratante().setText(formulario.getCPFContratante_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_Endereco_EmpresaContratante().setText(formulario.getEndereco_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_Endereco_Estudante().setText(formulario.getEndereco_Estudante());
			buscaAtualiza.getTextField_Buscar_Inicio_Estagio().setText(formulario.getInicio_Estagio());
			buscaAtualiza.getTextField_Buscar_Matricula_Estudante().setText(formulario.getMatricula_Estudante());
			buscaAtualiza.getTextField_Buscar_Nascimento_Estudante().setText(formulario.getNascimento_Estudante());
			buscaAtualiza.getTextField_Buscar_Nome_EmpresaContratante().setText(formulario.getNome_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_Nome_Estudante().setText(formulario.getNome_Estudante());
			buscaAtualiza.getTextField_Buscar_OrientadorResponsavel_Estagio().setText(formulario.getOrientadorResponsavel_Estagio());
			buscaAtualiza.getTextField_Buscar_ProfessorResponsavel_Estagio().setText(formulario.getProfessorResponsavel_Estagio());
			buscaAtualiza.getTextField_Buscar_RG_CoordenadorUFCSPA().setText(formulario.getRG_CoordenadorUFCSPA());
			buscaAtualiza.getTextField_Buscar_RG_Estudante().setText(formulario.getRG_Estudante());
			buscaAtualiza.getTextField_Buscar_RGContratante_EmpresaContratante().setText(formulario.getRGContratante_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_Seguradora_Estagio().setText(formulario.getSeguradora_Estagio());
			buscaAtualiza.getTextField_Buscar_SIAPE_Estagio().setText(formulario.getSIAPE_Estagio());
			buscaAtualiza.getTextField_Buscar_Termino_Estagio().setText(formulario.getTermino_Estagio());
			buscaAtualiza.getTextPane_AtividadesRealizadas_Estagio().setText(formulario.getTextPane_AtividadesRealizadas_Estagio());
			buscaAtualiza.getTextField_Buscar_UFEmpresa().setText(formulario.getComboBox_Cadastro_UF_EmpresaContratante());
			buscaAtualiza.getTextField_Buscar_UFEstudante().setText(formulario.getComboBox_Cadastro_UF_Estudante());		
			buscaAtualiza.getTextField_Buscar_CursoCoordenadorUFCSPA().setText(formulario.getCursoCoordenador());
			buscaAtualiza.getTextField_Buscar_Nome_CoordenadorUFCSPA().setText(formulario.getNome_CoordenadorUFCSPA());
			buscaAtualiza.getTextField_Buscar_CursoEstudante().setText(formulario.getCurdoEstudante());
			buscaAtualiza.getTextField_Buscar_CargaHoraria_Estagio().setText(formulario.getCargaHoraria_Estagio());
			buscaAtualiza.getTextField_Buscar_Semestre_Estudante().setText(formulario.getSemestre_Estudante());
			buscaAtualiza.getTextField_Buscar_ValorDaolsa_Estagio().setText(formulario.getValorDaolsa_Estagio());
			buscaAtualiza.getTextField_Buscar_ValorValeRefeicao_Estagio().setText(formulario.getValorValeRefeicao_Estagio());
			buscaAtualiza.getTextField_Buscar_ValorValeTransporte_Estagio().setText(formulario.getValorValeTransporte_Estagio());
			buscaAtualiza.getTextField_Buscar_EstagioObrigatorio().setText(formulario.getEstagioObrigatorio());
			buscaAtualiza.getTextField_Buscar_ValeRefeicao().setText(formulario.getValeRefeicao());
			buscaAtualiza.getTextField_Buscar_ValeTransporte().setText(formulario.getValeTransporte());
			buscaAtualiza.getTextField_Buscar_SeguroAcidente().setText(formulario.getSeguroAcidente());
			
			buscaAtualiza.repaint();
		}	
	}
	
	// Método para atualizar formulário já existente
	public void atualizarFormulario() {
		boolean prontoParaAtualizar = true;
		
		if(    buscaAtualiza.getTextField_Buscar_Atuacao_Estagio().getText().isEmpty() 
			|| buscaAtualiza.getTextField_Buscar_Bairro_Estudante().getText().isEmpty() 
			|| buscaAtualiza.getTextField_Buscar_CargaHoraria_Estagio().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_CargoContratante_EmpresaContratante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_CargoOrientadorResponsavel_Estagio().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_CEP_EmpresaContratante().getText().isEmpty() 
			|| buscaAtualiza.getTextField_Buscar_CEP_Estudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Cidade_EmpresaContratante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Cidade_Estudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_CNPJ_EmpresaContratante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Contratante_EmpresaContratante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_CPF_CoordenadorUFCSPA().getText().isEmpty()			
			|| buscaAtualiza.getTextField_Buscar_CPFContratante_EmpresaContratante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Endereco_EmpresaContratante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Endereco_Estudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Inicio_Estagio().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Matricula_Estudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Nascimento_Estudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Nome_CoordenadorUFCSPA().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Nome_EmpresaContratante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Nome_Estudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_OrientadorResponsavel_Estagio().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_ProfessorResponsavel_Estagio().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_RG_CoordenadorUFCSPA().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_RG_Estudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_RGContratante_EmpresaContratante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Semestre_Estudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_SIAPE_Estagio().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_Termino_Estagio().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_CursoCoordenadorUFCSPA().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_CursoEstudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_UFEmpresa().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_UFEstudante().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_ValorDaolsa_Estagio().getText().isEmpty()
			|| buscaAtualiza.getTextField_Buscar_EstagioObrigatorio().getText().isEmpty()
			|| buscaAtualiza.getTextPane_AtividadesRealizadas_Estagio().getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Não foi possível atualizar o cadastro!", "Erro", 1);
			prontoParaAtualizar = false;
				
		}else {
			formulario = new FormularioEstagio();	
			
			if(buscaAtualiza.getTextField_Buscar_ValeRefeicao().getText().equalsIgnoreCase("SIM") && (buscaAtualiza.getTextField_Buscar_ValorValeRefeicao_Estagio().getText().isEmpty() || 
				buscaAtualiza.getTextField_Buscar_ValorValeRefeicao_Estagio().getText().equalsIgnoreCase("0"))){
				JOptionPane.showMessageDialog(null, "Atribua um valor para Vale Refeição!", "Dados faltantes", 1);
				prontoParaAtualizar = false;
			}else if(buscaAtualiza.getTextField_Buscar_ValeRefeicao().getText().equalsIgnoreCase("Não") || buscaAtualiza.getTextField_Buscar_ValeRefeicao().getText().isEmpty()) {
				formulario.setValorValeRefeicao_Estagio("0");
				formulario.setValeRefeicao("Não");
			}else{
				formulario.setValorValeRefeicao_Estagio(buscaAtualiza.getTextField_Buscar_ValorValeRefeicao_Estagio().getText());
				formulario.setValeRefeicao("Sim");
			}
		
			if(buscaAtualiza.getTextField_Buscar_ValeTransporte().getText().equalsIgnoreCase("SIM") && (buscaAtualiza.getTextField_Buscar_ValorValeTransporte_Estagio().getText().isEmpty() ||
				buscaAtualiza.getTextField_Buscar_ValorValeTransporte_Estagio().getText().equals("0"))) {
				JOptionPane.showMessageDialog(null, "Atribua um valor para Vale Transporte!", "Dados faltantes", 1);
				prontoParaAtualizar = false;
			}else if(buscaAtualiza.getTextField_Buscar_ValeTransporte().getText().equalsIgnoreCase("NÃO") || buscaAtualiza.getTextField_Buscar_ValeTransporte().getText().isEmpty()) {
				formulario.setValorValeTransporte_Estagio("0");
				formulario.setValeTransporte("Não");
			}else {
				formulario.setValorValeTransporte_Estagio(buscaAtualiza.getTextField_Buscar_ValorValeTransporte_Estagio().getText());
				formulario.setValeTransporte("Sim");
			}
		
			if(buscaAtualiza.getTextField_Buscar_SeguroAcidente().getText().equalsIgnoreCase("SIM") && (buscaAtualiza.getTextField_Buscar_Seguradora_Estagio().getText().isEmpty() ||
				buscaAtualiza.getTextField_Buscar_Apolice_Estagio().getText().isEmpty())) {
				JOptionPane.showMessageDialog(null, "Estão faltando o dados do Seguro!", "Dados faltantes", 1);
				prontoParaAtualizar = false;
			}else if(buscaAtualiza.getTextField_Buscar_SeguroAcidente().getText().equalsIgnoreCase("Não") || buscaAtualiza.getTextField_Buscar_SeguroAcidente().getText().isEmpty() ){
				formulario.setSeguradora_Estagio("");
				formulario.setApolice_Estagio("");
				formulario.setSeguroAcidente("Não");
			}else {
				formulario.setSeguradora_Estagio(buscaAtualiza.getTextField_Buscar_Seguradora_Estagio().getText());
				formulario.setSeguroAcidente("Sim");
				formulario.setApolice_Estagio(buscaAtualiza.getTextField_Buscar_Apolice_Estagio().getText());
			}
		}
		
		if(prontoParaAtualizar == true) {
			formulario.setAtuacao_Estagio(buscaAtualiza.getTextField_Buscar_Atuacao_Estagio().getText());
			formulario.setBairro_Estudante(buscaAtualiza.getTextField_Buscar_Bairro_Estudante().getText());
			formulario.setCargoContratante_EmpresaContratante(buscaAtualiza.getTextField_Buscar_CargoContratante_EmpresaContratante().getText());
			formulario.setCargoOrientador_Estagio(buscaAtualiza.getTextField_Buscar_CargoOrientadorResponsavel_Estagio().getText());
			formulario.setCEP_EmpresaContratante(buscaAtualiza.getTextField_Buscar_CEP_EmpresaContratante().getText());
			formulario.setCEP_Estudante(buscaAtualiza.getTextField_Buscar_CEP_Estudante().getText());
			formulario.setCidade_EmpresaContratante(buscaAtualiza.getTextField_Buscar_Cidade_EmpresaContratante().getText());
			formulario.setCidade_Estudante(buscaAtualiza.getTextField_Buscar_Cidade_Estudante().getText());
			formulario.setCNPJ_EmpresaContratante(buscaAtualiza.getTextField_Buscar_CNPJ_EmpresaContratante().getText());
			formulario.setContratante_EmpresaContratante(buscaAtualiza.getTextField_Buscar_Contratante_EmpresaContratante().getText());
			formulario.setCPF_CoordenadorUFCSPA(buscaAtualiza.getTextField_Buscar_CPF_CoordenadorUFCSPA().getText());
			formulario.setCPFContratante_EmpresaContratante(buscaAtualiza.getTextField_Buscar_CPFContratante_EmpresaContratante().getText());
			formulario.setEndereco_EmpresaContratante(buscaAtualiza.getTextField_Buscar_Endereco_EmpresaContratante().getText());
			formulario.setEndereco_Estudante(buscaAtualiza.getTextField_Buscar_Endereco_Estudante().getText());
			formulario.setInicio_Estagio(buscaAtualiza.getTextField_Buscar_Inicio_Estagio().getText());
			formulario.setMatricula_Estudante(buscaAtualiza.getTextField_Buscar_Matricula_Estudante().getText());
			formulario.setNascimento_Estudante(buscaAtualiza.getTextField_Buscar_Nascimento_Estudante().getText());
			formulario.setNome_CoordenadorUFCSPA(buscaAtualiza.getTextField_Buscar_Nome_CoordenadorUFCSPA().getText());
			formulario.setNome_EmpresaContratante(buscaAtualiza.getTextField_Buscar_Nome_EmpresaContratante().getText());
			formulario.setNome_Estudante(buscaAtualiza.getTextField_Buscar_Nome_Estudante().getText());
			formulario.setOrientadorResponsavel_Estagio(buscaAtualiza.getTextField_Buscar_OrientadorResponsavel_Estagio().getText());
			formulario.setProfessorResponsavel_Estagio(buscaAtualiza.getTextField_Buscar_ProfessorResponsavel_Estagio().getText());
			formulario.setRG_CoordenadorUFCSPA(buscaAtualiza.getTextField_Buscar_RG_CoordenadorUFCSPA().getText());
			formulario.setRG_Estudante(buscaAtualiza.getTextField_Buscar_RG_Estudante().getText());
			formulario.setRGContratante_EmpresaContratante(buscaAtualiza.getTextField_Buscar_RGContratante_EmpresaContratante().getText());
			formulario.setSIAPE_Estagio(buscaAtualiza.getTextField_Buscar_SIAPE_Estagio().getText());
			formulario.setTermino_Estagio(buscaAtualiza.getTextField_Buscar_Termino_Estagio().getText());
			formulario.setSemestre_Estudante(buscaAtualiza.getTextField_Buscar_Semestre_Estudante().getText());
			formulario.setCargaHoraria_Estagio(buscaAtualiza.getTextField_Buscar_CargaHoraria_Estagio().getText());	
			formulario.setValorDaolsa_Estagio(buscaAtualiza.getTextField_Buscar_ValorDaolsa_Estagio().getText());				
			formulario.setTextPane_AtividadesRealizadas_Estagio(buscaAtualiza.getTextPane_AtividadesRealizadas_Estagio().getText());
			formulario.setComboBox_Cadastro_Curso_Estudante(buscaAtualiza.getTextField_Buscar_CursoEstudante().getText());
			formulario.setComboBox_Cadastro_UF_EmpresaContratante(buscaAtualiza.getTextField_Buscar_UFEmpresa().getText());
			formulario.setComboBox_Cadastro_UF_Estudante(buscaAtualiza.getTextField_Buscar_UFEstudante().getText());
			formulario.setComboBox_Curso_CoordenadorUFCSPA(buscaAtualiza.getTextField_Buscar_CursoCoordenadorUFCSPA().getText());
			formulario.setEstagioObrigatorio(buscaAtualiza.getTextField_Buscar_EstagioObrigatorio().getText());
				
			dao.atualizaFormulario(buscaAtualiza.getTextField_Buscar_CPF_QUERYBANCO().getText(), formulario);
			
			JOptionPane.showMessageDialog(null, "Formulário de Estágio atualizado!", "Atualização Concluida", 2);
		}			
	}
	
	// Método para limpar todos os campos do jpanel Busca_Atualiza
	public void limparBusca_Atualiza(){
		buscaAtualiza.getTextField_Buscar_Apolice_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_Atuacao_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_Bairro_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_CargaHoraria_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_CargoContratante_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_CargoOrientadorResponsavel_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_CEP_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_CEP_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_Cidade_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_Cidade_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_CNPJ_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_Contratante_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_CPF_CoordenadorUFCSPA().setText("");
		buscaAtualiza.getTextField_Buscar_CPF_QUERYBANCO().setText("");
		buscaAtualiza.getTextField_Buscar_CPFContratante_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_CursoCoordenadorUFCSPA().setText("");
		buscaAtualiza.getTextField_Buscar_CursoEstudante().setText("");
		buscaAtualiza.getTextField_Buscar_Endereco_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_Endereco_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_EstagioObrigatorio().setText("");
		buscaAtualiza.getTextField_Buscar_Inicio_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_Matricula_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_Nascimento_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_Nome_CoordenadorUFCSPA().setText("");
		buscaAtualiza.getTextField_Buscar_Nome_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_Nome_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_OrientadorResponsavel_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_ProfessorResponsavel_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_RG_CoordenadorUFCSPA().setText("");
		buscaAtualiza.getTextField_Buscar_RG_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_RGContratante_EmpresaContratante().setText("");
		buscaAtualiza.getTextField_Buscar_Seguradora_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_SeguroAcidente().setText("");
		buscaAtualiza.getTextField_Buscar_Semestre_Estudante().setText("");
		buscaAtualiza.getTextField_Buscar_SIAPE_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_Termino_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_UFEmpresa().setText("");
		buscaAtualiza.getTextField_Buscar_UFEstudante().setText("");
		buscaAtualiza.getTextField_Buscar_ValeRefeicao().setText("");
		buscaAtualiza.getTextField_Buscar_ValeTransporte().setText("");
		buscaAtualiza.getTextField_Buscar_ValorDaolsa_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_ValorValeRefeicao_Estagio().setText("");
		buscaAtualiza.getTextField_Buscar_ValorValeTransporte_Estagio().setText("");
		buscaAtualiza.getTextPane_AtividadesRealizadas_Estagio().setText("");		
	}
	
	// Método para limpar jtextField do jpanel Deleta
	public void limparDeleta(){
		deleta.getTextField_Excluir_Formulario().setText("");
	}
	
	// Método para excluir formulário através do jpanel Deleta
	public void excluirDeleta() {
		if(dao.buscaFormulario(deleta.getTextField_Excluir_Formulario().getText()) == null){
			JOptionPane.showMessageDialog(null, "CPF não encontrado!", "Erro ao excluir formulário", 1);
		}else {
			dao.excluirFormulario(deleta.getTextField_Excluir_Formulario().getText());
			JOptionPane.showMessageDialog(null, "Formulario excluido!", "Formulário excluido com sucesso", 2);
		}		
	}
}
