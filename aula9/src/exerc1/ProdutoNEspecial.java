package exerc1;

public class ProdutoNEspecial extends Produto implements CalcProdutoNEspecial {

	public ProdutoNEspecial(float precoProduto) {
		super(precoProduto);
	}

	@Override
	public float calcularPrecoNEspecial() {
		return precoProduto  * 0.98f;
	}

	@Override
	public String toString() {
		return "ProdutoNEspecial [precoProduto= " + precoProduto + "]";
	}

	
}
