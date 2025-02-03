package associaemprestimo;
import java.util.List;

public class Livro {
	private String tituloLivro;
	private int iSBNLivro;
	List<Capitulo> capitulos;
	
	
	public String getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}
	public int getiSBNLivro() {
		return iSBNLivro;
	}
	public void setiSBNLivro(int iSBNLivro) {
		this.iSBNLivro = iSBNLivro;
	}
	
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}
	@Override
	public String toString() {
		return "Livro [tituloLivro=" + tituloLivro + ", iSBNLivro=" + iSBNLivro + ", capitulos=" + capitulos + "]";
	}

	
	
}
