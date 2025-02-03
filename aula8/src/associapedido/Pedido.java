package associapedido;
import java.util.List;

public class Pedido {
	protected int numPedido;
	FormaPagto formaPagto;
	Cliente clientes;
	private List<ItemPedido> itens;

	public Pedido(int numPedido, FormaPagto formaPagto, Cliente clientes, List<ItemPedido> itens) {
		this.numPedido = numPedido;
		this.formaPagto = formaPagto;
		this.clientes = clientes;
		this.itens = itens;
	}

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}


}
