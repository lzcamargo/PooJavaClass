package associapedido;
import java.util.List;
import java.util.ArrayList;

public class ClasseExecutora {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Asdrubal");
		 
		 Produto p1 = new Produto(100.51, 25.00f);
		 Produto p2 = new Produto(54.40, 23.5f);
		 
		 ItemPedido ip1 = new ItemPedido(2.0f,p1);
		 ItemPedido ip2 = new ItemPedido(1.0f, p2);
		 
		 List<ItemPedido> it = new ArrayList<ItemPedido>();
		 it.add(ip1);
		 it.add(ip2);
		 
		 Pedido pd1 = new Pedido(001,FormaPagto.DINHEIRO,c1,it);
		 
		 System.out.println("Cliente: " + c1.getNomeCliente());
		 
		 System.out.println(pd1.getNumPedido());
		
		 System.out.println(FormaPagto.DINHEIRO);
		 System.out.println(ip1.getQtdeItem());
		 System.out.println(p1.getPrecoProduto());
		 System.out.println(ip2.getQtdeItem());
		 System.out.println(p2.getPrecoProduto());
		 
		 for(ItemPedido i : it) {
		    System.out.println(i);
		}

	}

}
