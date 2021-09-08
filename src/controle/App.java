package controle;

import dao.ConexaoMySQL;
import modelo.AutenticacaoUsuario;
import modelo.TermoModel;
import visao.JanelaPrincipal;
import visao.Logon;
import visao.TermoDeCompromisso;

public class App {
	
	public static void main(String[] args) {
		
		Logon login = new Logon();
		JanelaPrincipal jp = new JanelaPrincipal();
		AutenticacaoUsuario au = new AutenticacaoUsuario();
		
		TermoModel tm= new TermoModel();
		TermoDeCompromisso ttc= new TermoDeCompromisso();
		
		jp.setVisible(true);
		
		ControleAutenticar ca = new ControleAutenticar(au, jp, login);
		ControleTermo ct= new ControleTermo(ttc, tm, jp);
		
		ConexaoMySQL.configConnection("localhost", "trabalhofinalpoo2", "gabi", "123456", 3306);
	}
}