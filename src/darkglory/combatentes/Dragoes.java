/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes;

/**
 *
 * @author victor
 */

public class Dragoes extends Classe{
	protected String equipamentos;
	private boolean efeito = false;
	private int contador = 1;


	public Dragoes(int id, String nome, int dano, int vida, int defesa, String tipo, String equipamentos) {
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
