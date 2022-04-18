package controller;

import model.NPC;
import model.NPCNivelDois;
import model.NPCNivelTres;
import model.NPCNivelUm;
import model.Personagem;

public class Batalha {

	public void inicioBatalha(Personagem p) {
		System.out.println("Batalha iniciada com NPC nível "+p.getNivel());
	}
	
	public NPC npcsBatalha(Personagem p) {
		if (p.getNivel() == 1) {
			NPCNivelUm	npc = new NPCNivelUm();
			int id = (int)((Math.random() * 1001) + 1000);
			npc.setId(id);
			npc.setArma("Espada");
			npc.setEnergia(100);
			npc.setMagia(10);
			return npc;
		} else if (p.getNivel() == 2) {
			NPCNivelDois npc = new NPCNivelDois();
			int id = (int)((Math.random() * 10001) + 10000);
			npc.setId(id);
			npc.setArma("Machado");
			npc.setEnergia(100);
			npc.setAutoCura(20);
			return npc;
		} 
		NPCNivelTres npc = new NPCNivelTres();
		int id = (int)((Math.random() * 100001) + 100000);
		npc.setId(id);
		npc.setArma("Adaga");
		npc.setEnergia(100);
		npc.setReplicacao(5);
		return npc;
	}
	
}
