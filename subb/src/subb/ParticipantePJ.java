package subb;

public class ParticipantePJ extends Participante {
	private long cnpjParticipante;

	public ParticipantePJ(String nomeParticipante, String contatoParticipante, long cnpjParticipante) {
		super(nomeParticipante, contatoParticipante);
		this.cnpjParticipante = cnpjParticipante;
	}

	public long getCnpjParticipante() {
		return cnpjParticipante;
	}

}
