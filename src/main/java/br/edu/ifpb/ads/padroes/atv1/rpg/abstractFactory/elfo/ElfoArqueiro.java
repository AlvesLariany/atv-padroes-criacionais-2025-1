package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.elfo;


import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

// else if (classe.equals("Arqueiro")) {
//                forca = 8;
//                inteligencia = 16;
//                agilidade = 20;
//                vida = 90;
//                mana = 100;
//                arma = new Arma("Arco Longo Élfico", 28, "Arco");
//                armadura = new Armadura("Armadura de Couro Élfico", 14, "Média");
//                habilidades = new String[]{"Tiro Múltiplo", "Camuflagem"};
//            }
public class ElfoArqueiro implements PersonagemAF {

    public String getNome(){
        return " Elfo arqueiro";
    }

    public RacaPersonagem getRaca(){
        return RacaPersonagem.ELFO;
    }

    @Override
    public ClassePersonagem getClasse() {
        return ClassePersonagem.ARQUEIRO;
    }

    @Override
    public int getForca() {
        return 8;
    }

    @Override
    public int getInteligencia() {
        return 16;
    }

    @Override
    public int getAgilidade() {
        return 20;
    }

    @Override
    public int getVida() {
        return 90;
    }

    @Override
    public int obterMana() {
        return 100;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Arco Longo ÉLfico", 28, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura Couro Élfico", 14, "Média");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Tiro Múltiplo", "Camuflagem"};
    }
}
