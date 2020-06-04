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
public class Oceano extends Titas{
    public Oceano() {
        super(30, "Oceano, Representava o rio o qual circunda o mundo.", 25, 33, 18, "Divino", "Toda a agua do mundo");
    }

    public Oceano(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
