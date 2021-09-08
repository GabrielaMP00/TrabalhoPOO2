package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dao.Dao;
import modelo.AutenticacaoUsuario;
import visao.JanelaPrincipal;
import visao.Logon;

	
public class ControleAutenticar implements ActionListener {
	private AutenticacaoUsuario autenticacao;
	private JanelaPrincipal janelaPrincipal;
	private Logon login;
	private Dao dao;
	
	//incializando as classes e adicionando listeners nos botões
	public ControleAutenticar(AutenticacaoUsuario autenticacao, JanelaPrincipal janelaPrincipal, Logon login) {
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
			
			//ao clicar no item Sair vai aparecer mensagem confirmando o pedido de saída
			if(e.getActionCommand().equals("Sair")){
				int op = JOptionPane.showConfirmDialog(janelaPrincipal.getContentPane(), "Deseja sair?", "SAIR", 0, 1, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));
				
				if(op==JOptionPane.OK_OPTION) 
					System.exit(0);
			}
			
			//limpa os campos da tela login
			if(e.getActionCommand().equals("Limpar")) {
				this.janelaPrincipal.getLogin().limparLogin();
			} 
			// TODO Auto-generated method stub

			//faz a autenticação do usuário, habilita menu gerenciar ao realizar login com sucesso
			//mostra mensagens de falha ou sucesso de login
			if(e.getActionCommand().equals("Entrar")) {
				autenticacao.setUsuario(login.getTextField_Usuario().getText());
				autenticacao.setSenha(login.getTextField_Senha().getText());
					
				try {
					dao.autenticarUsuario(autenticacao);
					janelaPrincipal.getMenuGerenciar().setEnabled(true);
					JOptionPane.showMessageDialog(login, "Login realizado com sucesso!", "Login Efetuado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/check.png")));
				} catch (Exception e2) {
						// TODO: handle exception
					JOptionPane.showMessageDialog(login,"Falha ao realizar login!","Erro",JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));
				}
					
			}
		}
	}
