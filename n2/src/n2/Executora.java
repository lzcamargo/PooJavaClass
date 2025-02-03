package n2;

import java.util.Scanner;

public class Executora {
	
	static Scanner entrDados = new Scanner(System.in);
	static int codProd;
	static String descProd;
	static float precoProd;
	static int op;
	static Character crud;
	static String opcao = "sim", opcao2 = "sim";
	
	public static void main(String[] args) {
		ProdutoNacCRUD prdNacCRUD = new ProdutoNacCRUD();
		prdNacCRUD.connectionDB();
		ProdutoImpCrud prdImpCRUD = new ProdutoImpCrud();
		prdImpCRUD.connectionDB();

		while(opcao.equals(opcao2)) {
				opcaoProduto();
				operaCrud();
				if (op == 1) {
					switch (crud) {
					case 'c': 
						dadosProduto();
						ProdutoImportado prdImp = new ProdutoImportado(codProd,descProd,precoProd); 
						prdImpCRUD.createProdutoImp(prdImp);
						prdImp.calcImpostoProduto();
						break;
					case 'r':
						prdImpCRUD.readProdutoImp();
						break;
					case 'u':
						dadosProduto();
						prdImpCRUD.upadateProdutoImp((precoProd * 1.15f), descProd, codProd);
						break;
					case 'd':
						deleteProduto();
						prdImpCRUD.deleteProdutoImp(codProd);
								
					default:
						System.out.println("Operação CRUD " + crud + " inválida");
					}
					
				} 
				else if (op == 2) {
					switch (crud) {
					case 'c': 
						dadosProduto();
						ProdutoNacional prdNac = new ProdutoNacional(codProd,descProd,precoProd); 
						prdNacCRUD.createProdutoNac(prdNac);
						prdNac.calcImpostoProduto();
						break;
					case 'r':
						prdNacCRUD.readProdutoNac();
						break;	
					case 'u':
						dadosProduto();
						prdNacCRUD.upadateProdutoNac(precoProd * 1.08f, descProd, codProd);
						break;
					case 'd':
						deleteProduto();
						prdNacCRUD.deleteProdutoNac(codProd);	
					default:
						System.out.println("Operação CRUD " + crud + "inválida");
				
				 }
			}	
				
			System.out.println("Deseja continuar (sim/não)");
			entrDados.nextLine();
		  opcao2 = entrDados.nextLine();
			
		}
	}
	
	public static void dadosProduto() {
		 System.out.println("Informe o código Produto:");
		 codProd = entrDados.nextInt();
		 entrDados.nextLine();
		 System.out.println("Informe a descrição Produto:");
		 descProd = entrDados.nextLine();
		 System.out.println("Informe o preço Produto:");
		 precoProd = entrDados.nextFloat();
	}
	
	public static int deleteProduto() {
		 System.out.println("Informe o código Produto para Exclusão: ");
		 return codProd = entrDados.nextInt();
	}

	public static int opcaoProduto() {
		 System.out.println("## Escolha uma das opções ##");
     System.out.println("Opção 1 - Habilita Operações CRUD Produto Importado ");
     System.out.println("Opção 2 - Habilita Operações CRUD Produto Nacional ");
		 return op = entrDados.nextInt();
	}
	
	public static char operaCrud() {
		System.out.println("Informe c para Cadastrar Produto ");
		System.out.println("Informe r para Ler Produtos Cadastrados ");
		System.out.println("Informe u para Alterar Produto Cadastrado ");
		System.out.println("Informe d para Excluir Produto Cadastrado ");
		return crud = entrDados.next().charAt(0);
	}
	
	
}
