package darkglory.combate;

import darkglory.combatentes.titas.*;
import darkglory.combatentes.deuses.*;
import darkglory.combatentes.dragoes.*;
import darkglory.combatentes.egipcios.*;
import darkglory.combatentes.espiritos.*;
import darkglory.combatentes.humanos.*;
import darkglory.combatentes.orcs.*;
import darkglory.equipamentos.armaduras.*;
import darkglory.equipamentos.armas.*;
import darkglory.equipamentos.colar.*;

import java.util.*;
import java.util.stream.Collectors;

public class Deck {

    int numeroCombatentes;
    int numeroEquipamentos;

    ArrayList<Object> todosCombatentes = new ArrayList<>();
    ArrayList<Object> todosEquipamentos = new ArrayList<>();

    public Random random = new Random();

    public Deck() {
        this.numeroCombatentes = 6;
        this.numeroEquipamentos = 6;
    }

    public void criarDeck() {
        //Criando um arrey com todas as cartas de combatentes
        todosCombatentes.add(new Demeter());
        todosCombatentes.add(new Hades());
        todosCombatentes.add(new Hestia());
        todosCombatentes.add(new Posseidon());
        todosCombatentes.add(new Zeus());
        todosCombatentes.add(new Centrion());
        todosCombatentes.add(new Darkness());
        todosCombatentes.add(new Guardian());
        todosCombatentes.add(new Nevasca());
        todosCombatentes.add(new Anubis());
        todosCombatentes.add(new Aton());
        todosCombatentes.add(new Geb());
        todosCombatentes.add(new Maat());
        todosCombatentes.add(new Tefnut());
        todosCombatentes.add(new Boggart());
        todosCombatentes.add(new Clurichaun());
        todosCombatentes.add(new Pooka());
        todosCombatentes.add(new Tomte());
        todosCombatentes.add(new ArqueiroDaNeve());
        todosCombatentes.add(new CacadorDeDragoes());
        todosCombatentes.add(new GuardaReal());
        todosCombatentes.add(new OrcDaMontanha());
        todosCombatentes.add(new OrcDeLava());
        todosCombatentes.add(new OrcDoDeserto());
        todosCombatentes.add(new Atlas());
        todosCombatentes.add(new Ceo());
        todosCombatentes.add(new Crio());
        todosCombatentes.add(new Cronos());
        todosCombatentes.add(new Hiperion());
        todosCombatentes.add(new Lapeto());
        todosCombatentes.add(new Oceano());

        //Criando todas as cartas de equipamentos
        todosEquipamentos.add(new ArmaduraDeFogoGelado());
        todosEquipamentos.add(new BotasDeHernes());
        todosEquipamentos.add(new PeitoralDeInfernal());
        todosEquipamentos.add(new AdagasDoTrovao());
        todosEquipamentos.add(new EscudoDeApofis());
        todosEquipamentos.add(new EspadaSemLamina());
        todosEquipamentos.add(new MachadoDecepador());
        todosEquipamentos.add(new ColarDeDiamante());
        todosEquipamentos.add(new ColarDeEsmeralda());
        todosEquipamentos.add(new ColarDeObsidean());
        todosEquipamentos.add(new ColarDeRubi());
        todosEquipamentos.add(new ColarDeSafira());

        System.out.println("Deck Criado com sucesso!");
    }

    public void definirMao(Player jogador) {

        Funcoes func = new Funcoes();
        int combatentesNaMao = 6;
        int qtdCombatentes = 31;
        int equipamentosNaMao = 6;
        int qtdEquipamentos = 12;

        Set<Integer> numerosCombatentes = new HashSet<>(qtdCombatentes);
        Set<Integer> numerosEquipamentos = new HashSet<>(qtdEquipamentos);

        ArrayList<Object> maoCombatentes = new ArrayList<>(combatentesNaMao);
        ArrayList<Object> maoEquipamentos = new ArrayList<>(equipamentosNaMao);

        Random random = new Random();

        //gerar numeros aleatórios
        func.gerarNumAleatorio(combatentesNaMao, numerosCombatentes, qtdCombatentes);
        func.gerarNumAleatorio(equipamentosNaMao, numerosEquipamentos, qtdEquipamentos);

        List<Integer> lista = new ArrayList<Integer>();

        //adicionando os numeros aleatórios de acordo com os objetos das cartas.

        for (Integer comb : numerosCombatentes) {
            maoCombatentes.add(todosCombatentes.get(comb));
        }
        for (Integer equip : numerosEquipamentos) {
            maoEquipamentos.add(todosEquipamentos.get(equip));
        }

        //setando um array com as cartas.
        jogador.setCombatentesMao(maoCombatentes);
        jogador.setEquipamentosMao(maoEquipamentos);

        System.out.println("Mão do(a):" + jogador.getNome() + ", definido com sucesso.");
    }

}