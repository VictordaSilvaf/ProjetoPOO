package darkglory.combate;

import java.util.Random;
import java.util.Set;

public class Funcoes {
    public Set<Integer> gerarNumAleatorio(int tamanho, Set<Integer> numeros, int qtd) {
        Random random = new Random();

        while (numeros.size() < tamanho) {
            numeros.add(random.nextInt(qtd));
        }
        return numeros;
    }
}
