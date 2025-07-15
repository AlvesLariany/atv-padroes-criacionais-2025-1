package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;


public interface PersonagemFactory {
    Personagem criar(String nome);


}
