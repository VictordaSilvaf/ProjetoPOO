/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes.titas;

import darkglory.Combatentes.Titas;

/**
 *
 * @author victo
 */
public class Atlas extends Titas{
    public Atlas() {
        super(24, "Atlas, quem sustenta o mundo nos ombros", 65, 9, 7, "Divino", "Braceletes de Sustentação");
    }

    public Atlas(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
