package n2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoNacCRUD {
	Connection conect = null;	
	
	public void connectionDB() {
		conect = ConectionMySQL.getConectionMySQL(); 
	}
	
	public void createProdutoNac(ProdutoNacional p) { 
		String sql = "insert into produto_nacional values (?,?,?)";
		try {
			PreparedStatement pst;
			pst = conect.prepareStatement(sql);
			pst.setInt(1, p.getCodProduto());
			pst.setString(2, p.getDescProduto()); 
			pst.setFloat(3, p.getPrecoProduto());
			pst.executeUpdate(); 
			System.out.println("Produto Nacional Cadastrado");
		} catch (SQLException ex) {
			System.out.println("Produto Nacional Nao Cadastrado " + ex);
		}
  }
	
	public void readProdutoNac() {
		String sql = "SELECT cod_produto, desc_produto, preco_produto FROM produto_nacional";
		try {
			PreparedStatement pst; 
			pst = conect.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				int codigo = rst.getInt("cod_produto");
				String nome = rst.getString(2);
				float preco = rst.getFloat(3);
				System.out.printf("Codigo Prtoduto: %d Descricao: %s Preço: %f \n",codigo, nome, preco);
			}
		} catch (SQLException se) {
			System.out.println("Erro ao Consultar Produto Nacional " + se);
		}
	}
	
	public void upadateProdutoNac(float precoProduto, String descProduto, int codProduto) {
		String sql = "UPDATE produto_nacional SET preco_produto = ?, desc_produto = ? WHERE cod_produto = ?";
		try {
			PreparedStatement pst;
			pst = conect.prepareStatement(sql);
			pst.setFloat(1, precoProduto);
			pst.setString(2, descProduto);
			pst.setInt(3, codProduto);
			int ret = pst.executeUpdate();
			
			if(ret > 0){
				System.out.println(String.format("Linhas afetadas %d", ret));
				System.out.printf("Registro alterado: %s %s",precoProduto, descProduto);
			}else{
				System.out.println("Não foi possível alterar o Registro de Produto Nacional");
			}
		}catch (SQLException se) {
			 System.out.println("Erro ao Atualizar Produto Nacional " + se);
		}
	}
	
	public void deleteProdutoNac(int codProduto) {
		String sql = "DELETE FROM produto_nacional WHERE cod_produto = ?"; 
		try {
			PreparedStatement pst;
			pst = conect.prepareStatement(sql);
			pst.setInt(1, codProduto);
			
			int ret = pst.executeUpdate();
			if(ret > 0){
				System.out.printf("Produto Excluido: %d: ",codProduto);
			}else{
				System.out.println("Não foi possível Excluir o Registro de Produto Nacional");
			}
		} catch (SQLException se) {
				System.out.println("Erro em Excluir Produto Nacional " + se);
		}
	}
	
	

}
