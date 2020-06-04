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
public class Lapeto extends Titas{
    public Lapeto() {
        super(29, "Lápeto, irmão de Cronos", 37, 36, 11, "Divino", "A morte (tunica)");
    }

    public Lapeto(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
