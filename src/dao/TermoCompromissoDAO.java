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
				+ " INNER JOIN curso c " + "ON c.idCurso = e.idCurso "+"WHERE e.cpf = ?";

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
			TermoModel termo = new TermoModel(nomeAluno, nomeAluno, nomeCurso, nomeOrientador, nomeUniversidade, nomeRepresentanteUniversidade);
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
		sql = "SELECT c.razaoSocial, c.representante" + " FROM concendente c" +" WHERE c.cnpj = ?";

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


	public boolean cadastrar(TermoModel termo) {
		PreparedStatement prepS = null;
		String sql;

		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();

		sql = "Insert into termodecompromisso values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, termo.getInicioEstagio());
			prepS.setString(2, termo.getFimFstagio());
			prepS.setString(3, termo.getChDiaria()); // 8
			prepS.setString(4, termo.getChSemanal()); //
			prepS.setString(5, termo.getAreEstagio());
			prepS.setString(6, termo.getHoraInicioAtividadesEstagio());
			prepS.setString(7, termo.getHoraFimAtividadesEstagio());
			prepS.setString(8, termo.getPrincipaisAtividades());
			prepS.setString(9, termo.getValorBolsa());
			prepS.setString(10, termo.getBeneficios());
			prepS.setString(11, termo.getCpfAluno());
			prepS.setString(12, termo.getCnpjConcedente());
			prepS.setString(13, termo.getNomeAluno());
			prepS.setString(14, termo.getNomeCurso());
			prepS.setString(15, termo.getNomeOrientador());
			prepS.setString(16, termo.getNomeUniversidade());
			prepS.setString(17, termo.getNomeRepresentanteUniversidade());
			prepS.setString(18, termo.getRazaSocialEmpresaConcedente());
			prepS.setString(19, termo.getNomeRepresentanteEmpresaConcedenteEstagio());
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

}
