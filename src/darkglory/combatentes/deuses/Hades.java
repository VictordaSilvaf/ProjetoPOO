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
public class Hades extends Deuses{
    public Hades() {
        super(1, "Hades, deus do submundo", 27, 26, 19, "Trevas", "Raio de Zeus");
    }

    public Hades(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
