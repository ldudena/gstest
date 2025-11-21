package entities;

import java.util.ArrayList;

public class Curso {
    private String tema;
    private String nivel;
    private String conteudoTeorico;
    private ArrayList<Questao> listaQuestoes;

    public Curso(String tema, String nivel, String conteudoTeorico) {
        this.tema = tema;
        this.nivel = nivel;
        this.conteudoTeorico = conteudoTeorico;
        this.listaQuestoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao q) {
        this.listaQuestoes.add(q);
    }


    public String getTema() { return tema; }
    public String getNivel() { return nivel; }
    public String getConteudoTeorico() { return conteudoTeorico; }
    public ArrayList<Questao> getListaQuestoes() { return listaQuestoes; }

    public void setTema(String tema) { this.tema = tema; }
    public void setConteudoTeorico(String conteudoTeorico) { this.conteudoTeorico = conteudoTeorico; }

    public void setNivel(String s) {
    }
}