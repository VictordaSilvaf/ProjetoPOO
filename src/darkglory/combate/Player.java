package darkglory.combate;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author victo
 */

    public class Player {

        public Random random = new Random();

        String playerNome;
        String playergenero;
        int playerVida;
        ArrayList<Object> combatentesMao = new ArrayList<>();
        ArrayList<Object> equipamentosMao = new ArrayList<>();

        public Player(String playerNome, String playergenero) {

            this.playerNome = playerNome;
            this.playergenero = playergenero;
            this.playerVida = 5;

        }
    public ArrayList<Object> getCombatentesMao() {
        return combatentesMao;
    }

    public void setCombatentesMao(ArrayList<Object> combatentesMao) {
        this.combatentesMao = combatentesMao;
    }

    public ArrayList<Object> getEquipamentosMao() {
        return equipamentosMao;
    }

    public void setEquipamentosMao(ArrayList<Object> equipamentosMao) {
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

