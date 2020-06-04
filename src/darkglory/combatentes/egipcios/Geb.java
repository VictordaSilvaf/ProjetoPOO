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
public class Geb extends Egipcios {

    public Geb() {
        super(11, "Geb, deus da terra", 24, 13, 16, "Terra", "Colar De Terrasteal");
    }

    public Geb(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}
