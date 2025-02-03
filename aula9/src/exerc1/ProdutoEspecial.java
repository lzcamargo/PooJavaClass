package exerc1;

public class ProdutoEspecial extends Produto implements CalcProdutoEspecial {

	public ProdutoEspecial(float precoProduto) {
		super(precoProduto);
		
	}

	@Override
	public float calcularPrecoEspecial() {
		return precoProduto  * 1.08f;
	}

	@Override
	public String toString() {
		return "ProdutoEspecial [precoProduto= " + precoProduto + "]";
	}

	
}
