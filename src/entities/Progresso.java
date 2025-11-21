package entities;

public class Progresso {
    private Aluno aluno;
    private Curso curso;
    private int pontuacao;

    public Progresso(Aluno aluno, Curso curso, int pontuacao) {
        this.aluno = aluno;
        this.curso = curso;
        this.pontuacao = pontuacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}