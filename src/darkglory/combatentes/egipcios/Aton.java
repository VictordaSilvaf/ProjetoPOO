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
public class Aton  extends Egipcios {

    public Aton () {
        super(10, "Aton, deus do atomismo que estava relacionado com o disco solar", 12, 24, 14, "Fogo", "Escudo Solar");
    }

    public Aton (int id, String nome, int vida, int dano, int defesa, String tipo, String equipamento) {
        super(id, nome, vida, dano, defesa, tipo, equipamento);
    }
}