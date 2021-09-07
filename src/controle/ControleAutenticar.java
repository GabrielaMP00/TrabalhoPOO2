package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dao.Dao;
import modelo.AutenticacaoUsuario;
import modelo.FormularioEstagio;
import visao.Busca_Atualiza;
import visao.Cadastro;
import visao.Deleta;
import visao.JanelaPrincipal;
import visao.Login;
import visao.Menu;
	
public class ControleAutenticar implements ActionListener {
	private AutenticacaoUsuario autenticacao;
	private JanelaPrincipal janelaPrincipal;
	private Login login;
	private Dao dao;
	
	public ControleAutenticar(AutenticacaoUsuario autenticacao, JanelaPrincipal janelaPrincipal, Login login) {
		super();
		this.autenticacao = autenticacao;
		this.janelaPrincipal = janelaPrincipal;
		this.login = login;	
		this.janelaPrincipal.getLogin().getBtnLogin_Limpar().addActionListener(this);
		this.janelaPrincipal.getLogin().getBtnLogin_Entrar().addActionListener(this);
		this.janelaPrincipal.getItemSair().addActionListener(this);
		
		dao = new Dao();
		
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("Sair")){
				int op = JOptionPane.showConfirmDialog(janelaPrincipal.getContentPane(), "Deseja sair?", "SAIR", 0, 1, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));
				
				if(op==JOptionPane.OK_OPTION) 
					System.exit(0);
			}
			
			if(e.getActionCommand().equals("Limpar")) {
				this.janelaPrincipal.getLogin().limparLogin();
			} 
			// TODO Auto-generated method stub

			if(e.getActionCommand().equals("Entrar")) {
				autenticacao.setUsuario(login.getTextField_Usuario().getText());
				autenticacao.setSenha(login.getTextField_Senha().getText());
					try {
						dao.autenticarUsuario(autenticacao);
						janelaPrincipal.getMenuGerenciar().setVisible(true);
						JOptionPane.showMessageDialog(login, "Login realizado com sucesso!", "Login Efetuado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/check.png")));
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(login,"Falha ao realizar login!","Erro",JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));
					}
					
			}
		}
	}
