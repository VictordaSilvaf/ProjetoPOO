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
public class EspadaSemLamina extends Equipamento {

    public EspadaSemLamina() {
        super(6, "Espada Sem Lamina", 0, 10, 0, "Luz", "Uma espada feita por um anjo, onde o usuario injeta sua energia na espada e ela se molda de acordo, intencificando o seu poder.");
    }

    public EspadaSemLamina(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}