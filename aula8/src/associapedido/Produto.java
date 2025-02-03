package associapedido;

public class Produto {
	protected double precoProduto;
	protected float qtdeEstoque;

	public Produto(double precoProduto, float qtdeEstoque) {
		this.precoProduto = precoProduto;
		this.qtdeEstoque = qtdeEstoque;

	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public float getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(float qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	 public String toString(){
	    return " Valor Item: " + this.precoProduto;
	  }


}
