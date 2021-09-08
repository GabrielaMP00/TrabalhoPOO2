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
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class JanelaPrincipal extends JFrame {
	
	private CardLayout card;
	private JPanel contentPane;
	private Logon login;
	private Estagiario estagiario;
	private PrincipalFundo principal;
	private Curso curso;
	private TermoDeCompromisso termo;
	private Concedente concedente;
	private JMenuBar menuBar;
	private JMenu menuLogon, menuGerenciar;
	private JMenuItem itemAutenticar, itemSair, itemEstagiario, itemCurso, itemConcedente, itemTermo;

	public JanelaPrincipal() {
		setTitle("Painel de Administra\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 550);
		
	//##########MENU############
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuLogon = new JMenu("Logon");
		menuLogon.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/login.png")));
		menuLogon.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuLogon);
		
		itemAutenticar = new JMenuItem("Autenticar");
		itemAutenticar.addActionListener(new ActionListener() {
			//ADICIONANDO ACTION LISTENER PARA ALTERAR AS PAGINAS NO CARDLAYOUT
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "panelLogin");
				
			}
			
		});
		itemAutenticar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/logon.png")));
		itemAutenticar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuLogon.add(itemAutenticar);

		
		itemSair = new JMenuItem("Sair");
		itemSair.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/log-out.png")));
		itemSair.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuLogon.add(itemSair);
		
		menuGerenciar = new JMenu("Gerenciar");
		menuGerenciar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/touch-screen.png")));
		menuGerenciar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuGerenciar);
		menuGerenciar.setEnabled(false);
		
		itemEstagiario = new JMenuItem("Estagi\u00E1rio");
		itemEstagiario.addActionListener(new ActionListener() {
			//ADICIONANDO ACTION LISTENER PARA ALTERAR AS PAGINAS NO CARDLAYOUT
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "panelEstagiario");
				
			}
			
		});
		itemEstagiario.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/student.png")));
		itemEstagiario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuGerenciar.add(itemEstagiario);
		
		itemCurso = new JMenuItem("Curso");
		itemCurso.addActionListener(new ActionListener() {
			//ADICIONANDO ACTION LISTENER PARA ALTERAR AS PAGINAS NO CARDLAYOUT
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "panelCurso");
				
			}
			
		});
		itemCurso.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/mortarboard.png")));
		itemCurso.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuGerenciar.add(itemCurso);
		
		itemConcedente = new JMenuItem("Concedente");
		itemConcedente.addActionListener(new ActionListener() {
			//ADICIONANDO ACTION LISTENER PARA ALTERAR AS PAGINAS NO CARDLAYOUT
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "panelConcedente");
				
			}
			
		});
		itemConcedente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/concedente.png")));
		itemConcedente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuGerenciar.add(itemConcedente);
		
		itemTermo = new JMenuItem("Termo de Compromisso");
		itemTermo.addActionListener(new ActionListener() {
			//ADICIONANDO ACTION LISTENER PARA ALTERAR AS PAGINAS NO CARDLAYOUT
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "panelTermo");
				
			}
			
		});
		itemTermo.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/papel.png")));
		itemTermo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuGerenciar.add(itemTermo);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() 
		{//ADICIONANDO ACTION LISTENER PARA ALTERAR AS PAGINAS NO CARDLAYOUT
			public void actionPerformed(ActionEvent e) 
			{
				card.show(contentPane, "panelPrincipal");
			}
		});
		
		botaoVoltar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		botaoVoltar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/back.png")));
		botaoVoltar.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(botaoVoltar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//######################################################
		//ADICIONANDO CARDLAYOUT PARA ALTERAR OS PANELS NA JANELA PRINCIPAL
		card = new CardLayout( 0, 0 );
		contentPane.setLayout(card);
		
		principal = new PrincipalFundo();
		login = new Logon();
		curso = new Curso();
		termo = new TermoDeCompromisso();
		concedente = new Concedente();
		estagiario = new Estagiario();
		
		contentPane.add(principal, "panelPrincipal");
		contentPane.add(login, "panelLogin");
		contentPane.add(curso, "panelCurso");
		contentPane.add(termo, "panelTermo");
		contentPane.add(concedente, "panelConcedente");
		contentPane.add(estagiario, "panelEstagiario");

	}
	//GETTERS E SETTERS
	public CardLayout getCard() {
		return card;
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

	public Logon getLogin() {
		return login;
	}

	public void setLogin(Logon login) {
		this.login = login;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public TermoDeCompromisso getTermo() {
		return termo;
	}

	public void setTermo(TermoDeCompromisso termo) {
		this.termo = termo;
	}

	public Concedente getConcedente() {
		return concedente;
	}

	public void setConcedente(Concedente concedente) {
		this.concedente = concedente;
	}

	public JMenu getMenuLogon() {
		return menuLogon;
	}

	public void setMenuLogon(JMenu menuLogon) {
		this.menuLogon = menuLogon;
	}

	public JMenu getMenuGerenciar() {
		return menuGerenciar;
	}

	public void setMenuGerenciar(JMenu menuGerenciar) {
		this.menuGerenciar = menuGerenciar;
	}

	public JMenuItem getItemAutenticar() {
		return itemAutenticar;
	}

	public void setItemAutenticar(JMenuItem itemAutenticar) {
		this.itemAutenticar = itemAutenticar;
	}

	public JMenuItem getItemSair() {
		return itemSair;
	}

	public void setItemSair(JMenuItem itemSair) {
		this.itemSair = itemSair;
	}

	public JMenuItem getItemEstagiario() {
		return itemEstagiario;
	}

	public void setItemEstagiario(JMenuItem itemEstagiario) {
		this.itemEstagiario = itemEstagiario;
	}

	public JMenuItem getItemCurso() {
		return itemCurso;
	}

	public void setItemCurso(JMenuItem itemCurso) {
		this.itemCurso = itemCurso;
	}

	public JMenuItem getItemConcedente() {
		return itemConcedente;
	}

	public void setItemConcedente(JMenuItem itemConcedente) {
		this.itemConcedente = itemConcedente;
	}

	public JMenuItem getItemTermo() {
		return itemTermo;
	}

	public void setItemTermo(JMenuItem itemTermo) {
		this.itemTermo = itemTermo;
	}
	
}

