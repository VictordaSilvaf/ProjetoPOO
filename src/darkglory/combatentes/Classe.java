package darkglory.combatentes;

import java.util.Random;

public abstract class Classe {

    public Random random = new Random();

    int id;
    String nome;
    int dano;
    int vida;
    int defesa;
    String Tipo;

    public Classe(int id, String nome, int vida, int forca, int defesa, String tipo) {
        this.id = id;
        this.nome = nome;
        this.dano = forca;
        this.vida = vida;
        this.defesa = defesa;
        this.Tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    //--------------------------------------------------------------------------
    public int atacar() {
        int ataqueT = (dano + (random.nextInt(20)));
        System.out.println(this.nome + " atacou com " + ataqueT + " de dano.");
        return ataqueT;
    }

    public int defender() {
        int defesaT = (defesa + (random.nextInt(15)));
        System.out.println("Com a defesa total de "+defesaT);
        return defesaT;
    }

    public void receberAtaque(int dano) {
        int defesaT = defender();
        if (dano < defesaT) {
            System.out.println(this.nome + " com " + defesaT + " de defesa total, se defendeu do ataque! ");
            System.out.println("\n");
        } else {
            dano -= defesaT;
            if (dano > vida) {
                System.out.println(this.nome + " recebeu " + dano + " de dano ");
                System.out.println(this.nome + " foi derrotado");
                System.out.println("\n");
                vida = 0;
            } else {
                System.out.println(this.nome + " recebeu " + dano + " de dano, ficando com "+this.vida+" de vida");
                System.out.println("\n");
                vida -= dano;
            }
        }
    }

    public boolean seMorto() {
        return this.vida == 0;
    }
}
