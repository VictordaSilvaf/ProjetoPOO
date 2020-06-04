/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes.deuses;

import darkglory.combatentes.Deuses;

/**
 *
 * @author victo
 */
public class Posseidon extends Deuses{
    public Posseidon() {
        super(3, "Poseidon, deus dos mares", 30, 26, 20, "Fogo", "Raio de Zeus");
    }

    public Posseidon(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}