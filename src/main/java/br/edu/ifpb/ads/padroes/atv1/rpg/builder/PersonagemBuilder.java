package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public class PersonagemBuilder {
    private String nome;
    private RacaPersonagem raca;
    private ClassePersonagem classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    //métodos que irão servir para "personalizar" o personagem
    public PersonagemBuilder comNome(String nome){
        this.nome=nome;
        return this;
    }

    public PersonagemBuilder comRaca(RacaPersonagem raca){
        this.raca=raca;
        return this;
    }

    public PersonagemBuilder comClasse(ClassePersonagem classe){
        this.classe=classe;
        return this;
    }

    public PersonagemBuilder comCaracterisiticas(int forca, int inteligencia, int agilidade, int vida, int mana){
        this.forca=forca;
        this.inteligencia=inteligencia;
        this.agilidade=agilidade;
        this.vida=vida;
        this.mana=mana;
        return this;
    }

    public PersonagemBuilder comArmamento(Arma arma,  Armadura armadura){
        this.arma=arma;
        this.armadura=armadura;
        return this;
    }

    public PersonagemBuilder comHabilidades(String [] habilidades){
        this.habilidades=habilidades;
        return this;
    }

    public Personagem build(){
        return  new Personagem(
                nome,raca,classe,forca, inteligencia,agilidade,vida,mana,arma,armadura,habilidades);
    }


}
