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
public class EscudoDeApofis extends Equipamento {

    public EscudoDeApofis() {
        super(7, "Escudo De Apófis", 0, 0, 10, "Trevas", "Um escudo feito com as escamas de apófis conhecido como \"Senhor do Caos\" uma serpente gigante.");
    }

    public EscudoDeApofis(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}