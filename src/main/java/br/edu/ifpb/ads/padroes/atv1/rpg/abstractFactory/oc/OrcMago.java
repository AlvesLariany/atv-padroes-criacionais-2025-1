package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.oc;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public class OrcMago implements PersonagemAF {
    @Override
    public String getNome() {
        return "Orc Mago";
    }

    @Override
    public RacaPersonagem getRaca() {
        return RacaPersonagem.ORC;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.MAGO;
    }

    @Override
    public int getForca() {
        return 10;
    }

    @Override
    public int getInteligencia() {
        return 14;
    }

    @Override
    public int getAgilidade() {
        return 6;
    }

    @Override
    public int getVida() {
        return 100;
    }

    @Override
    public int obterMana() {
        return 120;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Cajada Tribal", 12, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Xamânicas", 6, "leve");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Magia Sombria", "Invocação"};
    }
}

//  forca = 10;
//                inteligencia = 14;
//                agilidade = 6;
//                vida = 100;
//                mana = 120;
//                arma = new Arma("Cajado Tribal", 12, "Cajado");
//                armadura = new Armadura("Vestes Xamânicas", 6, "Leve");
//                habilidades = new String[]{"Magia Sombria", "Invocação"};