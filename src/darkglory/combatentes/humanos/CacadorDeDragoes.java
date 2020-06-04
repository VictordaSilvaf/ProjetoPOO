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
public class CacadorDeDragoes extends Humanos {

    public CacadorDeDragoes() {
        super(19, "Caçador De Dragões", 30, 18, 6, "Fogo", "Adaga de Escama de Infernal");
    }

    public CacadorDeDragoes(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}

