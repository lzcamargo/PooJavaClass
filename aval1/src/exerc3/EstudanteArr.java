package exerc3;

public class EstudanteArr {
	private int matrEstudante;
	private String nomeEstudante;
	private float[] notasEstudante;

	
	public EstudanteArr(int matrEstudante, String nomeEstudante, float[] notasEstudante) {
		this.matrEstudante = matrEstudante;
		this.nomeEstudante = nomeEstudante;
		this.notasEstudante = notasEstudante;
	}

	public int getMatrEstudante() {
		return matrEstudante;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public float[] getNotasEstudante() {
		return notasEstudante;
	}
	
	public float calcularMedia() {
		float somaNotas = 0.0f;
		for (int i = 0; i < getNotasEstudante().length; i++) {
			somaNotas += notasEstudante[i];
		}
		return somaNotas/getNotasEstudante().length;
	
	}
	
	public String situacaoEstudante() {
		if(calcularMedia() >= 6.0) {
			return "Aprovado!";
		}
		else if ((calcularMedia() < 6.0 && calcularMedia() >= 4.0)) {
			return "Exame!";
		}
		else {
			return "Refazer a Disciplina!";
		}
	}
	
	

}
