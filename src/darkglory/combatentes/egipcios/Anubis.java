package darkglory.combatentes.egipcios;
import darkglory.combatentes.Egipcios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Anubis extends Egipcios {

    public Anubis() {
        super(9, "Anúbis, deus dos mortos e do submundo", 15, 22, 15, "Trevas", "Cetro de Anúbis");
    }

    public Anubis(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}