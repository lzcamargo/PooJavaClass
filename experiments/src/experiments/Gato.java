package experiments;

public class Gato extends Mamifero {
	private String nomeGato;

	public Gato(float cotaLeiteDiaria, String nomeGato) {
		super(cotaLeiteDiaria);
		this.nomeGato = nomeGato;
	}
	public float obterCotaLeite() {
		return cotaLeiteDiaria;
	}
	
}
