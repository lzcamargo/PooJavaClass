package exerc1;

public abstract class Produto {
	protected float precoProduto;

	public Produto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

}
