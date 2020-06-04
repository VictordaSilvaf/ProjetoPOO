/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes.humanos;

import darkglory.combatentes.Humanos;

/**
 *
 * @author victor
 */
public class GuardaReal extends Humanos {

    public GuardaReal() {
        super(20, "Guarda Real", 20, 18, 10, "luz", "Espada Divina");
    }

    public GuardaReal(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
    