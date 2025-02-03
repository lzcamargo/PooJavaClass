package exerc1;

public class Executora {

	public static void main(String[] args) {
		ProdutoEspecial prodEspecial = new ProdutoEspecial(20.00f);
		ProdutoNEspecial prodNEspecial = new ProdutoNEspecial(20.00f);
		
		System.out.println(prodEspecial + " " + prodNEspecial);
		
		System.out.println(prodEspecial.calcularPrecoEspecial() + " " + prodNEspecial.calcularPrecoNEspecial());

	}

}
