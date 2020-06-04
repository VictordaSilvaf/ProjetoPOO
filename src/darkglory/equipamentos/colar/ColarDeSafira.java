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
public class ColarDeSafira extends Equipamento {

    public ColarDeSafira() {
        super(0, "Colar De Safira", 0, 0, 5, "Agua", "Envolve o equipado com uma aura de agua aumentando sua defesa.");
    }

    public ColarDeSafira(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}
