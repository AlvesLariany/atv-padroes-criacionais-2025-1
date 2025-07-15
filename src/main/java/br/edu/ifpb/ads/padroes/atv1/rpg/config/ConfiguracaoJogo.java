package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public class ConfiguracaoJogo {
    private static  ConfiguracaoJogo instancia;
    private int nivelDificuldade;

    private ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }


    //Singleton
    public static ConfiguracaoJogo getInstance(){
        if(instancia==null){
            instancia= new ConfiguracaoJogo();
        }
        return  instancia;
    }

    //Os getters e setters são mantidos
    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }

}
