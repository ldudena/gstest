package services;

import entities.Aluno;
import entities.Curso;
import entities.Questao;

import java.util.ArrayList;
import java.util.Scanner;

public class PlataformaService {


    private ArrayList<Curso> bibliotecaCursos = new ArrayList<>();

    public void inicializarDados() {

        // Java Iniciante
        Curso javaIni = new Curso("Java", "Iniciante",
                "Teoria: Java é uma linguagem orientada a objetos. O método main é o ponto de partida.");
        javaIni.adicionarQuestao(new Questao("O que é o método main?",
                "A) Uma variável", "B) O ponto de início do programa", "C) Uma classe", "D) Um erro", 'B'));
        javaIni.adicionarQuestao(new Questao("Qual comando imprime no console?",
                "A) System.out.println", "B) print.console", "C) echo", "D) write", 'A'));
        bibliotecaCursos.add(javaIni);

        // Java Intermediario
        Curso javaMed = new Curso("Java", "Intermediário",
                "Teoria: Classes possuem atributos e métodos. Objetos são instâncias de classes.");
        javaMed.adicionarQuestao(new Questao("O que é um Objeto?",
                "A) Um código fonte", "B) Uma instância de uma classe", "C) Um loop", "D) Um primitivo", 'B'));
        bibliotecaCursos.add(javaMed);

        // Java Avancado
        Curso javaAdv = new Curso("Java", "Avançado",
                "Teoria: Polimorfismo e Herança permitem reutilizar código e mudar comportamentos.");
        javaAdv.adicionarQuestao(new Questao("extends é usado para:",
                "A) Herança", "B) Loop", "C) Importar", "D) Excluir", 'A'));
        bibliotecaCursos.add(javaAdv);

        //  Ia iniciante
        Curso iaIni = new Curso("IA", "Iniciante",
                "Teoria: IA é a simulação de processos de inteligência humana por máquinas.");
        iaIni.adicionarQuestao(new Questao("O que significa IA?",
                "A) Internet Alta", "B) Inteligência Artificial", "C) Inovação Atual", "D) Nenhuma", 'B'));
        bibliotecaCursos.add(iaIni);

        // Ia Intermediario
        Curso iaMed = new Curso("IA", "Intermediário",
                "Teoria: Machine Learning (Aprendizado de Máquina) permite que sistemas aprendam com dados sem serem explicitamente programados.");
        iaMed.adicionarQuestao(new Questao("Qual é o principal objetivo do Machine Learning?",
                "A) Criar robôs físicos", "B) Aprender padrões com dados", "C) formatar computadores", "D) Jogar xadrez apenas", 'B'));
        iaMed.adicionarQuestao(new Questao("O que é um conjunto de treinamento?",
                "A) Dados usados para ensinar o modelo", "B) Roupas de ginástica", "C) O resultado final", "D) Um erro de código", 'A'));
        bibliotecaCursos.add(iaMed);

        // Ia avancado
        Curso iaAdv = new Curso("IA", "Avançado",
                "Teoria: Deep Learning usa Redes Neurais artificiais com muitas camadas para resolver problemas complexos como visão computacional.");
        iaAdv.adicionarQuestao(new Questao("Deep Learning é uma subárea de:",
                "A) Machine Learning", "B) Web Design", "C) Redes de Computadores", "D) Banco de Dados", 'A'));
        iaAdv.adicionarQuestao(new Questao("O que as Redes Neurais tentam imitar?",
                "A) O sistema digestivo", "B) O cérebro humano", "C) O fluxo de rios", "D) Estruturas de prédios", 'B'));
        bibliotecaCursos.add(iaAdv);

        // Ie Iniciante
        Curso ieIni = new Curso("Emocional", "Iniciante",
                "Teoria: Autoconsciência é a base da Inteligência Emocional. É a capacidade de reconhecer seus próprios sentimentos.");
        ieIni.adicionarQuestao(new Questao("O que é autoconsciência?",
                "A) Saber matemática", "B) Reconhecer suas próprias emoções", "C) Ignorar sentimentos", "D) Dormir bem", 'B'));
        ieIni.adicionarQuestao(new Questao("Qual é o primeiro passo para gerir emoções?",
                "A) Gritar", "B) Identificá-las", "C) Escondê-las", "D) Culpar os outros", 'B'));
        bibliotecaCursos.add(ieIni);

        // Ie Intermediario
        Curso ieMed = new Curso("Emocional", "Intermediário",
                "Teoria: Empatia é a capacidade de se colocar no lugar do outro e compreender seus sentimentos e perspectivas.");
        ieMed.adicionarQuestao(new Questao("Empatia significa:",
                "A) Ter pena de alguém", "B) Concordar com tudo", "C) Compreender o sentimento do outro", "D) Ser apático", 'C'));
        ieMed.adicionarQuestao(new Questao("Escuta ativa ajuda em:",
                "A) Melhorar relacionamentos", "B) Falar mais alto", "C) Ganhar discussões", "D) Ignorar problemas", 'A'));
        bibliotecaCursos.add(ieMed);

        // Ie Avancado
        Curso ieAdv = new Curso("Emocional", "Avançado",
                "Teoria: Gestão de Relacionamentos envolve liderança, gestão de conflitos e trabalho em equipe harmonioso.");
        ieAdv.adicionarQuestao(new Questao("Um bom líder deve:",
                "A) Dar ordens apenas", "B) Inspirar e motivar a equipe", "C) Evitar contato", "D) Fazer tudo sozinho", 'B'));
        ieAdv.adicionarQuestao(new Questao("Como resolver conflitos de forma inteligente?",
                "A) Com diálogo e negociação", "B) Impondo sua vontade", "C) Ignorando a outra parte", "D) Via e-mail agressivo", 'A'));
        bibliotecaCursos.add(ieAdv);
    }


    public Curso buscarCurso(String temaEscolhido, String nivelEscolhido) {
        for (Curso curso : bibliotecaCursos) {
            if (curso.getTema().equals(temaEscolhido) &&
                    curso.getNivel().equals(nivelEscolhido)) {
                return curso;
            }
        }
        return null;
    }


    public void estudarTeoria(Curso curso) {
        System.out.println("--- ESTUDANDO: " + curso.getTema() + " (" + curso.getNivel() + ") ---");
        System.out.println(curso.getConteudoTeorico());
        System.out.println("---------------------------------------------------");
        System.out.println("Pressione ENTER para voltar...");
        new Scanner(System.in).nextLine();
    }



    public void fazerAtividade(Scanner scanner, Curso curso, Aluno aluno) {
        System.out.println("--- ATIVIDADE: " + curso.getTema() + " ---");
        int acertos = 0;

        ArrayList<Questao> questoes = curso.getListaQuestoes();

        for (Questao q : questoes) {
            System.out.println("PERGUNTA: " + q.getEnunciado());
            System.out.println("A) " + q.getAlternativaA());
            System.out.println("B) " + q.getAlternativaB());
            System.out.println("C) " + q.getAlternativaC());
            System.out.println("D) " + q.getAlternativaD());
            System.out.print("Sua resposta: ");


            String resposta = scanner.nextLine();

            String gabarito = q.getCorreta() + "";


            if (resposta.equals(gabarito)) {
                System.out.println("CERTO! (+10 pontos)\n");
                acertos++;
                aluno.adicionarPontos(10);
            } else {
                System.out.println("ERRADO! A correta era " + q.getCorreta() + "\n");
            }
        }

        System.out.println("FIM DO QUIZ! Você acertou " + acertos + " de " + questoes.size());
        System.out.println("Sua pontuação total agora é: " + aluno.getPontuacaoTotal());
    }
}