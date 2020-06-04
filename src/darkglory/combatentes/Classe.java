/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.combatentes;

import java.util.Random;

/**
 *
 * @author victo
 */
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
        this.vida = 30;
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
        System.out.println(this.nome);
        int ataque_total = (dano + (random.nextInt(20)));
        System.out.println("Dano: " + ataque_total);
        return ataque_total;
    }
    
    public int defender() {
        int defesaT = (defesa + (random.nextInt(15)));
        System.out.println(this.nome + " defende com: " + defesaT);
        return defesaT;
    }
    
    public void recAtaque() {
        int defesaT = defender();
        if (dano < defesaT) {
            System.out.println(this.nome + " com " + defesaT + " de defesa total, se defendeu do ataque! ");
        } else {
            dano -= defesaT;
            if (dano > vida) {
                System.out.println(this.nome + " recebeu " + dano + "de dano ");
                System.out.println(this.nome + " foi derrotado(a)");
                vida = 0;
            } else {
                System.out.println(this.nome + " recebeu " + dano + "de dano ");
                vida -= dano;
            }
        }
    }

    public boolean seMorto() {
        return this.vida == 0;
    }

    public boolean seVivo() {
        return this.vida > 0;
    }
}
