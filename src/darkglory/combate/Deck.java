package darkglory.combate;

import darkglory.combatentes.titas.*;
import darkglory.combatentes.deuses.*;
import darkglory.combatentes.dragoes.*;
import darkglory.combatentes.egipcios.*;
import darkglory.combatentes.espiritos.*;
import darkglory.combatentes.humanos.*;
import darkglory.combatentes.orcs.*;
import darkglory.equipamentos.armaduras.ArmaduraDeFogoGelado;
import darkglory.equipamentos.armaduras.BotasDeHernes;
import darkglory.equipamentos.armaduras.PeitoralDeInfernal;
import darkglory.equipamentos.armas.AdagasDoTrovao;
import darkglory.equipamentos.armas.EscudoDeApofis;
import darkglory.equipamentos.armas.EspadaSemLamina;
import darkglory.equipamentos.armas.MachadoDecepador;
import darkglory.equipamentos.colar.*;

import java.util.*;

public class Deck {
    String dono;

    int numeroCombatentes;
    int numeroEquipamentos;

    int[] combatentes;
    int[] equipamentos;

    public Random random = new Random();

    public Deck() {
        this.numeroCombatentes = 6;
        this.numeroEquipamentos = 6;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int[] getCombatentes() {
        return combatentes;
    }

    public void setCombatentes(int[] combatentes) {
        this.combatentes = combatentes;
    }

    public int[] getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(int[] equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void criarDeck(String dono) {
        this.dono = dono;
        Funcoes func = new Funcoes();
        int combatentesNaMao = 6;
        int qtdCombatentes = 31;
        int equipamentosNaMao = 6;
        int qtdEquipamentos = 11;

        ArrayList<Object> Combatentes = new ArrayList<>();
        ArrayList<Object> Equipamentos = new ArrayList<>();

        Random random = new Random();
        Set<Integer> numerosCombatentes = new HashSet<>();
        Set<Integer> numerosEquipamentos = new HashSet<>();

        func.gerarNumAleatorio(combatentesNaMao, numerosCombatentes, qtdCombatentes);
        func.gerarNumAleatorio(equipamentosNaMao, numerosEquipamentos, qtdEquipamentos);

        setDono(dono);

        //Criando um arrey com todas as cartas de combatentes
        Combatentes.add(new Demeter());
        Combatentes.add(new Hades());
        Combatentes.add(new Hestia());
        Combatentes.add(new Posseidon());
        Combatentes.add(new Zeus());
        Combatentes.add(new Centrion());
        Combatentes.add(new Darkness());
        Combatentes.add(new Guardian());
        Combatentes.add(new Nevasca());
        Combatentes.add(new Anubis());
        Combatentes.add(new Aton());
        Combatentes.add(new Geb());
        Combatentes.add(new Maat());
        Combatentes.add(new Tefnut());
        Combatentes.add(new Boggart());
        Combatentes.add(new Clurichaun());
        Combatentes.add(new Pooka());
        Combatentes.add(new Tomte());
        Combatentes.add(new ArqueiroDaNeve());
        Combatentes.add(new CacadorDeDragoes());
        Combatentes.add(new GuardaReal());
        Combatentes.add(new OrcDaMontanha());
        Combatentes.add(new OrcDeLava());
        Combatentes.add(new OrcDoDeserto());
        Combatentes.add(new Atlas());
        Combatentes.add(new Ceo());
        Combatentes.add(new Crio());
        Combatentes.add(new Cronos());
        Combatentes.add(new Hiperion());
        Combatentes.add(new Lapeto());
        Combatentes.add(new Oceano());

        //Criando todas as cartas de equipamentos
        Equipamentos.add(new ArmaduraDeFogoGelado());
        Equipamentos.add(new BotasDeHernes());
        Equipamentos.add(new PeitoralDeInfernal());
        Equipamentos.add(new AdagasDoTrovao());
        Equipamentos.add(new EscudoDeApofis());
        Equipamentos.add(new EspadaSemLamina());
        Equipamentos.add(new MachadoDecepador());
        Equipamentos.add(new ColarDeDiamante());
        Equipamentos.add(new ColarDeEsmeralda());
        Equipamentos.add(new ColarDeObsidean());
        Equipamentos.add(new ColarDeRubi());
        Equipamentos.add(new ColarDeSafira());

        System.out.println("Deck Criado com sucesso!");

    }

    public void exibirDeck(Set<Integer> numeros) {
        for(Integer c : numeros) {

        }
    }
}