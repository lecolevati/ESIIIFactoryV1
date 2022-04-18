package model;

public class NPCNivelTres extends NPC {

	private int replicacao;

	public int getReplicacao() {
		return replicacao;
	}

	public void setReplicacao(int replicacao) {
		this.replicacao = replicacao;
	}

	@Override
	public String toString() {
		return "NPCNivelTres [replicacao=" + replicacao + ", getId()=" + getId() + ", getArma()=" + getArma()
				+ ", getEnergia()=" + getEnergia() + "]";
	}
	
	
}
