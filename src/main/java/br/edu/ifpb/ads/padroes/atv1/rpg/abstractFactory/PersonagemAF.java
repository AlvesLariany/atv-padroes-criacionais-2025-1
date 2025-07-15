package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.enums.RacaPersonagem;

public interface PersonagemAF {
     String getNome();
     RacaPersonagem getRaca();
     ClassePersonagem getClasse();
     int getForca();
     int getInteligencia();
     int getAgilidade();
     int getVida();
     int obterMana();
     Arma criarArma();
     Armadura criarArmadura();
     String[] getHabilidades();

}
