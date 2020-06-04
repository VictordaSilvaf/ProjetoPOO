/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes.orcs;

import darkglory.Combatentes.Orcs;

/**
 *
 * @author victo
 */

public class OrcDoDeserto extends Orcs {

    public OrcDoDeserto() {
        super(23, "Orc da Montanha", 44, 16, 5, "Rocha", "Manopla de pedra");
    }

    public OrcDoDeserto(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
