package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.oc;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public class OrcArqueiro implements PersonagemAF {
    @Override
    public String getNome() {
        return "Orc Arqueiro";
    }

    @Override
    public RacaPersonagem getRaca() {
        return RacaPersonagem.ORC;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.ARQUEIRO;
    }

    @Override
    public int getForca() {
        return 14;
    }

    @Override
    public int getInteligencia() {
        return 8;
    }

    @Override
    public int getAgilidade() {
        return 12;
    }

    @Override
    public int getVida() {
        return 120;
    }

    @Override
    public int obterMana() {
        return 40;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Arco de Osso", 24,"Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Couro de Besta", 16, "Média");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Tiro Brutal", "Intimidação"};
    }
}
// forca = 14;
//                inteligencia = 8;
//                agilidade = 12;
//                vida = 120;
//                mana = 40;
//                arma = new Arma("Arco de Osso", 24, "Arco");
//                armadura = new Armadura("Couro de Besta", 16, "Média");
//                habilidades = new String[]{"Tiro Brutal", "Intimidação"};