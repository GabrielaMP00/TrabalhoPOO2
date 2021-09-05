package visao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JMenuItem;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class JanelaPrincipal extends JFrame {
	
	private CardLayout card;
	private JPanel contentPane;
	private Login login;
	private Cadastro cadastro;
	private PrincipalFundo principal;

	public JanelaPrincipal() {
		setTitle("Painel de Administra\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		
	//##########MENU############
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuLogon = new JMenu("Logon");
		menuLogon.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuLogon);
		
		JMenuItem itemAutenticar = new JMenuItem("Autenticar");
		itemAutenticar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "panelLogin");
				
			}
			
		});
		itemAutenticar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/logon.png")));
		itemAutenticar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuLogon.add(itemAutenticar);

		
		JMenuItem itemSair = new JMenuItem("Sair");
		itemSair.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/log-out.png")));
		itemSair.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuLogon.add(itemSair);
		
		JMenu menuGerenciar = new JMenu("Gerenciar");
		menuGerenciar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuGerenciar);
		
		JMenuItem itemEstagiario = new JMenuItem("Estagi\u00E1rio");
		itemEstagiario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "panelCadastro");
				
			}
			
		});
		itemEstagiario.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/student.png")));
		itemEstagiario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuGerenciar.add(itemEstagiario);
		
		JMenuItem itemCurso = new JMenuItem("Curso");
		itemCurso.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/mortarboard.png")));
		itemCurso.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuGerenciar.add(itemCurso);
		
		JMenuItem itemConcedente = new JMenuItem("Concedente");
		itemConcedente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/concedente.png")));
		itemConcedente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuGerenciar.add(itemConcedente);
		
		JMenuItem itemTermo = new JMenuItem("Termo de Compromisso");
		itemTermo.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/papel.png")));
		itemTermo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuGerenciar.add(itemTermo);
		
		JLabel labelEspaco = new JLabel("                                                                                                                                                                              ");
		
		menuBar.add(labelEspaco);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				card.show(contentPane, "panelPrincipal");
			}
		});
		botaoVoltar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		botaoVoltar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/back.png")));
		botaoVoltar.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(botaoVoltar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//######################################################
		
		card = new CardLayout( 0, 0 );
		contentPane.setLayout(card);
		
		principal = new PrincipalFundo();
		login = new Login();
		cadastro = new Cadastro();	
		
		contentPane.add(principal, "panelPrincipal");
		contentPane.add(login, "panelLogin");
		contentPane.add(cadastro, "panelCadastro");

	}

	public CardLayout getCard() {
		return card;
	}
	

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public PrincipalFundo getPrincipal() {
		return principal;
	}

	public void setPrincipal(PrincipalFundo principal) {
		this.principal = principal;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
}

