import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tBem-vindo ao nosso jogo de adivinhação. \n"
                + "\tDigite (1) para começar a jogar ou digite qualquer número para finalizar o jogo.");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                while (true) {
                    System.out.println("\tParabéns pela sua escolha."
                            + "\tDigite (1) para jogar no modo fácil;"
                            + "\tDigite (2) para jogar no modo intermediário;"
                            + "\tDigite (3) para jogar no modo difícil; "
                            + "\tDigite (0) para sair do jogo."
                            + "\tQual é a sua opção?");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            facil();
                            break;
                        case 2:
                            intermediario();
                            break;
                        case 3:
                            avancado();
                            break;
                        case 0:
                            System.out.println("\tAté a próxima! ");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("\tDigite uma opção válida!");
                            break;
                    }
                }
            default:
                System.out.println("\tAté a próxima! ");
                break;
        }
        sc.close();
    }

    public static void facil() {
        jogo(1, 10);
    }

    public static void intermediario() {
        jogo(1, 50);
    }

    public static void avancado() {
        jogo(1, 100);
    }

    private static void jogo(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Integer> acertos = new ArrayList<>();
        List<Integer> erros = new ArrayList<>();
        int pontuacao = 0;

        System.out.println("\tO jogo começou! Tente adivinhar o número entre " + min + " e " + max + ".");

        while (true) {
            int numeroSorteado = random.nextInt(max - min + 1) + min;
            System.out.print("\tDigite seu palpite (ou 0 para sair): ");
            int palpite = scanner.nextInt();
            if (palpite == 0) {
                break;
            }

            if (palpite == numeroSorteado) {
                System.out.println("\tParabéns! Você acertou!");
                acertos.add(palpite);
                pontuacao += 10; // Aumenta a pontuação a cada acerto
            } else {
                System.out.println("\tQue pena! Você errou. O número era " + numeroSorteado);
                erros.add(palpite);
            }
        }

        System.out.println("\n\tFim de jogo!");
        System.out.println("\tPontuação final: " + pontuacao + " pontos.");
        System.out.println("\tNúmeros acertados: " + acertos);
        System.out.println("\tNúmeros errados: " + erros);
        //scanner.close(); // Evite fechar o scanner aqui para não causar problemas no main
    }
}