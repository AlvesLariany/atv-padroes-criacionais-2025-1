package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public class ElfoMago implements PersonagemAF {

    @Override
    public String getNome() {
        return "Elfo Mago";
    }

    @Override
    public RacaPersonagem getRaca() {
        return RacaPersonagem.ELFO;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.MAGO;
    }

    @Override
    public int getForca() {
        return 4;
    }

    @Override
    public int getInteligencia() {
        return 20;
    }

    @Override
    public int getAgilidade() {
        return 14;
    }

    @Override
    public int getVida() {
        return 70;
    }

    @Override
    public int obterMana() {
        return 180;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Cajada da Natureza", 18, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Mantos Élficos", 10, "Leve");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Magia da natureza", "Teleporte"};
    }
}
// else if (classe.equals("Mago")) {
//                forca = 4;
//                inteligencia = 20;
//                agilidade = 14;
//                vida = 70;
//                mana = 180;
//                arma = new Arma("Cajado da Natureza", 18, "Cajado");
//                armadura = new Armadura("Mantos Élficos", 10, "Leve");
//                habilidades = new String[]{"Magia da Natureza", "Teleporte"};