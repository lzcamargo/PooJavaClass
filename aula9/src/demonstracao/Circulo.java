package demonstracao;

public class Circulo implements FiguraGeometrica {
	private float raio;

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

		
	@Override
	public void nomeFigura() {
		System.out.println("Circulo");
		
	}

	@Override
	public void calcularArea() {
		System.out.println("Area Circulo: " + (FiguraGeometrica.PI * (getRaio()*getRaio())));
	}

	@Override
	public void calcularPerimetro() {
		System.out.println("Perimetro Circulo: " + 2 * FiguraGeometrica.PI * getRaio());
		
	}
	
}
