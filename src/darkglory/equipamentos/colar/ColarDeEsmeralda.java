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
public class ColarDeEsmeralda extends Equipamento {

    public ColarDeEsmeralda() {
        super(3, "Colar De Esmeralda", 3, 0, 2, "Terra", "Faz com que a terra ao seu redor alem de aumentar a vida proteger o ultilizador.");
    }

    public ColarDeEsmeralda(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}