package model;

public class NPC {

	private int id;
	private String arma;
	private int energia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	@Override
	public String toString() {
		return "NPCNivelUm [id=" + id + ", arma=" + arma + ", energia=" + energia + "]";
	}
	
}
