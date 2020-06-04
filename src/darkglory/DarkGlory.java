/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory;

import darkglory.combate.Deck;
import darkglory.combate.Funcoes;
import darkglory.combate.Player;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class DarkGlory {
    static Scanner in = new Scanner(System.in);


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Seja bem vindo ao DarkGlory!");
        JOptionPane.showMessageDialog(null, "Onde você deve batalha em busca da glória.");
        String playerNome = JOptionPane.showInputDialog("Por favor Dígite seu nome gerreiro(a): ");

        JOptionPane.showMessageDialog(null, "Foi um prazer te conhecer " + playerNome + "!");
        String playerGenero = JOptionPane.showInputDialog("Devo chamar de 'guerreiro' ou 'guerreira'? ");

        switch (playerGenero) {
            case "guerreiro":
                playerGenero = "masculino";
                break;
            case "guerreira":
                playerGenero = "feminino";
                break;
        }
        Player player = new Player(playerNome,playerGenero);

        JOptionPane.showMessageDialog(null, "Arthur: Todos deem as boas vindas a " + playerNome + ", novo membro que ira participar das batalhas conosco apartir de agora!");

        Deck deck = new Deck();

        JOptionPane.showMessageDialog(null, "Arthur: Que tal dar uma aquecidinha?\nArthur: Lute contra mim!\nArthur: Sou iniciante, mais vou te dar um coro.");

        deck.criarDeck();

        deck.definirMao(player);

        Player arthur = new Player("Arthur","masculino");
        deck.definirMao(arthur);

        for (Object obj : player.getCombatentesMao()) {
            System.out.println(obj);
        }

    }
    
}
