package quest2;

public class ClasseExecutora {

	public static void main(String[] args) {
		Produto produto = new Produto("Batata Inglesa", 34, 10.0f, false);
		
		System.out.println(produto);
		
		//atribuir preço conforme regra
		
	//	produto.alterarPrecoInativo();
		produto.alterarGeral();
		
		//produto.setQtdEstoqueProduto(0);
		
		System.out.println(produto);

	}

}
