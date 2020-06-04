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

public class Pooka extends Espiritos {

    public Pooka() {
        super(16, "Pooka", 30, 11, 13, "Trevas", "Medalão com Lagrima do Diabo");
    }

    public Pooka(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}