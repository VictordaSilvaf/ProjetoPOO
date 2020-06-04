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

public class OrcDaMontanha extends Orcs {

    public OrcDaMontanha() {
        super(21, "Orc da Montanha", 50, 10, 10, "Rocha", "Manopla de pedra");
    }

    public OrcDaMontanha(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
