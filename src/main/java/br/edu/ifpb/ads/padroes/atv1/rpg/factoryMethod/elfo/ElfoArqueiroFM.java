package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod.elfo;


import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod.PersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.elfo.ElfoArqueiro;

public class ElfoArqueiroFM implements PersonagemFactory {
    @Override
    public Personagem criar(String nome) {
        var factory = new ElfoArqueiro();
        return new PersonagemBuilder()
                .comNome(nome)
                .comRaca(factory.getRaca())
                .comClasse(factory.getClasse())
                .comCaracterisiticas(factory.getForca(), factory.getInteligencia(), factory.getAgilidade(), factory.getVida(), factory.obterMana())
                .comArmamento(factory.criarArma(), factory.criarArmadura())
                .comHabilidades(factory.getHabilidades())
                .build();
    }
    }

