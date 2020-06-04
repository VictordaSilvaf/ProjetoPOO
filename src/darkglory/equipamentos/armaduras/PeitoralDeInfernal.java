/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.equipamentos.armaduras;

import darkglory.equipamentos.Equipamento;

/**
 *
 * @author victo
 */
public class PeitoralDeInfernal extends Equipamento {

    public PeitoralDeInfernal() {
        super(9, " Armadura de infernal", 3, 2, 5, "Fogo", "Armadura de escamas de dragão Infernal o mais forte e mais perigoso dos dragões.");
    }

    public PeitoralDeInfernal(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}
