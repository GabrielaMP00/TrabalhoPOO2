package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Menu extends JPanel {	
	private JButton btnCadastrar;
	private JButton btnAtualizar;
	private JButton btnExcluir;
	private JButton btnFecharAplicacao;

	public Menu() {
		setBackground(new Color(240, 248, 255));
		setLayout(new MigLayout("", "[25,grow][25,grow][25][25][25][25][][25][25,grow][25][25][25][25][][25][25,grow][25][25][25][25][][25][25,grow][][][][][][25,grow][25,grow]", "[25,grow][25][25][25][25][25][25][25][25][25][25][25][25][25][25][25,grow]"));
		
		JLabel lblTitulo = new JLabel("Painel de Administra\u00E7\u00E3o");
		lblTitulo.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 24));
		add(lblTitulo, "cell 3 2 25 2,alignx center,aligny top");
		
		JLabel lblImagemCadastro = new JLabel("");
		lblImagemCadastro.setIcon(new ImageIcon(Menu.class.getResource("/icones_logos/add-file.png")));
		add(lblImagemCadastro, "cell 2 5 6 6,alignx center,aligny center");
		
		JLabel lblImagemAtualiza = new JLabel("");
		lblImagemAtualiza.setIcon(new ImageIcon(Menu.class.getResource("/icones_logos/refresh.png")));
		add(lblImagemAtualiza, "cell 9 5 6 6,alignx center,aligny center");
		
		JLabel lblImagemExlui = new JLabel("");
		lblImagemExlui.setIcon(new ImageIcon(Menu.class.getResource("/icones_logos/delete.png")));
		add(lblImagemExlui, "cell 16 5 6 6,alignx center,aligny center");
		
		JLabel lblFechar = new JLabel("");
		lblFechar.setIcon(new ImageIcon(Menu.class.getResource("/icones_logos/fechar.png")));
		add(lblFechar, "cell 23 5 5 6,alignx center,aligny center");
		
		btnCadastrar = new JButton("Cadastrar Formul\u00E1rio");
		btnCadastrar.setForeground(Color.DARK_GRAY);
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(btnCadastrar, "cell 2 11 6 1,alignx center,aligny center");
		
		btnAtualizar = new JButton("Atualizar Formul\u00E1rio");
		btnAtualizar.setForeground(Color.DARK_GRAY);
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(btnAtualizar, "cell 9 11 6 1,alignx center,aligny center");
		
		btnExcluir = new JButton("Excluir Formul\u00E1rio");
		btnExcluir.setForeground(Color.DARK_GRAY);
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(btnExcluir, "cell 16 11 6 1,alignx center,aligny center");
		
		btnFecharAplicacao = new JButton("Fechar Aplica\u00E7\u00E3o");
		btnFecharAplicacao.setForeground(Color.DARK_GRAY);
		btnFecharAplicacao.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(btnFecharAplicacao, "cell 23 11 5 1,alignx center,aligny center");
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}

	public JButton getBtnExcluir() {
		return btnExcluir;
	}

	public void setBtnExcluir(JButton btnExcluir) {
		this.btnExcluir = btnExcluir;
	}

	public JButton getBtnFecharAplicacao() {
		return btnFecharAplicacao;
	}

	public void setBtnFecharAplicacao(JButton btnFecharAplicacao) {
		this.btnFecharAplicacao = btnFecharAplicacao;
	}
}
