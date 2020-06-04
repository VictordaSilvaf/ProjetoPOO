package darkglory.combate;

import darkglory.combatentes.Classe;
import darkglory.equipamentos.Equipamento;

import javax.swing.*;
import java.util.Random;

public class Batalha {
    Random random = new Random();

    public static void inciarBatalha(Player jogador1, Player jogador2, Classe jogador1LutadorCampo, Classe jogador2LutadorCampo, Equipamento jogador1EquipamentosCampo, Equipamento jogador2EquipamentosCampo) {
        JOptionPane.showMessageDialog(null, "Batalha iniciada!");




    }
    public void definirVez(Player jogador1, Player jogador2, Classe jogador1LutadorCampo, Classe jogador2LutadorCampo, Equipamento jogador1EquipamentosCampo, Equipamento jogador2EquipamentosCampo) {
        int start = random.nextInt(2);
        while (jogador1LutadorCampo.getVida() != 0 || jogador2LutadorCampo.getVida() != 0) {
            switch (start) {
                case 0:
                    System.out.println("----------------------------------------------------------------------------------------");
                    jogador2LutadorCampo.recAtaque(jogador1LutadorCampo.atacar());
                    jogador1LutadorCampo.recAtaque(jogador2LutadorCampo.atacar());
                    break;
                case 1:
                    System.out.println("----------------------------------------------------------------------------------------");
                    jogador1LutadorCampo.recAtaque(jogador2LutadorCampo.atacar());
                    jogador2LutadorCampo.recAtaque(jogador1LutadorCampo.atacar());
                    break;
            }
        }
    }
}