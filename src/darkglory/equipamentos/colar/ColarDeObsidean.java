/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.equipamentos.colar;

import darkglory.equipamentos.Equipamento;

/**
 *
 * @author victo
 */
public class ColarDeObsidean extends Equipamento {

    public ColarDeObsidean() {
        super(2, "Colar De Obsidean", 2, 1, 2, "Trevas", "Envolve o ultilizador em uma crosta fina mas potente de obsidean que eleva seus status.");
    }

    public ColarDeObsidean(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}