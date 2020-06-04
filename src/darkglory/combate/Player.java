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

        public Player(String playerNome, String playergenero) {

            this.playerNome = playerNome;
            this.playergenero = playergenero;
            this.playerVida = 5;

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

