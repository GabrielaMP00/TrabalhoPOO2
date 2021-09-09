package dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Estagiario;
import modelo.TermoModel;

public class TermoCompromissoDAO {

	private Connection con;

	public TermoCompromissoDAO() {

	}

	public TermoModel consultaCurso(String cpf) {
		PreparedStatement prepS = null;
		String nomeAluno = null;
		String nomeCurso = null;
		String nomeOrientador = null;
		String nomeUniversidade = null;
		String nomeRepresentanteUniversidade = null;
		ResultSet res;
		String sql;

		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		sql = "SELECT e.nome, c.curso, c.orientador, c.universidade, c.representante " + "FROM estagiario e"
				+ " INNER JOIN curso c " + "ON c.idCurso = e.idCurso " + "WHERE e.cpf = ?";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, cpf);
			res = prepS.executeQuery();

			while (res.next()) {
				nomeAluno = res.getString(1);
				nomeCurso = res.getString(2);
				nomeOrientador = res.getString(3);
				nomeUniversidade = res.getString(4);
				nomeRepresentanteUniversidade = res.getString(5);
			}
			TermoModel termo = new TermoModel(nomeAluno, nomeAluno, nomeCurso, nomeOrientador, nomeUniversidade,
					nomeRepresentanteUniversidade);
			ConexaoMySQL.fecharConexao();
			return termo;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			ConexaoMySQL.fecharConexao();
			return null;
		}
	}

	public TermoModel consultaConcendente(String cnpj) {

		PreparedStatement prepS = null;
		String razaoSocial = null;
		String nomeRepresentanteEmpresa = null;
		ResultSet res;
		String sql;

		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		sql = "SELECT c.razaoSocial, c.representante" + " FROM concendente c" + " WHERE c.cnpj = ?";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, cnpj);
			res = prepS.executeQuery();

			while (res.next()) {
				razaoSocial = res.getString(1);
				nomeRepresentanteEmpresa = res.getString(2);
			}
			TermoModel termo = new TermoModel(razaoSocial, nomeRepresentanteEmpresa);
			ConexaoMySQL.fecharConexao();
			return termo;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			ConexaoMySQL.fecharConexao();
			return null;
		}
	}

	public boolean cadastrar(TermoModel termo) throws Exception {
		PreparedStatement prepS = null;
		String sql;

		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();

		sql = "Insert into termodecompromisso (idCurso,idEstagiario,idConcendente,dataInicio,"
				+ "dataFim,horarioFim,horarioInicio,chSemanal,chDiaria,beneficios,area,atividades,infoComplementar) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setInt(1, getCursoIdByCPF(termo.getCpfAluno()));
			prepS.setInt(2, getAlunoIdByCPF(termo.getCpfAluno()));
			prepS.setInt(3, getConcendenteIdByCNPJ(termo.getCnpjConcedente()));
			prepS.setString(4, termo.getInicioEstagio());
			prepS.setString(5, termo.getFimFstagio());
			prepS.setString(6, termo.getHoraFimAtividadesEstagio());
			prepS.setString(7, termo.getHoraInicioAtividadesEstagio());
			prepS.setString(8, termo.getChSemanal());
			prepS.setString(9, termo.getChDiaria());
			prepS.setString(10, termo.getBeneficios());
			prepS.setString(11, termo.getAreEstagio());	
			prepS.setString(12, termo.getPrincipaisAtividades());
			prepS.setString(13, "");	
			prepS.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			ConexaoMySQL.fecharConexao();
			return false;
		}
		ConexaoMySQL.fecharConexao();
		return true;
	}

	public boolean comparaCPF(String c) {
		PreparedStatement prepS = null;
		String cpf = null;
		ResultSet res;
		String sql;
		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		sql = "Select * from Estagiario where cpf like ?";
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, c);
			res = prepS.executeQuery();
			if (res.next()) {
				ConexaoMySQL.fecharConexao();
				return true;
			}

			else {
				ConexaoMySQL.fecharConexao();
				return false;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
	}

	public boolean comparaCNPJ(String c) {
		PreparedStatement prepS = null;
		String cnpj = null;
		ResultSet res;
		String sql;
		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		sql = "Select * from concendente where cnpj like ?";
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, c);
			res = prepS.executeQuery();
			if (res.next()) {
				ConexaoMySQL.fecharConexao();
				return true;
			}

			else {
				ConexaoMySQL.fecharConexao();
				return false;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}

	}

	public int getCursoIdByCPF(String cpf) throws Exception {
		PreparedStatement prepS = null;
		String cnpj = null;
		ResultSet res;
		String sql;
		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		sql = "SELECT c.idCurso " + "FROM estagiario e" + " INNER JOIN curso c " + "ON c.idCurso = e.idCurso "
				+ "WHERE e.cpf = ?";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, cpf);
			res = prepS.executeQuery();
			if (res.next()) {
				return res.getInt(1);
			}

			else {
				
				throw new Exception();
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ConexaoMySQL.fecharConexao();
		return 0;

	}

	public int getAlunoIdByCPF(String cpf) throws Exception {
		PreparedStatement prepS = null;
		String cnpj = null;
		ResultSet res;
		String sql;
		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		sql = "SELECT e.idEstagiario " + "FROM estagiario e" + " INNER JOIN curso c " + "ON c.idCurso = e.idCurso "
				+ "WHERE e.cpf = ?";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, cpf);
			res = prepS.executeQuery();
			if (res.next()) {
				return res.getInt(1);
			}

			else {
				
				throw new Exception();
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ConexaoMySQL.fecharConexao();

		return 0;
	}

	public int getConcendenteIdByCNPJ(String cnpj) throws Exception {
		PreparedStatement prepS = null;

		ResultSet res;
		String sql;
		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		sql = "SELECT c.idConcendente " + "FROM concendente c" + " WHERE c.cnpj = ?";
		int result = 0;
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, cnpj);
			res = prepS.executeQuery();
			if (res.next()) {
				result = res.getInt(1);
				ConexaoMySQL.fecharConexao();
				return result;
			}

			else {
				ConexaoMySQL.fecharConexao();
				throw new Exception();
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return 0;

	}

}
