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
public class ArqueiroDaNeve extends Humanos {

    public ArqueiroDaNeve() {
        super(18, "Arqueiro Da Neve", 25, 22, 3, "Gelo", "Arco Nevasca");
    }

    public ArqueiroDaNeve(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}

