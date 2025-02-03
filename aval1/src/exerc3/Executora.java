package exerc3;

public class Executora {

	public static void main(String[] args) {
		EstudanteArr estudanteArr = new EstudanteArr(122, "Jose", new float[]{5.0f, 5.0f, 2.0f,2.0f});
		
		System.out.println("Matr.: " + estudanteArr.getMatrEstudante());
		System.out.println("Nome : " + estudanteArr.getNomeEstudante());
		System.out.println("Média: " + estudanteArr.calcularMedia());
		System.out.println("Situação: " + estudanteArr.situacaoEstudante());
	
	}

}
