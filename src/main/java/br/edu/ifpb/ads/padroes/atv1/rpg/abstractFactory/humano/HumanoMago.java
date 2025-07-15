package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public class HumanoMago implements PersonagemAF {
    @Override
    public String getNome() {
        return "Humano Mago";
    }

    @Override
    public RacaPersonagem getRaca() {
        return RacaPersonagem.HUMANO;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.MAGO;
    }

    @Override
    public int getForca() {
        return 6   ;
    }

    @Override
    public int getInteligencia() {
        return 18;
    }

    @Override
    public int getAgilidade() {
        return 8;
    }

    @Override
    public int getVida() {
        return 80;
    }

    @Override
    public int obterMana() {
        return 150;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Bola de fogo", "Cura"};
    }
}
// forca = 6;
//                inteligencia = 18;
//                agilidade = 8;
//                vida = 80;
//                mana = 150;
//                arma = new Arma("Cajado Mágico", 15, "Cajado");
//                armadura = new Armadura("Vestes Mágicas", 8, "Leve");
//                habilidades = new String[]{"Bola de Fogo", "Cura"};