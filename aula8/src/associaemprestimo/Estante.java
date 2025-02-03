package associaemprestimo;
import java.util.List;

public class Estante {
	private int numEstante;
	List<Livro> livros;
	
	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Estante() {
		
	}

	public int getNumEstante() {
		return numEstante;
	}

	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	@Override
	public String toString() {
		return "Estante [numEstante=" + numEstante + ", livros=" + livros + "]";
	}
	

}
