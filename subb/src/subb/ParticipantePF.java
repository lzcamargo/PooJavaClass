package subb;

public class ParticipantePF extends Participante {
	private int idadeParticipante;
	private long cpfParticipante;
	

	public ParticipantePF(String nomeParticipante, String contatoParticipante, int idadeParticipante, long cpfParticipante) {
		super(nomeParticipante, contatoParticipante);
		this.cpfParticipante = cpfParticipante;
		this.idadeParticipante = idadeParticipante;
		
	}

	public int getIdadeParticipante() {
		return idadeParticipante;
	}

	public long getCpfParticipante() {
		return cpfParticipante;
	}
	
	

}
