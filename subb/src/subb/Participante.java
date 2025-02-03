package subb;

public abstract class Participante {
	protected String nomeParticipante;
	protected String contatoParticipante;
	
	public Participante(String nomeParticipante, String contatoParticipante) {
		this.nomeParticipante = nomeParticipante;
		this.contatoParticipante = contatoParticipante;
	}

	public String getNomeParticipante() {
		return nomeParticipante;
	}

	public String getContatoParticipante() {
		return contatoParticipante;
	}

	
	
}
