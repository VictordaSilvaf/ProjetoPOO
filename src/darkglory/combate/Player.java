package darkglory.combate;

import darkglory.combatentes.Classe;
import darkglory.equipamentos.Equipamento;
import java.util.ArrayList;
import java.util.Random;

    public class Player {

        public Random random = new Random();

        String playerNome;
        String playergenero;
        int playerVida;
        ArrayList<Classe> combatentesMao = new ArrayList<Classe>();
        ArrayList<Equipamento> equipamentosMao = new ArrayList<Equipamento>();

        public Player(String playerNome, String playergenero) {

            this.playerNome = playerNome;
            this.playergenero = playergenero;
            this.playerVida = 5;

        }

        public ArrayList<Classe> getCombatentesMao() {
            return combatentesMao;
        }

        public void setCombatentesMao(ArrayList<Classe> combatentesMao) {
            this.combatentesMao = combatentesMao;
        }

        public ArrayList<Equipamento> getEquipamentosMao() {
            return equipamentosMao;
        }

        public void setEquipamentosMao(ArrayList<Equipamento> equipamentosMao) {
            this.equipamentosMao = equipamentosMao;
        }

        public String getNome() {
            return playerNome;
        }

        public void setNome(String nome) {
            this.playerNome = nome;
        }

        public String getGenero() {
            return playergenero;
        }

        public void setGenero(String genero) {
            this.playergenero = genero;
        }

        public int getVida() {
            return playerVida;
        }

        public void setVida(int vida) {
            this.playerVida = vida;
        }
    }

