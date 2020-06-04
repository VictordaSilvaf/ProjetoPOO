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
public class Demeter extends Deuses{
    public Demeter() {
        super(0, "Deméter, deus da terra fértil", 22, 15, 14, "Terra", "Lança da Floresta");
    }

    public Demeter(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}