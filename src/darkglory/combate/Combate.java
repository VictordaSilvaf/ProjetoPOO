package darkglory.combate;

import darkglory.combatentes.Classe;
import darkglory.equipamentos.Equipamento;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Combate {
    private Classe jogador1Lutador;
    private Classe jogador2Lutador;

    private Classe jogador1LutadorCampo;
    private Classe jogador2LutadorCampo;

    JOptionPane in = new JOptionPane();
    Random random = new Random();
    Funcoes funcoes = new Funcoes();

    public void iniciarCombate(Player jogador1, Player jogador2) throws InterruptedException {
        //Definir quem vai iniciar o combate
        // 2 numero de jogadores
        int vez = (random.nextInt(2) + 1);
        //definir os turnos do combate
        int turno = 1;
        System.out.println(vez);

        //setando as cartas dos jogadores
        setarCartas(jogador1, jogador2);

        //chama a função raund, onde define quem vai iniciar de acordo com o numero sorteado
        round(vez, jogador1, jogador2, turno);


    }
    public void setarCartas(Player jogador1, Player jogador2) {
        for (Classe classes : jogador1.getCombatentesMao()) {
            this.jogador1Lutador = classes;
        }
        for (Classe classes : jogador2.getCombatentesMao()) {
            this.jogador2Lutador = classes;
        }
    }
    public void vezPlayer(Player jogador1, Player jogador2) throws InterruptedException {
        //opções de combate
        String opc = null;
        while (!"sair".equals(opc)) {
            opc = JOptionPane.showInputDialog("Oque deseja fazer?\n1- Invocar\n2- Ver suas cartas\n3- Exibir Campo\n4- Equipar\n 'sair' (para sair)");
            switch (opc) {
                case "1":
                    invocar(jogador1);
                    break;
                case "2":
                    mostrarMao(jogador1);
                    break;
                case "3":
                    exibirCampo();
                    break;
                case "4":

                    break;
                case "sair":

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Não entendi sua resposta, digite um numero de 1 a 4 ou sair");
            }
        }
    }
    public void vezBot(Player jogador1, Player jogador2) {

    }
    public void round(int vez, Player jogador1, Player jogador2, int turno) throws InterruptedException {
        JOptionPane.showMessageDialog(null,"Turno: "+turno);
        switch (vez) {
            case 1:
                vezPlayer(jogador1, jogador2);
                vezBot(jogador1, jogador2);
                break;
            case 2:
                vezBot(jogador1, jogador2);
                vezPlayer(jogador1, jogador2);
                break;
        }
        turno++;
    }
    public void mostrarMao(Player jogador) throws InterruptedException {

        System.out.println("*******************************************");
        //enumerar as cartas
        int contador = 1;
        for (Classe classes : jogador.getCombatentesMao()) {
            this.jogador1Lutador = classes;
            System.out.println("-------------------- Lutador --------------------");
            System.out.println("X   Carta número: "+contador);
            System.out.println("X   Nome: "+jogador1Lutador.getNome());
            System.out.println("X   Tipo: "+jogador1Lutador.getTipo());
            System.out.println("X   Dano: "+jogador1Lutador.getDano()+"   Vida:"+jogador1Lutador.getVida());
            System.out.println("X   Defesa: "+jogador1Lutador.getDefesa());
            System.out.println("-------------------------------------------------");
            contador++;
            Thread.sleep(1500);
        }
    }
    public void exibirCampo() {
        if (jogador1LutadorCampo != null) {
            System.out.println("-------------------- Lutador --------------------");
            System.out.println("X   Nome: " + jogador1LutadorCampo.getNome());
            System.out.println("X   Tipo: " + jogador1LutadorCampo.getTipo());
            System.out.println("X   Dano: " + jogador1LutadorCampo.getDano() + "   Vida:" + jogador1LutadorCampo.getVida());
            System.out.println("X   Defesa: " + jogador1LutadorCampo.getDefesa());
            System.out.println("-------------------------------------------------");
        }else {
            System.out.println("O jogador numero 1 ainda não esta para invocar.");
        }

        if (jogador2LutadorCampo != null) {
            System.out.println("-------------------- Lutador --------------------");
            System.out.println("X   Nome: " + jogador2LutadorCampo.getNome());
            System.out.println("X   Tipo: " + jogador2LutadorCampo.getTipo());
            System.out.println("X   Dano: " + jogador2LutadorCampo.getDano() + "   Vida:" + jogador2LutadorCampo.getVida());
            System.out.println("X   Defesa: " + jogador2LutadorCampo.getDefesa());
            System.out.println("-------------------------------------------------");
        }else {
            System.out.println("O jogador numero 2 ainda não esta para invocar.");
        }
    }
    public void invocar(Player jogador) {

        String numeroCarta = "0";

        numeroCarta = JOptionPane.showInputDialog("Qual o numero da carta que deseja invocar ou digite voltar ");
        if (!"voltar".equals(numeroCarta)) {
            //transformando em inteiro e sobitraindo 1 pois na enumeração adicionei 1
            int numCarta = Integer.parseInt(numeroCarta);
            numCarta -= 1;

            ArrayList<Classe> lutadores = new ArrayList<Classe>();

            for (Classe classes : jogador.getCombatentesMao()) {
                 lutadores.add(classes);
            }

            jogador1LutadorCampo = lutadores.get(numCarta);
            System.out.println(jogador1LutadorCampo.getNome() + " invocado com sucesso.");
        }
    }
    public void equipar() {

    }
}
