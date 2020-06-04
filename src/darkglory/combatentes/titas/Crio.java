/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes.titas;

import darkglory.Combatentes.Titas;

/**
 *
 * @author victo
 */
public class Crio extends Titas{
    public Crio() {
        super(26, "Crio, titã das manadas, do frio e do inverno", 40, 20, 7, "Divino", "Correntes de agua com ponta de gelo");
    }

    public Crio(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
