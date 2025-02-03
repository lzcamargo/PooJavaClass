package n2;

public class ProdutoNacional extends Produto implements ImpostoProduto {

	public ProdutoNacional(int codProduto, String descProduto, float precoProduto) {
		super(codProduto, descProduto, precoProduto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcImpostoProduto() {
		System.out.println("Preço deste produto com imposto: " + getPrecoProduto() * 1.08);

	}

}
