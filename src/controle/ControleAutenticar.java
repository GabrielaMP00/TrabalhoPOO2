package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import dao.AutenticarDao;
import modelo.AutenticacaoUsuario;
import visao.JanelaPrincipal;
import visao.Login;

	
public class ControleAutenticar implements ActionListener {
	private AutenticacaoUsuario autenticacao;
	private JanelaPrincipal janelaPrincipal;
	private Login logon;
	private AutenticarDao dao;
	
	//incializando as classes e adicionando listeners nos botões
	public ControleAutenticar(AutenticacaoUsuario autenticacao, JanelaPrincipal janelaPrincipal, Login logon) {
		super();
		this.autenticacao = autenticacao;
		this.janelaPrincipal = janelaPrincipal;
		this.logon = janelaPrincipal.getLogin();	
		this.janelaPrincipal.getLogin().getBtnLogin_Limpar().addActionListener(this);
		this.janelaPrincipal.getLogin().getBtnLogin_Entrar().addActionListener(this);
		this.janelaPrincipal.getItemSair().addActionListener(this);
		
		dao = new AutenticarDao();
		
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
				System.out.println("CAMPOS"+janelaPrincipal.getLogin().getTextField_Usuario().getText()+janelaPrincipal.getLogin().getTextField_Senha().getText());
				autenticacao.setUsuario(logon.getTextField_Usuario().getText());
				autenticacao.setSenha(logon.getTextField_Senha().getText());
					if(dao.autenticarUsuario(autenticacao)) {
						janelaPrincipal.getMenuGerenciar().setEnabled(true);
						JOptionPane.showMessageDialog(logon, "Login realizado com sucesso!", "Login Efetuado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/check.png")));
					}else {
						JOptionPane.showMessageDialog(logon,"Falha ao realizar login!","Erro",JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));
						
					}
			}
		}
	}
