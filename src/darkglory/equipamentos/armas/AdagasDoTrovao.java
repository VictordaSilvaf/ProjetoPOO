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
public class AdagasDoTrovao extends Equipamento {

    public AdagasDoTrovao() {
        super(8, "Adagas Do Trovão", 1, 8, 1, "Agua", "Uma adaga que usaram para coletar um trovão, aumenta o dano a vida e a defesa de quem a ultiliza.");
    }

    public AdagasDoTrovao(int id, String nome, int vida, int dano, int defesa, String tipo, String descricao) {
        super(id, nome, vida, dano, defesa, tipo, descricao);
    }
}
