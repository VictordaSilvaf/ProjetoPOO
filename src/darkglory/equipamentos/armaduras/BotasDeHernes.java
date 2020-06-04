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
public class BotasDeHernes extends Equipamento {

    public BotasDeHernes() {
        super(10, " Botas De Hernes", 4, 0, 6, "Terra", "Botas da velocidade de Hernes, deus grego.");
    }

    public BotasDeHernes(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}
