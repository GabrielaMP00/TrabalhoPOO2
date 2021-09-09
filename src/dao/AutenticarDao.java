package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.AutenticacaoUsuario;

public class AutenticarDao {
	
	// Autenticação do usuário através do jpanel Login
	public boolean autenticarUsuario(AutenticacaoUsuario usuario) {
		Connection connection = ConexaoMySQL.abrirConexaoMySQL();
		String queryAutenticacao = "select idUsuario from usuario where usuario=? and senha=?";
		
		try {
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(queryAutenticacao);
			preparedStatement.setString(1, usuario.getUsuario());
			preparedStatement.setString(2, usuario.getSenha());

			ResultSet rs = preparedStatement.executeQuery();
		    
			while(rs.next()){
				if(rs.getInt(1) > 0) {
					return true;
				}else {
					return false;
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
}