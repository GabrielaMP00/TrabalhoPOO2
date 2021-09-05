package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;

public class Deleta extends JPanel {
	private JButton btnExcluir;
	private JButton btnLimpar;
	private JButton btnVoltar;
	private JFormattedTextField textField_Excluir_Formulario;

	public Deleta() {
		setBackground(new Color(240, 248, 255));
		setLayout(new MigLayout("", "[25,grow][25,grow][][25,grow][25,grow][25,grow][25,grow][25,grow][][25,grow][25,grow][25,grow][25,grow][25,grow][25,grow][25,grow][25,grow][25,grow][25,grow][25,grow]", "[25,grow][25][25][25][15][25][25,grow][25,grow]"));
		
		JLabel lblTitulo = new JLabel("Deletar Formul\u00E1rio de Est\u00E1gio");
		lblTitulo.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 22));
		add(lblTitulo, "cell 2 1 15 2,alignx center,aligny center");
		
		JLabel lblDigiteOCPF = new JLabel("Digite o CPF do estudante que deseja excluir o Formul\u00E1rio de Est\u00E1gio: ");
		lblDigiteOCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblDigiteOCPF, "cell 1 3 17 1,alignx center,aligny center");
		
		textField_Excluir_Formulario = new JFormattedTextField();
		textField_Excluir_Formulario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(textField_Excluir_Formulario, "cell 4 5 12 1,growx");
		try {
			textField_Excluir_Formulario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon(Deleta.class.getResource("/icones_logos/trash.png")));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnExcluir, "cell 4 6 4 1,growx,aligny top");
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(Deleta.class.getResource("/icones_logos/broom.png")));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnLimpar, "cell 8 6 4 1,growx,aligny top");
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon(Deleta.class.getResource("/icones_logos/back.png")));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnVoltar, "cell 12 6 4 1,growx,aligny top");
	}

	public JButton getBtnExcluir() {
		return btnExcluir;
	}

	public void setBtnExcluir(JButton btnExcluir) {
		this.btnExcluir = btnExcluir;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

	public JFormattedTextField getTextField_Excluir_Formulario() {
		return textField_Excluir_Formulario;
	}

	public void setTextField_Excluir_Formulario(JFormattedTextField textField_Excluir_Formulario) {
		this.textField_Excluir_Formulario = textField_Excluir_Formulario;
	}
}
