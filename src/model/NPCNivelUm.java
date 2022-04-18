package model;

public class NPCNivelUm extends NPC {

	private int magia;

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	@Override
	public String toString() {
		return "NPCNivelUm [magia=" + magia + ", getId()=" + getId() + ", getArma()=" + getArma() + ", getEnergia()="
				+ getEnergia() + "]";
	}
	
	
}
