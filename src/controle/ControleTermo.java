package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import modelo.TermoModel;
import dao.TermoCompromissoDAO;
import visao.JanelaPrincipal;
import visao.TermoDeCompromisso;

public class ControleTermo implements ActionListener {
	
	private TermoDeCompromisso telaTermo;
	private TermoCompromissoDAO TermoCompromissoDAO;
	private TermoModel TermoModel;
	private JanelaPrincipal janelaPrincipal;
	

	public ControleTermo(TermoDeCompromisso telaTermo, TermoModel TermoModel, JanelaPrincipal janelaPrincipal) {
		super();
		this.telaTermo = telaTermo;
		this.TermoModel = TermoModel;
		
		this.telaTermo.getFormattedTextFieldCpfAluno().addActionListener(this);
		this.telaTermo.getFormattedTextFieldCnpjEmpresa().addActionListener(this);
		this.telaTermo.getBtnCadastrar().addActionListener(this);
		
		this.janelaPrincipal = janelaPrincipal;
		this.janelaPrincipal.getTermo().getBtnLimpar().addActionListener(this);

		TermoCompromissoDAO = new TermoCompromissoDAO();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		//limpa os campos da tela termo de compromisso
		if(e.getActionCommand().equals("Limpar")) {
			this.janelaPrincipal.getTermo().limparTermo();
		} 

		if(e.getSource() == telaTermo.getFormattedTextFieldCpfAluno()) {
			
			if(!TermoCompromissoDAO.comparaCPF(this.telaTermo.getFormattedTextFieldCpfAluno().getText()))
				JOptionPane.showMessageDialog(telaTermo, "CPF n√o cadastrado", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon("/icones_logos/refresh (1).png"));
		
			else{
				this.telaTermo.getTextFieldNomeAluno().setText(TermoModel.getNomeAluno());
				this.telaTermo.getTextFieldCurso().setText(TermoModel.getNomeCurso());
				this.telaTermo.getTextFieldOrientador().setText(TermoModel.getNomeOrientador());
				this.telaTermo.getTextFieldUniversidade().setText(TermoModel.getNomeUniversidade());
				this.telaTermo.getTextFieldRepresentanteUniversidade().setText(TermoModel.getNomeRepresentanteUniversidade());
			}
		}
		
		if(e.getSource() == this.telaTermo.getFormattedTextFieldCnpjEmpresa()) {
			
			
			if(!TermoCompromissoDAO.comparaCNPJ(this.telaTermo.getFormattedTextFieldCnpjEmpresa().getText()))
				JOptionPane.showMessageDialog(telaTermo, "CNPJ n√o cadastrado", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon("/icones_logos/refresh (1).png"));
			
			else{
				this.telaTermo.getTextFieldRazaoSocial().setText(TermoModel.getRazaSocialEmpresaConcedente());
				this.telaTermo.getTextFieldRepresentanteEmpresa().setText(TermoModel.getNomeRepresentanteEmpresaConcedenteEstagio());
			}
		}
		
		if(e.getActionCommand().equals("Cadastrar")) {
			
			if(   this.telaTermo.getTextFieldArea().getText().isEmpty()
				|| this.telaTermo.getTextFieldAtividades().getText().isEmpty()
				|| this.telaTermo.getTextFieldBeneficios().getText().isEmpty()
				|| this.telaTermo.getTextFieldChDiaria().getText().isEmpty()
				|| this.telaTermo.getTextFieldChSemanal().getText().isEmpty()
				|| this.telaTermo.getFormattedTextFieldCnpjEmpresa().getText().isEmpty()
				|| this.telaTermo.getFormattedTextFieldCpfAluno().getText().isEmpty()
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
				|| this.telaTermo.getFormattedTextFieldValor().getText().isEmpty()){
				
				JOptionPane.showMessageDialog(telaTermo, "Cadastro n„o efetuado, todos os campos precisam ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon("/icones_logos/refresh (1).png"));
			
			}else{
			
				
				TermoModel= new TermoModel();
				
				TermoModel.setAreEstagio(this.telaTermo.getTextFieldArea().getText());
				TermoModel.setPrincipaisAtividades( this.telaTermo.getTextFieldAtividades().getText());
				TermoModel.setBeneficios(this.telaTermo.getTextFieldBeneficios().getText());
				TermoModel.setChDiaria(Integer.parseInt(this.telaTermo.getTextFieldChDiaria().getText()));
				TermoModel.setChSemanal(Integer.parseInt(this.telaTermo.getTextFieldChSemanal().getText()));
				TermoModel.setCnpjConcedente(this.telaTermo.getFormattedTextFieldCnpjEmpresa().getText());
				TermoModel.setCpfAluno(this.telaTermo.getFormattedTextFieldCpfAluno().getText());
				TermoModel.setNomeCurso(this.telaTermo.getTextFieldCurso().getText());
				TermoModel.setFimFstagio(this.telaTermo.getFormattedTextFieldFim().getText());
				TermoModel.setHoraFimAtividadesEstagio(this.telaTermo.getFormattedTextFieldHorarioDeFim().getText());
				TermoModel.setHoraInicioAtividadesEstagio(this.telaTermo.getFormattedTextFieldHorarioDeInicio().getText());
				//TermoModel.set(this.telaTermo.getTextFieldInfoComplementares().getText());
				TermoModel.setInicioEstagio(this.telaTermo.getFormattedTextFieldInicio().getText());
				TermoModel.setNomeAluno(this.telaTermo.getTextFieldNomeAluno().getText());
				TermoModel.setNomeOrientador(this.telaTermo.getTextFieldOrientador().getText());
				TermoModel.setRazaSocialEmpresaConcedente(this.telaTermo.getTextFieldRazaoSocial().getText());
				TermoModel.setNomeRepresentanteEmpresaConcedenteEstagio(this.telaTermo.getTextFieldRepresentanteEmpresa().getText());
				TermoModel.setNomeRepresentanteUniversidade(this.telaTermo.getTextFieldRepresentanteUniversidade().getText());
				TermoModel.setNomeUniversidade(this.telaTermo.getTextFieldUniversidade().getText());
				TermoModel.setValorBolsa(Integer.parseInt(this.telaTermo.getFormattedTextFieldValor().getText()));
				
				
				TermoCompromissoDAO.cadastrar(TermoModel);
				JOptionPane.showMessageDialog(telaTermo, "Cadastro efetuado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(JanelaPrincipal.class.getResource("/icones_logos/check.png")));
			
			}
			
		}
	}
}
