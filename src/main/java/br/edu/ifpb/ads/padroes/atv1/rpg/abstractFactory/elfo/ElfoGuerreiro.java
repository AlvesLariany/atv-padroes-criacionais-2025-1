package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.elfo;


import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

//if (classe.equals("Guerreiro")) {
//                forca = 12;
//                inteligencia = 14;
//                agilidade = 16;
//                vida = 100;
//                mana = 60;
//                arma = new Arma("Lâmina Élfica", 22, "Espada");
//                armadura = new Armadura("Cota de Malha Élfica", 15, "Média");
//                habilidades = new String[]{"Dança das Lâminas", "Agilidade Élfica"};
public class ElfoGuerreiro implements PersonagemAF {

    @Override
    public String getNome() {
        return "Elfo Guerreiro";
    }

    @Override
    public RacaPersonagem getRaca() {
        return RacaPersonagem.ELFO;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.GUERREIRO;
    }

    @Override
    public int getForca() {
        return 12;
    }

    @Override
    public int getInteligencia() {
        return 14;
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
        return 60;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Lâmina Élfica",22,"Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Cota de Malha Élfica", 15, "Média");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Dança das lâminas", "Agilidade élfica"};
    }
}
