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
public class ArmaduraDeFogoGelado extends Equipamento {

    public ArmaduraDeFogoGelado() {
        super(11, " Armadura de Fogo Gelado", 6, 0, 7, "Gelo", "Armadura feita com de gelo espacial, um gelo quase indestrutivel.");
    }

    public ArmaduraDeFogoGelado(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}
