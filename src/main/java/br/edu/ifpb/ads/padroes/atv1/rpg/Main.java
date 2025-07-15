package br.edu.ifpb.ads.padroes.atv1.rpg;


import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod.elfo.ElfoMagoFM;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod.humano.HumanoGuerreiroFM;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod.orc.OrcArqueiroFM;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.PersonagemPrototype;


public class Main {
    public static void main(String[] args) {

        Personagem guerreiro = new HumanoGuerreiroFM().criar("Humano Teste");
        Personagem magoElfo = new ElfoMagoFM().criar("Elfo Teste");
        Personagem arqueiroOrc = new OrcArqueiroFM().criar("Orc Teste");


        PersonagemPrototype.registrar("humandoGuerreiro", guerreiro);
        PersonagemPrototype.registrar("elfoMago", magoElfo);
        PersonagemPrototype.registrar("OrcArqueiro", arqueiroOrc);


        Personagem clone1 = PersonagemPrototype.clonar("humandoGuerreiro");

        System.out.println("Conheça os personagens: ");
        System.out.println(guerreiro);
        System.out.println(magoElfo);
        System.out.println(arqueiroOrc);

    }}