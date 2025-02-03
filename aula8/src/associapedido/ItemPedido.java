package associapedido;

public class ItemPedido {
	protected float qtdeItem;
	Produto produtos;
	
	public ItemPedido(float qtdeItem, Produto produtos) {
		this.qtdeItem = qtdeItem;
		this.produtos = produtos;
		
	}

	public float getQtdeItem() {
		return qtdeItem;
	}

	public void setQtdeItem(float qtdeItem) {
		this.qtdeItem = qtdeItem;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}
	
	 public String toString(){
	    return " Quantidade: " + this.qtdeItem + " Valor Item: " + this.produtos;
	  }


}
