package demonstracao;

public class Quadro implements FiguraGeometrica {
	private float lado;
	
	
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public void nomeFigura() {
		System.out.println("Quadrado");
		
	};
	public void calcularArea() {
		System.out.println("Area do Quadrado " + getLado() * getLado());
	}
	public void calcularPerimetro() {
		System.out.println("Perimetro do Quadrado " + getLado() * 4);
	}

}
