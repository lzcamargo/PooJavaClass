package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstudanteCRUD {
	Connection conect = null;	
	
	public void connectionDB() {
		conect = ConexaoMySQL.getConexaoMySQL(); 
	}
	
	public void createEstudante(Estudante e) { 
		String sql = "insert into estudante values (?,?,?)";
		try {
			PreparedStatement pst;
			pst = conect.prepareStatement(sql);
			pst.setInt(1, e.getMatrEstudante());
			pst.setString(2, e.getNomeEstudante()); 
			pst.setString(3, e.getCidadeEstudante());
			pst.executeUpdate(); 
			System.out.println("Estudante Cadastrado");
		} catch (SQLException ex) {
			System.out.println("Estudante Nao Cadastrado " + ex);
		}
  }
	
	public void readEstudante() {
		String sql = "SELECT matr_estudante, nome_estudante, cidade_estudante FROM estudante";
		try {
			PreparedStatement pst; 
			pst = conect.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				int codigo = rst.getInt("matr_estudante");
				String nome = rst.getString(2);
				String cidade = rst.getString(3);
				System.out.printf("Matricula Estudate: %d Nome: %s Cidade: %s \n",codigo, nome, cidade);
			}
		} catch (SQLException se) {
			System.out.println("Erro ao Consultar Estudante " + se);
		}
	}
	
	public void upadateEstudante(String nomeEstudante, String cidadeEstudante, int matrEstudante) {
		String sql = "UPDATE estudante SET nome_estudante = ?, cidade_estudante = ? WHERE matr_estudante = ?";
		try {
			PreparedStatement pst;
			pst = conect.prepareStatement(sql);
			pst.setString(1, nomeEstudante);
			pst.setString(2, cidadeEstudante);
			pst.setInt(3, matrEstudante);
			int ret = pst.executeUpdate();
			
			if(ret > 0){
				System.out.println(String.format("Linhas afetadas %d", ret));
				System.out.printf("Registro alterado: %s %s",nomeEstudante, cidadeEstudante);
			}else{
				System.out.println("Não foi possível alterar o Registro de Estudante");
			}
		}catch (SQLException se) {
			 System.out.println("Erro ao Atualizar Estudante " + se);
		}
	}
	public void deleteProduto(int matrEstudante) {
		String sql = "DELETE FROM estudante WHERE matr_estudante = ?"; 
		try {
			PreparedStatement pst;
			pst = conect.prepareStatement(sql);
			pst.setInt(1, matrEstudante);
			
			int ret = pst.executeUpdate();
			if(ret > 0){
				System.out.printf("Estudante Excluido: %d: ",matrEstudante);
			}else{
				System.out.println("Não foi possível Excluir o Registro de Estudante");
			}
		} catch (SQLException se) {
				System.out.println("Erro em Excluir Estudante " + se);
		}
	}
	
}	
	
	
