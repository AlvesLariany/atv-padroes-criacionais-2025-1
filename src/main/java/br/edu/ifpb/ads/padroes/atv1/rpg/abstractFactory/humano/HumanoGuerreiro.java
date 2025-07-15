package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public class HumanoGuerreiro implements PersonagemAF {
    @Override
    public String getNome() {
        return "Humano Guerreiro";
    }

    @Override
    public RacaPersonagem getRaca() {
        return RacaPersonagem.HUMANO;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.GUERREIRO;
    }

    @Override
    public int getForca() {
        return 15;
    }

    @Override
    public int getInteligencia() {
        return 8;
    }

    @Override
    public int getAgilidade() {
        return 10;
    }

    @Override
    public int getVida() {
        return 120;
    }

    @Override
    public int obterMana() {
        return 3;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Espada de Ferro",25,"Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de placas", 20, "Pesada");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Investida", "Bloqueio"};
    }
}
// if (raca.equals("Humano")) {
//            if (classe.equals("Guerreiro")) {
//                forca = 15;
//                inteligencia = 8;
//                agilidade = 10;
//                vida = 120;
//                mana = 30;
//
//                arma = new Arma("Espada de Ferro", 25, "Espada");
//                armadura = new Armadura("Armadura de Placas", 20, "Pesada");
//                habilidades = new String[]{"Investida", "Bloqueio"};