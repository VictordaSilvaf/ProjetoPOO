package darkglory.combatentes.dragoes;
import darkglory.combatentes.Dragoes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Nevasca extends Dragoes {

    public Nevasca() {
        super(8, "Nevasca", 40, 16, 8, "Gelo", "Garra Congelada");
    }

    public Nevasca(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}