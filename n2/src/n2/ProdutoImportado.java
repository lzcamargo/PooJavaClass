package n2;

public class ProdutoImportado extends Produto implements ImpostoProduto {

	public ProdutoImportado(int codProduto, String descProduto, float precoProduto) {
		super(codProduto, descProduto, precoProduto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcImpostoProduto() {
		System.out.println("Preço deste produto com imposto: " + getPrecoProduto() * 1.15);

	}

}
