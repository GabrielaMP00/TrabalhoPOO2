package controle;

import dao.ConexaoMySQL;
import modelo.AutenticacaoUsuario;
import visao.JanelaPrincipal;
import visao.Login;

public class App {
	public static void main(String[] args) {
		Login login = new Login();
		JanelaPrincipal jp = new JanelaPrincipal();
		AutenticacaoUsuario au = new AutenticacaoUsuario();
		
		jp.setVisible(true);
		
		ControleAutenticar ca = new ControleAutenticar(au, jp, login);
		
		ConexaoMySQL.configConnection("localhost", "trabalhofinalpoo2", "gabi", "123456", 3306);
	}
}