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
public class Cronos extends Titas{
    public Cronos() {
        super(27, "Cronos, Rei dos titãs Antigo rei dos titãs", 40, 33, 13, "Divino", "Manopla do Infinito");
    }

    public Cronos(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
