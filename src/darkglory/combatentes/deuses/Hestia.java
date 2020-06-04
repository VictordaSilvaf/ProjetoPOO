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
public class Hestia extends Deuses{
    public Hestia() {
        super(2,"Héstia, deusa do fogo", 30, 30, 18, "Fogo", "Raio de Zeus");
    }

    public Hestia(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}