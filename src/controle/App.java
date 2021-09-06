package controle;

import visao.Login;

public class App {
	public static void main(String[] args) {
		Login login = new Login();
		Controle controle = new Controle(login);
	}
}