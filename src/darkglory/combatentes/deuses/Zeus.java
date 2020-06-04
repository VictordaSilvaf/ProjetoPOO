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
public class Zeus extends Deuses{
    public Zeus() {
        super(4, "Zeus, deus supremo", 30, 30, 18, "Luz", "Raio de Zeus");
    }

    public Zeus(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
