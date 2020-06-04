/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.equipamentos.armas;

import darkglory.equipamentos.Equipamento;

/**
 *
 * @author victo
 */
public class MachadoDecepador extends Equipamento {

    public MachadoDecepador() {
        super(5, "MachadoDecepador", 0, 7, 3, "Fogo", "Um machado forjado na lava do primeiro vulcão, normamente ultilizado para fazer decepações.");
    }

    public MachadoDecepador(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}