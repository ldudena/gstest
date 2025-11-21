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
        String teoriaJavaIni = "--- FUNDAMENTOS DO JAVA ---\n" +
                "O Java é uma linguagem fortemente tipada e Orientada a Objetos.\n" +
                "1. Variáveis: São espaços na memória. Ex: int idade = 20;\n" +
                "2. Tipos Primitivos: int (inteiro), double (decimal), boolean (verdadeiro/falso), char (caractere).\n" +
                "3. Estruturas de Controle: if/else tomam decisões e for/while fazem repetições.\n" +
                "4. Método Main: public static void main(String[] args) é onde tudo começa.";

        Curso javaIni = new Curso("Java", "Iniciante", teoriaJavaIni);

        javaIni.adicionarQuestao(new Questao("Qual método é o ponto de partida de um programa Java?",
                "A) start()", "B) main()", "C) init()", "D) run()", 'B'));
        javaIni.adicionarQuestao(new Questao("Qual tipo de variável armazena números decimais?",
                "A) int", "B) String", "C) boolean", "D) double", 'D'));
        javaIni.adicionarQuestao(new Questao("O que o comando 'if' faz?",
                "A) Repete um bloco", "B) Define uma classe", "C) Toma uma decisão baseada em condição", "D) Termina o programa", 'C'));

        bibliotecaCursos.add(javaIni);


        // Java Intermediário
        String teoriaJavaMed = "--- ORIENTAÇÃO A OBJETOS (POO) ---\n" +
                "A POO baseia-se em Classes (moldes) e Objetos (criações).\n" +
                "1. Encapsulamento: Proteger dados com 'private' e acessá-los via Getters/Setters.\n" +
                "2. Construtor: Um método especial com o mesmo nome da classe, usado para inicializar objetos.\n" +
                "3. Herança: Uma classe 'Filha' herda atributos e métodos da classe 'Mãe' usando 'extends'.";

        Curso javaMed = new Curso("Java", "Intermediário", teoriaJavaMed);

        javaMed.adicionarQuestao(new Questao("Para que serve o encapsulamento?",
                "A) Para deixar o código mais rápido", "B) Para proteger os atributos da classe", "C) Para criar loops", "D) Para deletar arquivos", 'B'));
        javaMed.adicionarQuestao(new Questao("Qual palavra-chave é usada para Herança?",
                "A) implements", "B) inherits", "C) extends", "D) super", 'C'));
        javaMed.adicionarQuestao(new Questao("O que é um Objeto?",
                "A) Uma instância de uma classe", "B) Um erro de compilação", "C) Um tipo primitivo", "D) Um arquivo de texto", 'A'));

        bibliotecaCursos.add(javaMed);


        // Java Avançado
        String teoriaJavaAdv = "--- JAVA AVANÇADO E COLLECTIONS ---\n" +
                "1. Polimorfismo: Capacidade de um objeto ser referenciado de várias formas.\n" +
                "2. Interfaces: Contratos que definem métodos que uma classe DEVE implementar.\n" +
                "3. Collections: ArrayList e HashMap são estruturas dinâmicas para guardar listas de dados.\n" +
                "4. Exceções: Try/Catch é usado para tratar erros e evitar que o programa feche inesperadamente.";

        Curso javaAdv = new Curso("Java", "Avançado", teoriaJavaAdv);

        javaAdv.adicionarQuestao(new Questao("Qual estrutura armazena pares de Chave e Valor?",
                "A) ArrayList", "B) Array simples", "C) HashMap", "D) String", 'C'));
        javaAdv.adicionarQuestao(new Questao("O que o bloco 'try-catch' faz?",
                "A) Tenta conectar na internet", "B) Trata exceções (erros)", "C) Cria uma classe", "D) Compila o código", 'B'));
        javaAdv.adicionarQuestao(new Questao("Uma Interface em Java pode ter:",
                "A) Apenas assinaturas de métodos (contratos)", "B) Variáveis alteráveis", "C) Construtores", "D) Código completo", 'A'));

        bibliotecaCursos.add(javaAdv);

        // IA Iniciante
        String teoriaIaIni = "--- INTRODUÇÃO À IA ---\n" +
                "Inteligência Artificial é a simulação de processos de inteligência humana por máquinas.\n" +
                "1. IA Fraca (Narrow AI): Especialista em uma tarefa (ex: Xadrez, Filtro de Spam).\n" +
                "2. IA Forte (AGI): Teria consciência e inteligência geral igual ou superior à humana (ainda teórica).\n" +
                "3. Teste de Turing: Proposto por Alan Turing para testar se uma máquina consegue se passar por humano.";

        Curso iaIni = new Curso("IA", "Iniciante", teoriaIaIni);

        iaIni.adicionarQuestao(new Questao("O que é 'IA Fraca'?",
                "A) Uma IA que não funciona", "B) IA especialista em uma tarefa específica", "C) Um robô sem bateria", "D) A internet lenta", 'B'));
        iaIni.adicionarQuestao(new Questao("Quem propôs o famoso teste de inteligência de máquinas?",
                "A) Elon Musk", "B) Alan Turing", "C) Bill Gates", "D) Steve Jobs", 'B'));
        iaIni.adicionarQuestao(new Questao("Qual destas é uma IA do dia a dia?",
                "A) Exterminador do Futuro", "B) Recomendação da Netflix", "C) Um martelo", "D) Um caderno", 'B'));

        bibliotecaCursos.add(iaIni);


        // IA Intermediário
        String teoriaIaMed = "--- MACHINE LEARNING (APRENDIZADO DE MÁQUINA) ---\n" +
                "É o subcampo da IA onde computadores aprendem sem serem explicitamente programados.\n" +
                "1. Aprendizado Supervisionado: O modelo treina com dados rotulados (entrada -> saída correta).\n" +
                "2. Aprendizado Não-Supervisionado: O modelo busca padrões em dados não rotulados (agrupamento).\n" +
                "3. Redes Neurais: Inspiradas nos neurônios biológicos, usadas para tarefas complexas.";

        Curso iaMed = new Curso("IA", "Intermediário", teoriaIaMed);

        iaMed.adicionarQuestao(new Questao("No aprendizado supervisionado, nós fornecemos:",
                "A) Apenas perguntas", "B) Dados rotulados (Perguntas e Respostas)", "C) Nenhum dado", "D) Apenas regras", 'B'));
        iaMed.adicionarQuestao(new Questao("Redes Neurais Artificiais são inspiradas em quê?",
                "A) No sistema solar", "B) No cérebro biológico", "C) Em árvores", "D) Na internet", 'B'));
        iaMed.adicionarQuestao(new Questao("Qual o objetivo do Machine Learning?",
                "A) Aprender padrões a partir de dados", "B) Criar peças mecânicas", "C) Consertar impressoras", "D) Formatar PCs", 'A'));

        bibliotecaCursos.add(iaMed);


        // IA Avançado
        String teoriaIaAdv = "--- DEEP LEARNING E ÉTICA ---\n" +
                "1. Deep Learning: Usa redes neurais profundas (muitas camadas) para visão computacional e NLP.\n" +
                "2. IA Generativa (GenAI): Cria novos conteúdos (texto, imagem, código). Ex: ChatGPT, Midjourney.\n" +
                "3. Ética na IA: Preocupação com Vieses (preconceitos nos dados), Alucinações (respostas falsas) e Privacidade.";

        Curso iaAdv = new Curso("IA", "Avançado", teoriaIaAdv);

        iaAdv.adicionarQuestao(new Questao("O que é um 'Viés' (Bias) em IA?",
                "A) Um cabo desconectado", "B) Preconceito refletido nos dados de treinamento", "C) Um vírus", "D) Velocidade rápida", 'B'));
        iaAdv.adicionarQuestao(new Questao("O que a IA Generativa faz?",
                "A) Apenas classifica imagens", "B) Cria novos conteúdos (texto, imagem)", "C) Copia arquivos", "D) Deleta dados", 'B'));
        iaAdv.adicionarQuestao(new Questao("Deep Learning é caracterizado por:",
                "A) Redes Neurais com muitas camadas (profundas)", "B) Poucos dados", "C) Lógica simples if/else", "D) Processadores antigos", 'A'));

        bibliotecaCursos.add(iaAdv);

        // IE Iniciante
        String teoriaIeIni = "--- FUNDAMENTOS DA IE ---\n" +
                "Inteligência Emocional é a capacidade de reconhecer e gerir as próprias emoções e as dos outros.\n" +
                "1. Autoconsciência: Saber o que você está sentindo no momento.\n" +
                "2. Sequestro da Amígdala: Quando uma emoção forte (medo/raiva) bloqueia o pensamento racional.\n" +
                "3. Pausa: A ferramenta essencial. Parar antes de reagir.";

        Curso ieIni = new Curso("Emocional", "Iniciante", teoriaIeIni);

        ieIni.adicionarQuestao(new Questao("O que é Autoconsciência?",
                "A) Ignorar sentimentos", "B) Reconhecer suas próprias emoções", "C) Controlar os outros", "D) Estudar matemática", 'B'));
        ieIni.adicionarQuestao(new Questao("O 'Sequestro da Amígdala' causa:",
                "A) Reações racionais e calmas", "B) Reações impulsivas e emocionais", "C) Sono profundo", "D) Fome", 'B'));
        ieIni.adicionarQuestao(new Questao("Qual o primeiro passo ao sentir muita raiva?",
                "A) Gritar", "B) Fazer uma pausa e respirar", "C) Enviar e-mail imediato", "D) Quebrar algo", 'B'));

        bibliotecaCursos.add(ieIni);


        // IE Intermediário
        String teoriaIeMed = "--- HABILIDADES SOCIAIS E EMPATIA ---\n" +
                "Não vivemos sozinhos. Precisamos entender o outro.\n" +
                "1. Empatia: Tentar compreender a perspectiva do outro (calçar os sapatos dele).\n" +
                "2. Escuta Ativa: Ouvir para entender, não apenas para responder. Focar totalmente no interlocutor.\n" +
                "3. Comunicação Não-Verbal: Postura, tom de voz e olhar comunicam mais que palavras.";

        Curso ieMed = new Curso("Emocional", "Intermediário", teoriaIeMed);

        ieMed.adicionarQuestao(new Questao("O que caracteriza a Escuta Ativa?",
                "A) Mexer no celular enquanto ouve", "B) Focar totalmente no falante sem julgar", "C) Interromper o tempo todo", "D) Pensar na resposta", 'B'));
        ieMed.adicionarQuestao(new Questao("A comunicação não-verbal inclui:",
                "A) Apenas palavras escritas", "B) Tom de voz e linguagem corporal", "C) E-mails", "D) Código Java", 'B'));
        ieMed.adicionarQuestao(new Questao("Empatia é:",
                "A) Ter pena de alguém", "B) Compreender a perspectiva do outro", "C) Concordar com tudo", "D) Ser indiferente", 'B'));

        bibliotecaCursos.add(ieMed);


        // IE Avançado
        String teoriaIeAdv = "--- GESTÃO E LIDERANÇA ---\n" +
                "Aplicando IE no ambiente de trabalho e liderança.\n" +
                "1. Resiliência: Capacidade de se adaptar e recuperar após adversidades ou estresse.\n" +
                "2. Feedback Construtivo: Focar no comportamento e melhoria, não na pessoa.\n" +
                "3. Gestão de Conflitos: Buscar soluções 'ganha-ganha' através do diálogo aberto.";

        Curso ieAdv = new Curso("Emocional", "Avançado", teoriaIeAdv);

        ieAdv.adicionarQuestao(new Questao("O que é Resiliência?",
                "A) Nunca cair", "B) Capacidade de recuperação após dificuldades", "C) Ser rígido", "D) Evitar problemas", 'B'));
        ieAdv.adicionarQuestao(new Questao("Um bom Feedback deve focar em:",
                "A) Atacar a personalidade da pessoa", "B) Comportamentos e pontos de melhoria", "C) Fofocas", "D) Elogios falsos", 'B'));
        ieAdv.adicionarQuestao(new Questao("Na gestão de conflitos, devemos buscar:",
                "A) Vencer a discussão", "B) Uma solução onde todos ganham (ganha-ganha)", "C) Ignorar o problema", "D) Demitir todos", 'B'));

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
            System.out.println("A) " + q.getAlternativeA());
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