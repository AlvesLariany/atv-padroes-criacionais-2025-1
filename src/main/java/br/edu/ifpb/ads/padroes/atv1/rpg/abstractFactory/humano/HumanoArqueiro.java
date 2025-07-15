package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public class HumanoArqueiro implements PersonagemAF {
    @Override
    public String getNome() {
        return "Humano Arqueiro";
    }

    @Override
    public RacaPersonagem getRaca() {
        return RacaPersonagem.HUMANO;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.ARQUEIRO;
    }

    @Override
    public int getForca() {
        return 10;
    }

    @Override
    public int getInteligencia() {
        return 12;
    }

    @Override
    public int getAgilidade() {
        return 16;
    }

    @Override
    public int getVida() {
        return 100;
    }

    @Override
    public int obterMana() {
        return 70;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12,"Média");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Tiro Certeiro", "Chuva de Flechas"};
    }
}
//  forca = 10;
//                inteligencia = 12;
//                agilidade = 16;
//                vida = 100;
//                mana = 70;
//                arma = new Arma("Arco Élfico", 20, "Arco");
//                armadura = new Armadura("Armadura de Couro", 12, "Média");
//                habilidades = new String[]{"Tiro Certeiro", "Chuva de Flechas"}