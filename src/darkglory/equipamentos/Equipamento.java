/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkglory.equipamentos;

import java.util.Random;

/**
 *
 * @author victo
 */
public class Equipamento {

    public Random random = new Random();

    int id;
    String nome;
    int danoAdicional;
    int vidaAdicional;
    int defesaAdicional;
    String Tipo;
    String Descricao;

    public Equipamento(int id, String nome, int vidaA, int danoA, int defesaA, String tipo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.danoAdicional = danoA;
        this.vidaAdicional = vidaA;
        this.defesaAdicional = defesaA;
        this.Tipo = tipo;
        this.Descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }

    public void setDanoAdicional(int danoAdicional) {
        this.danoAdicional = danoAdicional;
    }

    public int getVidaAdicional() {
        return vidaAdicional;
    }

    public void setVidaAdicional(int vidaAdicional) {
        this.vidaAdicional = vidaAdicional;
    }

    public int getDefesaAdicional() {
        return defesaAdicional;
    }

    public void setDefesaAdicional(int defesaAdicional) {
        this.defesaAdicional = defesaAdicional;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

}
