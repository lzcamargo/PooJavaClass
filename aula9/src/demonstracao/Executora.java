package demonstracao;

public class Executora {

	public static void main(String[] args) {
		Quadro quadro = new Quadro();
		quadro.setLado(5);
		Circulo circulo = new Circulo();
		circulo.setRaio(4);
		
		System.out.println(" Quadrado ....\n");
		quadro.nomeFigura();
		quadro.calcularArea();
		quadro.calcularPerimetro();
		
		System.out.println(" Círculo ....\n");
		circulo.nomeFigura();
		circulo.calcularArea();
		circulo.calcularPerimetro();
		
	}

}
