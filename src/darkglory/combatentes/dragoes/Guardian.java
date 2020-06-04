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

public class Guardian extends Dragoes {

    public Guardian() {
        super(7, "Guardian", 45, 14, 9, "Luz", "Escama de Anjo");
    }

    public Guardian(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}