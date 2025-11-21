import entities.Aluno;
import entities.Curso;
import entities.Progresso;
import entities.Questao;
import services.PlataformaService;
import utils.IOUtils;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlataformaService servico = new PlataformaService();

        servico.inicializarDados();


        System.out.println("BEM VINDO AO SISTEMA DE MINI-CURSOS FUTURIZA");
        System.out.print("Digite seu nome para começar: ");
        String nome = scanner.nextLine();
        Aluno aluno = new Aluno(nome);

        while (true) {
            System.out.println("\nOlá, " + aluno.getNome() + " | Pontos: " + aluno.getPontuacaoTotal());
            System.out.println("1 - Estudar (Teoria)");
            System.out.println("2 - Praticar (Atividade)");
            System.out.println("3 - Alterar meu nome");
            System.out.println("4 - Resetar minha pontuação");
            System.out.println("5 - Criar Quiz Personalizado");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = IOUtils.scanInt(scanner);

            if (opcao == 0) {
                System.out.println("Encerrando sistema...");
                System.exit(0);

            } else if (opcao == 3) {
                System.out.print("Digite como quer ser chamado agora: ");
                String novoNome = scanner.nextLine();
                aluno.setNome(novoNome);
                System.out.println("Nome alterado com sucesso!");

            } else if (opcao == 4) {
                System.out.println("Tem certeza? (1-Sim / 2-Não)");
                if (IOUtils.scanInt(scanner) == 1) {
                    aluno.setPontuacaoTotal(0);
                    System.out.println("Pontuação zerada.");
                }

            } else if (opcao == 5) {
                System.out.println("\n--- MODO CRIAÇÃO DE QUIZ ---");
                System.out.println("Crie um desafio rápido para testar seus conhecimentos.");


                System.out.print("Digite o TEMA do seu quiz (ex: Revisão Java): ");
                String temaUser = scanner.nextLine();
                Curso cursoUsuario = new Curso(temaUser, "Personalizado", "Quiz criado pelo usuário");

                System.out.println("Tema definido como: '" + cursoUsuario.getTema() + "'");
                System.out.print("Deseja corrigir o tema? (1-Sim, corrigir / 2-Não, continuar): ");
                int respTema = IOUtils.scanInt(scanner);

                if (respTema == 1) {
                    System.out.print("Digite o novo TEMA correto: ");
                    String novoTema = scanner.nextLine();
                    cursoUsuario.setTema(novoTema);
                    cursoUsuario.setNivel("Personalizado (Editado)");
                    cursoUsuario.setConteudoTeorico("Conteúdo Editado pelo Aluno");
                    System.out.println("Tema corrigido para: " + cursoUsuario.getTema());
                }


                System.out.println("\nAgora crie uma pergunta para este quiz:");
                System.out.print("Enunciado: ");
                String enunciadoUser = scanner.nextLine();
                System.out.print("Alternativa A (Correta): ");
                String altA = scanner.nextLine();
                System.out.print("Alternativa B (Errada): ");
                String altB = scanner.nextLine();
                System.out.print("Alternativa C (Errada): ");
                String altC = scanner.nextLine();
                System.out.print("Alternativa D (Errada): ");
                String altD = scanner.nextLine();


                Questao questaoUser = new Questao(enunciadoUser, altA, altB, altC, altD, 'A');

                System.out.println("\nConfira sua pergunta: " + questaoUser.getEnunciado());
                System.out.print("Deseja editar o texto da pergunta? (1-Sim / 2-Não): ");
                int respQuest = IOUtils.scanInt(scanner);

                if (respQuest == 1) {
                    System.out.print("Digite o Enunciado correto: ");
                    String novoEnunciado = scanner.nextLine();
                    questaoUser.setEnunciado(novoEnunciado);
                    questaoUser.setAlternativaA(altA);
                    questaoUser.setAlternativaB(altB);
                    questaoUser.setAlternativaC(altC);
                    questaoUser.setAlternativaD(altD);
                    questaoUser.setCorreta('A');
                    System.out.println("Pergunta atualizada.");
                }

                cursoUsuario.adicionarQuestao(questaoUser);

                System.out.println("\n--- INICIANDO SEU QUIZ PERSONALIZADO ---");
                servico.fazerAtividade(scanner, cursoUsuario, aluno);
                System.out.println("\nSalvando histórico do desafio...");

                Progresso p = new Progresso(null, null, 0);

                p.setAluno(aluno);
                p.setCurso(cursoUsuario);
                p.setPontuacao(10);

                System.out.println("Registro Salvo com Sucesso!");
                System.out.println("Aluno: " + p.getAluno().getNome());
                System.out.println("Atividade: " + p.getCurso().getTema());
                System.out.println("Nota registrada: " + p.getPontuacao());
                System.out.println("-----------------------------------------");

            } else if (opcao == 1 || opcao == 2) {
                System.out.println("\nEscolha o TEMA:");
                System.out.println("1 - Java");
                System.out.println("2 - IA");
                System.out.println("3 - Inteligência Emocional");

                int temaOpcao = IOUtils.scanInt(scanner);
                String temaEscolhido = null;

                if (temaOpcao == 1) temaEscolhido = "Java";
                else if (temaOpcao == 2) temaEscolhido = "IA";
                else if (temaOpcao == 3) temaEscolhido = "Emocional";
                else System.out.println("Tema inválido!");

                if (temaEscolhido != null) {
                    System.out.println("\nEscolha o NÍVEL:");
                    System.out.println("1 - Iniciante");
                    System.out.println("2 - Intermediário");
                    System.out.println("3 - Avançado");

                    int nivelOpcao = IOUtils.scanInt(scanner);
                    String nivelEscolhido = null;

                    if (nivelOpcao == 1) nivelEscolhido = "Iniciante";
                    else if (nivelOpcao == 2) nivelEscolhido = "Intermediário";
                    else if (nivelOpcao == 3) nivelEscolhido = "Avançado";
                    else System.out.println("Nível inválido!");

                    if (nivelEscolhido != null) {
                        Curso cursoEncontrado = servico.buscarCurso(temaEscolhido, nivelEscolhido);

                        if (cursoEncontrado == null) {
                            System.out.println("Desculpe, este curso ainda não existe.");
                        } else {
                            if (opcao == 1) servico.estudarTeoria(cursoEncontrado);
                            else servico.fazerAtividade(scanner, cursoEncontrado, aluno);
                        }
                    }
                }

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}