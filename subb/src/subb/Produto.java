package subb;

public class Produto {
	private String nomeProduto;
	private String descProduto;
	private float vlrLanceMinimo;
	
	public Produto(String nomeProduto, String descProduto, float vlrLanceMinimo) {
		this.nomeProduto = nomeProduto;
		this.descProduto = descProduto;
		this.vlrLanceMinimo = vlrLanceMinimo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public float getVlrLanceMinimo() {
		return vlrLanceMinimo;
	}
	
	

}
