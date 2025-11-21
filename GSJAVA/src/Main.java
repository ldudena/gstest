import entities.Aluno;
import entities.Curso;
import services.PlataformaService;
import utils.IOUtils;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlataformaService servico = new PlataformaService();

        servico.inicializarDados();

        System.out.println("BEM VINDO AO SISTEMA DE MINI-CURSOS FIAP");
        System.out.print("Digite seu nome para começar: ");
        String nome = scanner.nextLine();
        Aluno aluno = new Aluno(nome);


        while (true) {
            System.out.println("\nOlá, " + aluno.getNome() + " | Pontos: " + aluno.getPontuacaoTotal());
            System.out.println("1 - Estudar (Teoria)");
            System.out.println("2 - Praticar (Atividade)");
            System.out.println("3 - Alterar meu nome");
            System.out.println("4 - Resetar minha pontuação (Zerar)");
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
                System.out.println("Tem certeza? Todo seu progresso será apagado.");
                System.out.println("1 - Sim, quero zerar");
                System.out.println("2 - Não, voltar");
                int confirmacao = IOUtils.scanInt(scanner);

                if (confirmacao == 1) {
                    aluno.setPontuacaoTotal(0);
                    System.out.println("Sua pontuação foi resetada para 0.");
                } else {
                    System.out.println("Operação cancelada.");
                }

            } else if (opcao == 1 || opcao == 2) {
                System.out.println("\nEscolha o TEMA:");
                System.out.println("1 - Java");
                System.out.println("2 - IA");
                System.out.println("3 - Inteligência Emocional");

                int temaOpcao = IOUtils.scanInt(scanner);
                String temaEscolhido = null;

                if (temaOpcao == 1) {
                    temaEscolhido = "Java";
                } else if (temaOpcao == 2) {
                    temaEscolhido = "IA";
                } else if (temaOpcao == 3) {
                    temaEscolhido = "Emocional";
                } else {
                    System.out.println("Tema inválido!");
                }

                if (temaEscolhido != null) {

                    System.out.println("\nEscolha o NÍVEL:");
                    System.out.println("1 - Iniciante");
                    System.out.println("2 - Intermediário");
                    System.out.println("3 - Avançado");

                    int nivelOpcao = IOUtils.scanInt(scanner);
                    String nivelEscolhido = null;

                    if (nivelOpcao == 1) {
                        nivelEscolhido = "Iniciante";
                    } else if (nivelOpcao == 2) {
                        nivelEscolhido = "Intermediário";
                    } else if (nivelOpcao == 3) {
                        nivelEscolhido = "Avançado";
                    } else {
                        System.out.println("Nível inválido!");
                    }

                    if (nivelEscolhido != null) {

                        Curso cursoEncontrado = servico.buscarCurso(temaEscolhido, nivelEscolhido);

                        if (cursoEncontrado == null) {
                            System.out.println("Desculpe, este curso ainda não existe.");
                        } else {
                            if (opcao == 1) {
                                servico.estudarTeoria(cursoEncontrado);
                            } else {
                                servico.fazerAtividade(scanner, cursoEncontrado, aluno);
                            }
                        }
                    }
                }

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}