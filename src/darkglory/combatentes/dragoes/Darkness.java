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

public class Darkness extends Dragoes {

    public Darkness() {
        super(6, "Darkness", 35, 21, 6, "Trevas", "Caninos Sombrios");
    }

    public Darkness(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}