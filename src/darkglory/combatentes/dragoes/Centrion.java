/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes.dragoes;

import darkglory.combatentes.Dragoes;

/**
 *
 * @author victo
 */

public class Centrion extends Dragoes {

    public Centrion() {
        super(5, "Centrion", 21, 24, 2, "Agua", "Calda De Agua");
    }

    public Centrion(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
    
}
