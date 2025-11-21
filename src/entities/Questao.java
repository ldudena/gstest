package entities;

public class Questao {
    private String enunciado;
    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private char correta;


    public Questao(String enunciado, String a, String b, String c, String d, char correta) {
        this.enunciado = enunciado;
        this.alternativaA = a;
        this.alternativaB = b;
        this.alternativaC = c;
        this.alternativaD = d;
        this.correta = correta;
    }


    public String getEnunciado() { return enunciado; }
    public String getAlternativeA() { return alternativaA; }
    public String getAlternativaB() { return alternativaB; }
    public String getAlternativaC() { return alternativaC; }
    public String getAlternativaD() { return alternativaD; }
    public char getCorreta() { return correta; }


    public void setEnunciado(String enunciado) { this.enunciado = enunciado; }

    public void setAlternativaA(String altA) {
    }

    public void setAlternativaB(String altB) {
    }

    public void setAlternativaC(String s) {
    }

    public void setAlternativaD(String s) {
    }

    public void setCorreta(char a) {
    }
}