/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.Combatentes;

import darkglory.combatentes.Classe;

/**
 *
 * @author victo
 */
public class Orcs extends Classe{
	protected String equipamentos;
	private boolean efeito = false;
	private int contador = 1;


	public Orcs(int id, String nome, int dano, int vida, int defesa, String tipo, String equipamentos) {
		super(id, nome, vida, dano, defesa, tipo);
		this.equipamentos = equipamentos;
	}

	public String getEquipameto() {
		return equipamentos;
	}

	public void setEquipamento(String equipamentos) {
		this.equipamentos = equipamentos;
	}
	
}
