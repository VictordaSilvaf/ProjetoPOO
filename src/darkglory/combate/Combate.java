package darkglory.combate;

import darkglory.combatentes.Classe;
import darkglory.equipamentos.Equipamento;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Combate {
    int batalhaJogador;
    int batalhaBot;
    JOptionPane in = new JOptionPane();
    Random random = new Random();
    Funcoes funcoes = new Funcoes();
    private Classe jogador1Lutador;
    private Classe jogador2Lutador;
    private Equipamento jogador1Equipamentos;
    private Equipamento jogador2Equipamentos;
    private Classe jogador1LutadorCampo;
    private Equipamento jogador1EquipamentosCampo;
    private Classe jogador2LutadorCampo;
    private Equipamento jogador2EquipamentosCampo;

    //Player>>>
    public void iniciarCombate(Player jogador1, Player jogador2) throws InterruptedException {
        //Definir quem vai iniciar o combate
        // 2 numero de jogadores
        int vez = (random.nextInt(2) + 1);
        //definir os turnos do combate
        int turno = 1;
        
        //setando as cartas dos jogadores
        setarCartas(jogador1, jogador2);

        //chama a função raund, onde define quem vai iniciar de acordo com o numero sorteado
        round(vez, jogador1, jogador2, turno);


    }

    public void setarCartas(Player jogador1, Player jogador2) {
        for (Classe classes : jogador1.getCombatentesMao()) {
            this.jogador1Lutador = classes;
        }
        for (Equipamento equipamentos : jogador1.getEquipamentosMao()) {
            this.jogador1Equipamentos = equipamentos;
        }
        for (Classe classes : jogador2.getCombatentesMao()) {
            this.jogador2Lutador = classes;
        }
        for (Equipamento equipamentos : jogador2.getEquipamentosMao()) {
            this.jogador2Equipamentos = equipamentos;
        }
    }

    public String vezPlayer(Player jogador1, Player jogador2, String opc) throws InterruptedException {
        //opções de combate


        opc = JOptionPane.showInputDialog("Oque deseja fazer?\n0- Para batalhar\n1- Invocar\n2- Ver suas cartas\n3- Exibir Campo\n4- Equipar\n'passar' Para passar a vez\nsair' (para sair)");
        switch (opc) {
            case "0":
                batalhaJogador = 1;
                if (jogador1LutadorCampo != null && jogador2LutadorCampo != null) {
                    inciarBatalha(jogador1, jogador2);
                    exibirCampo(jogador1, jogador2);
                } else {
                    JOptionPane.showMessageDialog(null, "Alguem ainda não invocou.", "Calma ae!", JOptionPane.WARNING_MESSAGE);
                    batalhaJogador = 0;
                }
                break;
            case "1":
                if (jogador1LutadorCampo == null) {
                    invocar(jogador1);
                } else {
                    System.out.println("Você ja tem um combatente em campo.");
                }
                break;
            case "2":
                mostrarMao(jogador1);
                break;
            case "3":
                exibirCampo(jogador1, jogador2);
                break;
            case "4":
                equipar(jogador1);
                break;
            case "passar":
                break;
            case "sair":
                System.out.println("Adeus!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Não entendi sua resposta, digite um numero de 0 a 4, passar ou sair");
        }
        return opc;
    }

    public void round(int vez, Player jogador1, Player jogador2, int turno) throws InterruptedException {
        JOptionPane.showMessageDialog(null, "Turno: " + turno);
        String opc = null;
        while (!"sair".equals(opc)) {
            switch (vez) {

                case 1:
                    opc = vezPlayer(jogador1, jogador2, opc);
                    vezBot(jogador1, jogador2);

                    break;
                case 2:
                    vezBot(jogador1, jogador2);
                    opc = vezPlayer(jogador1, jogador2, opc);

                    break;
            }
            turno++;
        }
    }

    public void mostrarMao(Player jogador) throws InterruptedException {
        System.out.println("\n");
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("|");
        //enumerar as cartas
        int contador = 1;
        for (Classe classes : jogador.getCombatentesMao()) {
            this.jogador1Lutador = classes;
            System.out.println("-------------------- Lutador --------------------");
            System.out.println("X   Carta número: " + contador);
            System.out.println("X   Nome: " + jogador1Lutador.getNome());
            System.out.println("X   Tipo: " + jogador1Lutador.getTipo());
            System.out.println("X   Dano: " + jogador1Lutador.getDano() + "   Vida:" + jogador1Lutador.getVida());
            System.out.println("X   Defesa: " + jogador1Lutador.getDefesa());
            System.out.println("-------------------------------------------------");
            contador++;
            System.out.println("|");
            System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("\n");
            Thread.sleep(1500);
        }
    }

    public void exibirEquipamentos(Player jogador) throws InterruptedException {
        System.out.println("\n");
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("|");
        //enumerar as cartas
        int contador = 1;
        for (Equipamento equipamentos : jogador.getEquipamentosMao()) {
            this.jogador1Equipamentos = equipamentos;
            System.out.println("-------------------- Equipamento --------------------");
            System.out.println("X   Numero da carta de equipamento: " + contador);
            System.out.println("X   Nome: " + jogador1Equipamentos.getNome());
            System.out.println("X   Tipo: " + jogador1Equipamentos.getTipo());
            System.out.println("X   Dano: " + jogador1Equipamentos.getDanoAdicional() + "   Vida:" + jogador1Equipamentos.getVidaAdicional());
            System.out.println("X   Defesa: " + jogador1Equipamentos.getDefesaAdicional());
            System.out.println("-------------------------------------------------");
            contador++;
            Thread.sleep(1500);
        }
        System.out.println("|");
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\n");

    }

    public void exibirCampo(Player jogador, Player bot) {
        System.out.println("\n");
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("|");
        if (jogador1LutadorCampo != null) {
            System.out.println("-------------------- Lutador --------------------");
            System.out.println("X   Dono: " + jogador.getNome());
            System.out.println("X   Nome: " + jogador1LutadorCampo.getNome());
            System.out.println("X   Tipo: " + jogador1LutadorCampo.getTipo());
            System.out.println("X   Dano: " + jogador1LutadorCampo.getDano() + "   Vida:" + jogador1LutadorCampo.getVida());
            System.out.println("X   Defesa: " + jogador1LutadorCampo.getDefesa());
            System.out.println("-------------------------------------------------");
        } else {
            System.out.println("-------------------------------------------------------------");
            System.out.println("|       O jogador numero 1 ainda está para invocar.     |");
            System.out.println("-------------------------------------------------------------");
        }

        if (jogador2LutadorCampo != null) {
            System.out.println("\n");
            System.out.println("-------------------- Lutador --------------------");
            System.out.println("X   Dono: " + bot.getNome());
            System.out.println("X   Nome: " + jogador2LutadorCampo.getNome());
            System.out.println("X   Tipo: " + jogador2LutadorCampo.getTipo());
            System.out.println("X   Dano: " + jogador2LutadorCampo.getDano() + "   Vida:" + jogador2LutadorCampo.getVida());
            System.out.println("X   Defesa: " + jogador2LutadorCampo.getDefesa());
            System.out.println("-------------------------------------------------");
        } else {
            System.out.println("-------------------------------------------------------------");
            System.out.println("|       O jogador numero 2 ainda está para invocar.         |");
            System.out.println("-------------------------------------------------------------");
        }
        System.out.println("|");
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\n");
    }

    public void invocar(Player jogador) {

        String numeroCarta = "0";

        System.out.println("\n");
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("|");

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
            lutadores.remove(numCarta);
            jogador.setCombatentesMao(lutadores);
            // vida base 30
            jogador1LutadorCampo.setVida(jogador1LutadorCampo.getVida() + 30);
            System.out.println(jogador1LutadorCampo.getNome() + " de " + jogador.getNome() + " invocado com sucesso.");
            System.out.println("|");
            System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("\n");
        }

    }

    public void equipar(Player jogador) throws InterruptedException {
        exibirEquipamentos(jogador);
        String cartaEquipamento = "0";

        if (jogador1EquipamentosCampo == null) {
            System.out.println("\n");
            System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("|");

            cartaEquipamento = JOptionPane.showInputDialog(null, "Qual o numero da carta equipamento que deseja equipar? ou digite 'voltar'");

            if (!"voltar".equals(cartaEquipamento)) {

                //transformando em inteiro e sobitraindo 1 pois na enumeração adicionei 1
                int numCarta = Integer.parseInt(cartaEquipamento);
                numCarta -= 1;

                ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();

                for (Equipamento equipamento : jogador.getEquipamentosMao()) {
                    equipamentos.add(equipamento);
                }


                if (jogador1LutadorCampo != null) {
                    jogador1EquipamentosCampo = equipamentos.get(numCarta);
                    jogador1LutadorCampo.setVida(jogador1LutadorCampo.getVida() + jogador1EquipamentosCampo.getVidaAdicional());
                    jogador1LutadorCampo.setDano(jogador1LutadorCampo.getDano() + jogador1EquipamentosCampo.getDanoAdicional());
                    jogador1LutadorCampo.setDefesa(jogador1LutadorCampo.getDefesa() + jogador1EquipamentosCampo.getDefesaAdicional());

                    System.out.println("\n");
                    System.out.println("-------------------- Lutador --------------------");
                    System.out.println("X   Nome: " + jogador1LutadorCampo.getNome());
                    System.out.println("X   Tipo: " + jogador1LutadorCampo.getTipo());
                    System.out.println("X   Dano: " + jogador1LutadorCampo.getDano() + "   Vida:" + jogador1LutadorCampo.getVida());
                    System.out.println("X   Defesa: " + jogador1LutadorCampo.getDefesa());
                    System.out.println("-------------------------------------------------");

                } else {
                    JOptionPane.showMessageDialog(null, "Tem certeza que tem algum lutador seu em campo?", "Alert", JOptionPane.WARNING_MESSAGE);
                }

                System.out.println("\n");
                System.out.println(jogador1EquipamentosCampo.getNome() + " Equipando com sucesso com sucesso.");
            }
            System.out.println("|");
            System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("\n");
        }else{
            System.out.println("Ocorreu algum erro!");
        }

    }

    //Bot>>>
    public void vezBot(Player jogador1, Player bot) {

        if (jogador2LutadorCampo == null) { // verifica se o campo do bot esta vazio.
            botInvocar(bot);
        } else {
            if (jogador1LutadorCampo != null) { // verificar se o player inimigo ja jogou.
                if (jogador2EquipamentosCampo == null) { //verifica se tem equipamentos no campo do bot.
                    //caso nao tenha ira rodar um dado se o dado cair 0  ele batalha se cair 1 ele equipa
                    int rand = random.nextInt(2);
                    switch (rand) {
                        case 0:
                            batalhaBot = 1;
                            break;
                        case 1:
                            botEquipar(bot);
                            break;
                    }
                }
            }
        }
    }

    public void botInvocar(Player bot) {
        ArrayList<Classe> lutadores = new ArrayList<Classe>();

        int rand = random.nextInt(6);
        for (Classe classes : bot.getCombatentesMao()) {
            lutadores.add(classes);
        }

        jogador2LutadorCampo = lutadores.get(rand);
        lutadores.remove(rand);

        //vida base 30
        jogador2LutadorCampo.setVida(jogador2LutadorCampo.getVida() + 30);
        System.out.println("\n");
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("|");
        System.out.println(jogador2LutadorCampo.getNome() + " de " + bot.getNome() + " invocado com sucesso.");
        System.out.println("|");
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\n");

    }

    public void botEquipar(Player bot) {
        ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();

        int numCarta = random.nextInt(6);

        for (Equipamento equipamento : bot.getEquipamentosMao()) {
            equipamentos.add(equipamento);
        }

        if (jogador2LutadorCampo != null) {


            jogador2EquipamentosCampo = equipamentos.get(numCarta);
            jogador2LutadorCampo.setVida(jogador2LutadorCampo.getVida() + jogador2EquipamentosCampo.getVidaAdicional());
            jogador2LutadorCampo.setDano(jogador2LutadorCampo.getDano() + jogador2EquipamentosCampo.getDanoAdicional());
            jogador2LutadorCampo.setDefesa(jogador2LutadorCampo.getDefesa() + jogador2EquipamentosCampo.getDefesaAdicional());

            System.out.println("\n");
            System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("|");
            System.out.println(bot.getNome() + " equipou " + jogador2EquipamentosCampo.getNome() + " em " + jogador2LutadorCampo.getNome());
            System.out.println("\n");
            System.out.println("-------------------- Lutador --------------------");
            System.out.println("X   Nome: " + jogador2LutadorCampo.getNome());
            System.out.println("X   Tipo: " + jogador2LutadorCampo.getTipo());
            System.out.println("X   Dano: " + jogador2LutadorCampo.getDano() + "   Vida:" + jogador2LutadorCampo.getVida());
            System.out.println("X   Defesa: " + jogador2LutadorCampo.getDefesa());
            System.out.println("-------------------------------------------------");
            System.out.println("|");
            System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("\n");
        }
    }

    //Batalha
    public void inciarBatalha(Player jogador1, Player jogador2) {
        JOptionPane.showMessageDialog(null, "Batalha iniciada!");
        definirVez(jogador1, jogador2);


    }

    public void definirVez(Player jogador1, Player jogador2) {
        Random random = new Random();
        int start = random.nextInt(2);

        switch (start) {

            case 0:
                System.out.println(start);
                while (jogador1LutadorCampo.getVida() != 0 || jogador2LutadorCampo.getVida() != 0) {
                    System.out.println("aaaa");
                    System.out.println("----------------------------------------------------------------------------------------");
                    jogador2LutadorCampo.receberAtaque(jogador1LutadorCampo.atacar());
                    System.out.println("\n");
                    jogador1LutadorCampo.receberAtaque(jogador2LutadorCampo.atacar());
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // verificar quem venceu a batalha
                    if (jogador1LutadorCampo.seMorto() == true && jogador2LutadorCampo.seMorto() == false) {
                        JOptionPane.showMessageDialog(null, jogador2LutadorCampo.getNome() + " do jogador " + jogador2.getNome() + " saiu vitorioso no combate.");
                        jogador1LutadorCampo = null;
                        break;
                    } else if (jogador2LutadorCampo.seMorto() == true && jogador1LutadorCampo.seMorto() == false) {
                        JOptionPane.showMessageDialog(null, jogador1LutadorCampo.getNome() + " do jogador " + jogador1.getNome() + " saiu vitorioso no combate.");
                        jogador2LutadorCampo = null;
                        break;
                    } else if (jogador2LutadorCampo.seMorto() == true && jogador1LutadorCampo.seMorto() == true) {
                        JOptionPane.showMessageDialog(null, "Empate!");
                        jogador1LutadorCampo = null;
                        jogador2LutadorCampo = null;
                        break;
                    }
                }
                break;

            case 1:
                System.out.println(start);
                while (jogador1LutadorCampo.getVida() != 0 || jogador2LutadorCampo.getVida() != 0) {
                    System.out.println("aaaa");
                    System.out.println("----------------------------------------------------------------------------------------");
                    jogador1LutadorCampo.receberAtaque(jogador2LutadorCampo.atacar());
                    System.out.println("\n");
                    jogador2LutadorCampo.receberAtaque(jogador1LutadorCampo.atacar());
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // verificar quem venceu a batalha
                    if (jogador1LutadorCampo.seMorto() == true && jogador2LutadorCampo.seMorto() == false) {
                        JOptionPane.showMessageDialog(null, jogador2LutadorCampo.getNome() + " do jogador " + jogador2.getNome() + " saiu vitorioso no combate.");
                        jogador1LutadorCampo = null;
                        break;
                    } else if (jogador2LutadorCampo.seMorto() == true && jogador1LutadorCampo.seMorto() == false) {
                        JOptionPane.showMessageDialog(null, jogador1LutadorCampo.getNome() + " do jogador " + jogador1.getNome() + " saiu vitorioso no combate.");
                        jogador2LutadorCampo = null;
                        break;
                    } else if (jogador2LutadorCampo.seMorto() == true && jogador1LutadorCampo.seMorto() == true) {
                        JOptionPane.showMessageDialog(null, "Empate!");
                        jogador1LutadorCampo = null;
                        jogador2LutadorCampo = null;
                        break;
                    }
                }
                break;
        }
    }
}