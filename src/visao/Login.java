package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Login extends JPanel {
	private JTextField textField_Usuario;
	private JButton btnLogin_Entrar;
	private JButton btnLogin_Limpar;
	private JButton btnLogin_Sair;
	private JPasswordField textField_Senha;

	public Login() {
		setBackground(new Color(240, 250, 255));
		setBounds(100, 100, 800, 500);
		setLayout(new MigLayout("", "[100,grow][100,center][100,center][100,center][100,grow]", "[25,grow][25][25][25][25,center][25][28.00][25][25][25][][11.00][25][25][25,grow]"));
		
		JLabel lblAutenticacaoUsuario = new JLabel("Autentica\u00E7\u00E3o de Usu\u00E1rio");
		lblAutenticacaoUsuario.setFont(new Font("Segoe UI", Font.BOLD, 30));
		add(lblAutenticacaoUsuario, "cell 1 1 3 1,alignx center,aligny bottom");
		
		//ADICIONANDO ICON DE LOGIN 
		JLabel imagemLogo = new JLabel(" ");
		add(imagemLogo, "cell 1 3 3 4,alignx center,aligny center");
		try {
			imagemLogo.setIcon(new ImageIcon(ImageIO.read(Login.class.getResource(
					"/icones_logos/login-grande.png")).getScaledInstance(120, 120, BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel lblLogin_Usuario = new JLabel("Usu\u00E1rio: ");
		lblLogin_Usuario.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		add(lblLogin_Usuario, "cell 1 8,alignx right");
		
		textField_Usuario = new JTextField();
		textField_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(textField_Usuario, "cell 2 8,growx,aligny center");
		textField_Usuario.setColumns(10);
		
		textField_Senha = new JPasswordField();
		textField_Senha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(textField_Senha, "cell 2 10,growx,aligny center");
		
		JLabel lblLogin_Senha = new JLabel("Senha: ");
		lblLogin_Senha.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		add(lblLogin_Senha, "cell 1 10,alignx right");
		
		//ADICIONANDO BOTOES DE ENTRAR E LIMPAR
		btnLogin_Entrar = new JButton("Entrar");
		btnLogin_Entrar.setIcon(new ImageIcon(Login.class.getResource("/icones_logos/check.png")));
		btnLogin_Entrar.setSelectedIcon(new ImageIcon(Login.class.getResource("/icones_logos/add-file.png")));
		btnLogin_Entrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(btnLogin_Entrar, "flowx,cell 2 12,growx,aligny center");
		
		btnLogin_Limpar = new JButton("Limpar");
		btnLogin_Limpar.setIcon(new ImageIcon(Login.class.getResource("/icones_logos/eraser.png")));
		btnLogin_Limpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(btnLogin_Limpar, "cell 2 12,growx,aligny center");
	}

	public JTextField getTextField_Usuario() {
		return textField_Usuario;
	}

	public void setTextField_Usuario(JTextField textField_Usuario) {
		this.textField_Usuario = textField_Usuario;
	}

	public JButton getBtnLogin_Entrar() {
		return btnLogin_Entrar;
	}

	public void setBtnLogin_Entrar(JButton btnLogin_Entrar) {
		this.btnLogin_Entrar = btnLogin_Entrar;
	}

	public JButton getBtnLogin_Limpar() {
		return btnLogin_Limpar;
	}

	public void setBtnLogin_Limpar(JButton btnLogin_Limpar) {
		this.btnLogin_Limpar = btnLogin_Limpar;
	}

	public JButton getBtnLogin_Sair() {
		return btnLogin_Sair;
	}

	public void setBtnLogin_Sair(JButton btnLogin_Sair) {
		this.btnLogin_Sair = btnLogin_Sair;
	}

	public JPasswordField getTextField_Senha() {
		return textField_Senha;
	}

	public void setTextField_Senha(JPasswordField textField_Senha) {
		this.textField_Senha = textField_Senha;
	}
	//FUNÇAO LIMPAR CAMPOS DE USUARIO E SENHA
	public void limparLogin() {
		getTextField_Usuario().setText("");
		getTextField_Senha().setText("");
	}
}
