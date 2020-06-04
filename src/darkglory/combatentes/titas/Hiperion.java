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
public class Hiperion extends Titas{
    public Hiperion() {
        super(28, "Hipérion, titã da visão e do fogo astral", 32, 27, 10, "Divino", "Cinto Cosmico");
    }

    public Hiperion(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
