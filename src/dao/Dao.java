package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.AutenticacaoUsuario;
import modelo.FormularioEstagio;

public class Dao {
	
	// Autenticação do usuário através do jpanel Login
	public boolean autenticarUsuario(AutenticacaoUsuario usuario) {
		Connection connection = ConexaoMySQL.getConexao();
		String queryAutenticacao = "select usuario from usuario where usuario=? and senha=?";
		
		try {
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(queryAutenticacao);
			preparedStatement.setString(1, usuario.getUsuario());
			preparedStatement.setString(2, usuario.getSenha());

			ResultSet rs = preparedStatement.executeQuery();
		    
			while(rs.next()){
				if(rs.getString(1)==null) {
					return false;
				}else {
					return true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	// Método para cadatro de novo formulário através do jpanel Cadastro
	public void cadastraFormulario(FormularioEstagio formulario) {
		Connection connection = ConexaoMySQL.getConexao();
		String queryCadastro = "insert into formularioEstagio values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(queryCadastro);
			
			preparedStatement.setString(1, formulario.getApolice_Estagio());
			preparedStatement.setString(2, formulario.getAtuacao_Estagio());
			preparedStatement.setString(3, formulario.getBairro_Estudante());
			preparedStatement.setString(4, formulario.getCargoContratante_EmpresaContratante());
			preparedStatement.setString(5, formulario.getCargoOrientador_Estagio());
			preparedStatement.setString(6, formulario.getCEP_EmpresaContratante());
			preparedStatement.setString(7, formulario.getCEP_Estudante());
			preparedStatement.setString(8, formulario.getCidade_EmpresaContratante());
			preparedStatement.setString(9, formulario.getCidade_Estudante());
			preparedStatement.setString(10, formulario.getCNPJ_EmpresaContratante());
			preparedStatement.setString(11, formulario.getContratante_EmpresaContratante());
			preparedStatement.setString(12, formulario.getCPF_CoordenadorUFCSPA());
			preparedStatement.setString(13, formulario.getCPF_Estudante());
			preparedStatement.setString(14, formulario.getCPFContratante_EmpresaContratante());
			preparedStatement.setString(15, formulario.getEndereco_EmpresaContratante());
			preparedStatement.setString(16, formulario.getEndereco_Estudante());
			preparedStatement.setString(17, formulario.getInicio_Estagio());
			preparedStatement.setString(18, formulario.getMatricula_Estudante());
			preparedStatement.setString(19, formulario.getNascimento_Estudante());
			preparedStatement.setString(20, formulario.getNome_CoordenadorUFCSPA());
			preparedStatement.setString(21, formulario.getNome_EmpresaContratante());
			preparedStatement.setString(22, formulario.getNome_Estudante());
			preparedStatement.setString(23, formulario.getOrientadorResponsavel_Estagio());
			preparedStatement.setString(24, formulario.getProfessorResponsavel_Estagio());
			preparedStatement.setString(25, formulario.getRG_CoordenadorUFCSPA());
			preparedStatement.setString(26, formulario.getRG_Estudante());
			preparedStatement.setString(27, formulario.getRGContratante_EmpresaContratante());
			preparedStatement.setString(28, formulario.getSeguradora_Estagio());
			preparedStatement.setString(29, formulario.getSIAPE_Estagio());
			preparedStatement.setString(30, formulario.getTermino_Estagio());
			preparedStatement.setString(31, formulario.getTextPane_AtividadesRealizadas_Estagio());
			preparedStatement.setString(32, formulario.getComboBox_Cadastro_UF_EmpresaContratante());
			preparedStatement.setString(33, formulario.getComboBox_Cadastro_UF_Estudante());
			preparedStatement.setString(34, formulario.getComboBox_Curso_CoordenadorUFCSPA());
			preparedStatement.setString(35, formulario.getComboBox_Cadastro_Curso_Estudante());
			preparedStatement.setString(36, formulario.getCargaHoraria_Estagio());
			preparedStatement.setString(37, formulario.getSemestre_Estudante());
			preparedStatement.setString(38, formulario.getValorDaolsa_Estagio());
			preparedStatement.setString(39, formulario.getValorValeRefeicao_Estagio());
			preparedStatement.setString(40, formulario.getValorValeTransporte_Estagio());
			preparedStatement.setString(41, formulario.getEstagioObrigatorio());
			preparedStatement.setString(42, formulario.getValeRefeicao());	
			preparedStatement.setString(43, formulario.getValeTransporte());
			preparedStatement.setString(44, formulario.getSeguroAcidente());	
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Método de busca de formulário existente no banco de dados através do JPanel Busca_Atualiza
	public FormularioEstagio buscaFormulario(String buscarCPF) {
		FormularioEstagio formulario = new FormularioEstagio();
		Connection connection = ConexaoMySQL.getConexao();
		String queryBuscar = "select * from formularioEstagio where cpf_estudante = ?";
				
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(queryBuscar);
			preparedStatement.setString(1, buscarCPF);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				formulario.setApolice_Estagio(resultSet.getString(1));
				formulario.setAtuacao_Estagio(resultSet.getString(2));
				formulario.setBairro_Estudante(resultSet.getString(3));
				formulario.setCargoContratante_EmpresaContratante(resultSet.getString(4));
				formulario.setCargoOrientador_Estagio(resultSet.getString(5));
				formulario.setCEP_EmpresaContratante(resultSet.getString(6));
				formulario.setCEP_Estudante(resultSet.getString(7));
				formulario.setCidade_EmpresaContratante(resultSet.getString(8));
				formulario.setCidade_Estudante(resultSet.getString(9));
				formulario.setCNPJ_EmpresaContratante(resultSet.getString(10));
				formulario.setContratante_EmpresaContratante(resultSet.getString(11));
				formulario.setCPF_CoordenadorUFCSPA(resultSet.getString(12));
				formulario.setCPF_Estudante(resultSet.getString(13));
				formulario.setCPFContratante_EmpresaContratante(resultSet.getString(14));
				formulario.setEndereco_EmpresaContratante(resultSet.getString(15));
				formulario.setEndereco_Estudante(resultSet.getString(16));
				formulario.setInicio_Estagio(resultSet.getString(17));
				formulario.setMatricula_Estudante(resultSet.getString(18));
				formulario.setNascimento_Estudante(resultSet.getString(19));
				formulario.setNome_CoordenadorUFCSPA(resultSet.getString(20));
				formulario.setNome_EmpresaContratante(resultSet.getString(21));
				formulario.setNome_Estudante(resultSet.getString(22));
				formulario.setOrientadorResponsavel_Estagio(resultSet.getString(23));
				formulario.setProfessorResponsavel_Estagio(resultSet.getString(24));
				formulario.setRG_CoordenadorUFCSPA(resultSet.getString(25));
				formulario.setRG_Estudante(resultSet.getString(26));
				formulario.setRGContratante_EmpresaContratante(resultSet.getString(27));
				formulario.setSeguradora_Estagio(resultSet.getString(28));
				formulario.setSIAPE_Estagio(resultSet.getString(29));
				formulario.setTermino_Estagio(resultSet.getString(30));
				formulario.setTextPane_AtividadesRealizadas_Estagio(resultSet.getString(31));
				formulario.setComboBox_Cadastro_UF_EmpresaContratante(resultSet.getString(32));
				formulario.setComboBox_Cadastro_UF_Estudante(resultSet.getString(33));
				formulario.setCursoCoordenador(resultSet.getString(34));
				formulario.setCurdoEstudante(resultSet.getString(35));
				formulario.setCargaHoraria_Estagio(resultSet.getString(36));
				formulario.setSemestre_Estudante(resultSet.getString(37));
				formulario.setValorDaolsa_Estagio(resultSet.getString(38));
				formulario.setValorValeRefeicao_Estagio(resultSet.getString(39));
				formulario.setValorValeTransporte_Estagio(resultSet.getString(40));
				formulario.setEstagioObrigatorio(resultSet.getString(41));
				formulario.setValeRefeicao(resultSet.getString(42));
				formulario.setValeTransporte(resultSet.getString(43));
				formulario.setSeguroAcidente(resultSet.getString(44));
						
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return formulario;	
	}
	
	// Método para atualizar formulário existente no baco de dados através do JPanel Busca_Atualiza
	public void atualizaFormulario(String CPF_Estudante, FormularioEstagio formulario) {
		Connection connection = ConexaoMySQL.getConexao();
		String queryAtualizar = "update formularioEstagio set "
				+ "Apolice_estagio = ?,"
				+ "Atuacao_Estagio = ?,"
				+ "Bairro_Estudante = ?,"
				+ "CargoContratante_EmpresaContratante = ?,"
				+ "CargoOrientador_Estagio = ?,"
				+ "CEP_EmpresaContratante = ?,"
				+ "CEP_Estudante = ?,"
				+ "Cidade_EmpresaContratante = ?,"
				+ "Cidade_Estudante = ?,"
				+ "CNPJ_EmpresaContratante = ?,"
				+ "Contratante_EmpresaContratante = ?,"
				+ "CPF_CoordenadorUFCSPA = ?,"
				+ "CPF_Estudante = ?,"
				+ "CPFContratante_EmpresaContratante = ?,"
				+ "Endereco_EmpresaContratante = ?,"
				+ "Endereco_Estudante = ?,"
				+ "Inicio_Estagio = ?,"
				+ "Matricula_Estudante = ?,"
				+ "Nascimento_Estudante = ?,"
				+ "Nome_CoordenadorUFCSPA = ?,"
				+ "Nome_EmpresaContratante = ?,"
				+ "Nome_Estudante = ?,"
				+ "OrientadorResponsavel_Estagio = ?,"
				+ "ProfessorResponsavel_Estagio = ?,"
				+ "RG_CoordenadorUFCSPA = ?,"
				+ "RG_Estudante = ?,"
				+ "RGContratante_EmpresaContratante = ?,"
				+ "Seguradora_Estagio = ?,"
				+ "SIAPE_Estagio = ?,"
				+ "Termino_Estagio = ?,"
				+ "Atividades_Realizadas_Estagio = ?,"
				+ "UF_EmpresaContratante = ?,"
				+ "UF_Estudante = ?,"
				+ "CoordenadorUFCSPA = ?,"
				+ "Cadastro_Curso_Estudante = ?,"
				+ "CargaHoraria_Estagio = ?,"
				+ "Semetre_Estudante = ?,"
				+ "ValorDaBolsa_Estagio = ?,"
				+ "valorValeRefeicao_Estagio = ?,"
				+ "ValorValeTransporte_Estagio = ?,"
				+ "estagioObrigatorio = ?,"
				+ "ValeRefeicao = ?,"
				+ "ValeTransporte = ?,"
				+ "SeguroAcidente = ?"
				+ " WHERE CPF_Estudante = ?;";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(queryAtualizar);
			
			preparedStatement.setString(1, formulario.getApolice_Estagio());
			preparedStatement.setString(2, formulario.getAtuacao_Estagio());
			preparedStatement.setString(3, formulario.getBairro_Estudante());
			preparedStatement.setString(4, formulario.getCargoContratante_EmpresaContratante());
			preparedStatement.setString(5, formulario.getCargoOrientador_Estagio());
			preparedStatement.setString(6, formulario.getCEP_EmpresaContratante());
			preparedStatement.setString(7, formulario.getCEP_Estudante());
			preparedStatement.setString(8, formulario.getCidade_EmpresaContratante());
			preparedStatement.setString(9, formulario.getCidade_Estudante());
			preparedStatement.setString(10, formulario.getCNPJ_EmpresaContratante());
			preparedStatement.setString(11, formulario.getContratante_EmpresaContratante());
			preparedStatement.setString(12, formulario.getCPF_CoordenadorUFCSPA());
			preparedStatement.setString(13, CPF_Estudante);
			preparedStatement.setString(14, formulario.getCPFContratante_EmpresaContratante());
			preparedStatement.setString(15, formulario.getEndereco_EmpresaContratante());
			preparedStatement.setString(16, formulario.getEndereco_Estudante());
			preparedStatement.setString(17, formulario.getInicio_Estagio());
			preparedStatement.setString(18, formulario.getMatricula_Estudante());
			preparedStatement.setString(19, formulario.getNascimento_Estudante());
			preparedStatement.setString(20, formulario.getNome_CoordenadorUFCSPA());
			preparedStatement.setString(21, formulario.getNome_EmpresaContratante());
			preparedStatement.setString(22, formulario.getNome_Estudante());
			preparedStatement.setString(23, formulario.getOrientadorResponsavel_Estagio());
			preparedStatement.setString(24, formulario.getProfessorResponsavel_Estagio());
			preparedStatement.setString(25, formulario.getRG_CoordenadorUFCSPA());
			preparedStatement.setString(26, formulario.getRG_Estudante());
			preparedStatement.setString(27, formulario.getRGContratante_EmpresaContratante());
			preparedStatement.setString(28, formulario.getSeguradora_Estagio());
			preparedStatement.setString(29, formulario.getSIAPE_Estagio());
			preparedStatement.setString(30, formulario.getTermino_Estagio());
			preparedStatement.setString(31, formulario.getTextPane_AtividadesRealizadas_Estagio());
			preparedStatement.setString(32, formulario.getComboBox_Cadastro_UF_EmpresaContratante());
			preparedStatement.setString(33, formulario.getComboBox_Cadastro_UF_Estudante());
			preparedStatement.setString(34, formulario.getComboBox_Curso_CoordenadorUFCSPA());
			preparedStatement.setString(35, formulario.getComboBox_Cadastro_Curso_Estudante());
			preparedStatement.setString(36, formulario.getCargaHoraria_Estagio());
			preparedStatement.setString(37, formulario.getSemestre_Estudante());
			preparedStatement.setString(38, formulario.getValorDaolsa_Estagio());
			preparedStatement.setString(39, formulario.getValorValeRefeicao_Estagio());
			preparedStatement.setString(40, formulario.getValorValeTransporte_Estagio());
			preparedStatement.setString(41, formulario.getEstagioObrigatorio());
			preparedStatement.setString(42, formulario.getValeRefeicao());	
			preparedStatement.setString(43, formulario.getValeTransporte());
			preparedStatement.setString(44, formulario.getSeguroAcidente());
			preparedStatement.setString(45, CPF_Estudante);
		
			preparedStatement.executeUpdate();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Método para excluir formulário de estágio existente no banco de dados através do JPanel Deleta
	public void excluirFormulario(String CPF_Estudante){
		Connection connection = ConexaoMySQL.getConexao();
		String queryExcluir = "delete from formularioEstagio where cpf_estudante = ?"; 
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(queryExcluir);
			
			preparedStatement.setString(1, CPF_Estudante);
			preparedStatement.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}