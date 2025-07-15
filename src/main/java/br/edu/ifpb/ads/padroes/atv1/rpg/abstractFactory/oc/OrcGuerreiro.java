package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.oc;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public class OrcGuerreiro implements PersonagemAF {
    @Override
    public String getNome() {
        return "Orc Guerreiro";
    }

    @Override
    public RacaPersonagem getRaca() {
        return RacaPersonagem.ORC;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.GUERREIRO;
    }

    @Override
    public int getForca() {
        return 20;
    }

    @Override
    public int getInteligencia() {
        return 6;
    }

    @Override
    public int getAgilidade() {
        return 8;
    }

    @Override
    public int getVida() {
        return 150;
    }

    @Override
    public int obterMana() {
        return 20;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Fúria ", "Pancada devastadora"};
    }
}


// forca = 20;
//                inteligencia = 6;
//                agilidade = 8;
//                vida = 150;
//                mana = 20;
//                arma = new Arma("Machado de Guerra", 30, "Machado");
//                armadura = new Armadura("Armadura Brutal", 25, "Pesada");
//                habilidades = new String[]{"Fúria", "Pancada Devastadora"};