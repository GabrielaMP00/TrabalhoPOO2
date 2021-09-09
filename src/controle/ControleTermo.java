package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import modelo.TermoModel;
import dao.TermoCompromissoDAO;
import visao.JanelaPrincipal;
import visao.TermoDeCompromisso;

public class ControleTermo implements ActionListener, KeyListener{

	private TermoDeCompromisso telaTermo;
	private TermoCompromissoDAO TermoCompromissoDAO;
	private TermoModel TermoModel;
	private JanelaPrincipal janelaPrincipal;

	public ControleTermo(TermoDeCompromisso telaTermo, TermoModel TermoModel, JanelaPrincipal janelaPrincipal) {
		super();
		this.telaTermo = janelaPrincipal.getTermo();
		this.TermoModel = TermoModel;
		this.janelaPrincipal = janelaPrincipal;
		
		this.janelaPrincipal.getTermo().getTextFieldCnpjEmpresa().addKeyListener(this);
		this.janelaPrincipal.getTermo().getTextFieldCpfAluno().addKeyListener(this);
		this.janelaPrincipal.getTermo().getBtnCadastrar().addActionListener(this);
		this.janelaPrincipal.getTermo().getBtnLimpar().addActionListener(this);
		
		

		TermoCompromissoDAO = new TermoCompromissoDAO();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// limpa os campos da tela termo de compromisso
		if (e.getActionCommand().equals("Limpar")) {
			this.janelaPrincipal.getTermo().limparTermo();
		}

		
		if (e.getActionCommand().equals("Cadastrar")) {
			if (this.telaTermo.getTextFieldArea().getText().isEmpty()
					|| this.telaTermo.getTextFieldAtividades().getText().isEmpty()
					|| this.telaTermo.getTextFieldBeneficios().getText().isEmpty()
					|| this.telaTermo.getTextFieldChDiaria().getText().isEmpty()
					|| this.telaTermo.getTextFieldChSemanal().getText().isEmpty()
					|| this.telaTermo.getTextFieldCnpjEmpresa().getText().isEmpty()
					|| this.telaTermo.getTextFieldCpfAluno().getText().isEmpty()
					|| this.telaTermo.getTextFieldCurso().getText().isEmpty()
					|| this.telaTermo.getFormattedTextFieldFim().getText().isEmpty()
					|| this.telaTermo.getFormattedTextFieldHorarioDeFim().getText().isEmpty()
					|| this.telaTermo.getFormattedTextFieldHorarioDeInicio().getText().isEmpty()
					|| this.telaTermo.getTextFieldInfoComplementares().getText().isEmpty()
					|| this.telaTermo.getFormattedTextFieldInicio().getText().isEmpty()
					|| this.telaTermo.getTextFieldNomeAluno().getText().isEmpty()
					|| this.telaTermo.getTextFieldOrientador().getText().isEmpty()
					|| this.telaTermo.getTextFieldRazaoSocial().getText().isEmpty()
					|| this.telaTermo.getTextFieldRepresentanteEmpresa().getText().isEmpty()
					|| this.telaTermo.getTextFieldRepresentanteUniversidade().getText().isEmpty()
					|| this.telaTermo.getTextFieldUniversidade().getText().isEmpty()
					|| this.telaTermo.getFormattedTextFieldValor().getText().isEmpty()) {

				JOptionPane.showMessageDialog(telaTermo, "Cadastro n„o efetuado, todos os campos precisam ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));

			} else {

				int cd = Integer.parseInt(telaTermo.getTextFieldChDiaria().getText());
				int cs = Integer.parseInt(telaTermo.getTextFieldChSemanal().getText());

				if (cd > 6)
					JOptionPane.showMessageDialog(telaTermo, "Carga hor·ria di·ria excedeu limite m·ximo de 6 horas!", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));

				else if (cs > 30)
					JOptionPane.showMessageDialog(telaTermo, "Carga hor·ria semanal excedeu limite m·ximo de 30 horas!", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));

				else {

					TermoModel = new TermoModel();

					TermoModel.setAreEstagio(this.telaTermo.getTextFieldArea().getText());
					TermoModel.setPrincipaisAtividades(this.telaTermo.getTextFieldAtividades().getText());
					TermoModel.setBeneficios(this.telaTermo.getTextFieldBeneficios().getText());
					TermoModel.setChDiaria(this.telaTermo.getTextFieldChDiaria().getText());
					TermoModel.setChSemanal(this.telaTermo.getTextFieldChSemanal().getText());
					TermoModel.setCnpjConcedente(this.telaTermo.getTextFieldCnpjEmpresa().getText());
					TermoModel.setCpfAluno(this.telaTermo.getTextFieldCpfAluno().getText());
					TermoModel.setNomeCurso(this.telaTermo.getTextFieldCurso().getText());
					TermoModel.setFimFstagio(this.telaTermo.getFormattedTextFieldFim().getText());
					TermoModel.setHoraFimAtividadesEstagio(this.telaTermo.getFormattedTextFieldHorarioDeFim().getText());
					TermoModel.setHoraInicioAtividadesEstagio(this.telaTermo.getFormattedTextFieldHorarioDeInicio().getText());
					// TermoModel.set(this.telaTermo.getTextFieldInfoComplementares().getText());
					TermoModel.setInicioEstagio(this.telaTermo.getFormattedTextFieldInicio().getText());
					TermoModel.setNomeAluno(this.telaTermo.getTextFieldNomeAluno().getText());
					TermoModel.setNomeOrientador(this.telaTermo.getTextFieldOrientador().getText());
					TermoModel.setRazaSocialEmpresaConcedente(this.telaTermo.getTextFieldRazaoSocial().getText());
					TermoModel.setNomeRepresentanteEmpresaConcedenteEstagio(this.telaTermo.getTextFieldRepresentanteEmpresa().getText());
					TermoModel.setNomeRepresentanteUniversidade(this.telaTermo.getTextFieldRepresentanteUniversidade().getText());
					TermoModel.setNomeUniversidade(this.telaTermo.getTextFieldUniversidade().getText());
					TermoModel.setValorBolsa(this.telaTermo.getFormattedTextFieldValor().getText());

					TermoCompromissoDAO.cadastrar(TermoModel);
					
					JOptionPane.showMessageDialog(telaTermo, "Cadastro efetuado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/check.png")));
				}
			}

		}
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER && this.janelaPrincipal.getTermo().getTextFieldCpfAluno().isFocusOwner()) {
			if (!TermoCompromissoDAO.comparaCPF(this.janelaPrincipal.getTermo().getTextFieldCpfAluno().getText()))
				
				JOptionPane.showMessageDialog(telaTermo, "CPF n√o cadastrado", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));

			else {
				TermoModel curso = TermoCompromissoDAO.consultaCurso(this.janelaPrincipal.getTermo().getTextFieldCpfAluno().getText());
				
				this.janelaPrincipal.getTermo().getTextFieldNomeAluno().setText(curso.getNomeAluno());
				this.janelaPrincipal.getTermo().getTextFieldCurso().setText(curso.getNomeCurso());
				this.janelaPrincipal.getTermo().getTextFieldOrientador().setText(curso.getNomeOrientador());
				this.janelaPrincipal.getTermo().getTextFieldUniversidade().setText(curso.getNomeUniversidade());
				this.janelaPrincipal.getTermo().getTextFieldRepresentanteUniversidade().setText(curso.getNomeRepresentanteUniversidade());
			}
		}
		
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER && this.janelaPrincipal.getTermo().getTextFieldCnpjEmpresa().isFocusOwner()){
			
			if (!TermoCompromissoDAO.comparaCNPJ(this.janelaPrincipal.getTermo().getTextFieldCnpjEmpresa().getText()))
				
				JOptionPane.showMessageDialog(telaTermo, "CNPJ n√o cadastrado", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/close.png")));

			else {
				TermoModel empresa = TermoCompromissoDAO.consultaConcendente(this.janelaPrincipal.getTermo().getTextFieldCnpjEmpresa().getText());
				
				this.janelaPrincipal.getTermo().getTextFieldRazaoSocial().setText(empresa.getRazaSocialEmpresaConcedente());
				this.janelaPrincipal.getTermo().getTextFieldRepresentanteEmpresa().setText(empresa.getNomeRepresentanteEmpresaConcedenteEstagio());
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
