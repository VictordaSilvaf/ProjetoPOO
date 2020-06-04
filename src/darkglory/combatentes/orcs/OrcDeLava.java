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

public class OrcDeLava extends Orcs {

    public OrcDeLava() {
        super(22, "Orc da Montanha", 45, 13, 12, "Fogo", "Magama Central");
    }

    public OrcDeLava(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
