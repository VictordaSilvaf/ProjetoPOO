/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes.espiritos;

import darkglory.combatentes.Espiritos;

/**
 *
 * @author victor
 */

public class Boggart extends Espiritos {

    public Boggart() {
        super(14, "Boggart", 20, 19, 14, "Gelo", "Aura de Gelo");
    }

    public Boggart(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}