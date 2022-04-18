package model;

public class NPCNivelDois extends NPC {

	private int autoCura;

	public int getAutoCura() {
		return autoCura;
	}

	public void setAutoCura(int autoCura) {
		this.autoCura = autoCura;
	}

	@Override
	public String toString() {
		return "NPCNivelDois [autoCura=" + autoCura + ", getId()=" + getId() + ", getArma()=" + getArma()
				+ ", getEnergia()=" + getEnergia() + "]";
	}
	
}
