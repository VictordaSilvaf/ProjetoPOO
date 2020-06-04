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
public class Maat extends Egipcios {

    public Maat() {
        super(12, "Maat, deusa da justiça, da verdade e da ordem", 18, 18, 18, "luz", "Assas da Justiça");
    }

    public Maat(int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
    
}