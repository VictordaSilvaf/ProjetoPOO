/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes.espiritos;

import darkglory.combatentes.Espiritos;

/**
 *
 * @author victo
 */

public class Clurichaun extends Espiritos {

    public Clurichaun() {
        super(15, "Clurichaun", 10, 25, 18, "Terra", "Jarro com Terra do Inferno");
    }

    public Clurichaun(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}