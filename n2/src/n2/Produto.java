package n2;

public abstract class Produto {
	protected int codProduto;
	protected String descProduto;
	protected float precoProduto;
	
	public Produto(int codProduto, String descProduto, float precoProduto) {
		this.codProduto = codProduto;
		this.descProduto = descProduto;
		this.precoProduto = precoProduto;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}
	
	
	

}
