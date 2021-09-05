package visao;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class PrincipalFundo extends JPanel {
	
	public PrincipalFundo() {
		setLayout(new CardLayout(0, 0));
		setBackground(new Color(240, 250, 255));
		JLabel planoDeFundo = new JLabel("");
		planoDeFundo.setHorizontalAlignment(SwingConstants.CENTER);
		planoDeFundo.setIcon(new ImageIcon(PrincipalFundo.class.getResource("/icones_logos/fundo-transparente.png")));
		add(planoDeFundo, "name_55042083975000");

	}

}
