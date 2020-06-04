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
public class ColarDeDiamante extends Equipamento {

    public ColarDeDiamante() {
        super(4, "Colar De Diamante", 0, 3, 2, "Luz", "Afia a arma do ultilizador e deixa sua armadura mais resistenta.");
    }

    public ColarDeDiamante(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}