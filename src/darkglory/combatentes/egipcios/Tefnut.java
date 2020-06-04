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
public class Tefnut extends Egipcios {

    public Tefnut() {
        super(13, "Tefnut, deusa da umidade", 20, 18, 15, "Agua", "");
    }

    public Tefnut(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}