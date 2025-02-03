package associaemprestimo;

public class Estudante {
	private String nomeEstudante;
	private int matrEstudante;
	
	
	public String getNomeEstudante() {
		return nomeEstudante;
	}
	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}
	public int getMatrEstudante() {
		return matrEstudante;
	}
	public void setMatrEstudante(int matrEstudante) {
		this.matrEstudante = matrEstudante;
	}
	@Override
	public String toString() {
		return "Estudante [nomeEstudante=" + nomeEstudante + ", matrEstudante=" + matrEstudante + "]";
	}
	
	

}
