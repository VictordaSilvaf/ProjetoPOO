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

public class Tomte extends Espiritos {

    public Tomte() {
        super(17, "Tomte", 29, 15, 15, "Luz", "Medalhão com Lagrima de Deus");
    }

    public Tomte(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}