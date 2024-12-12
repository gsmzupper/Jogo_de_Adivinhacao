import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tBem-vindo ao nosso jogo de adivinhação. "
        +"\tDigite (1) para começar a jogar e (2) para finalisar o jogo.");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:

                while (true) {
                    System.out.println("\tParabéns pela sua escolha."
                    +"\tDigite (1) para jogar no modo fácil;"
                    +"\tDigite (2) para jogar no modo intermediário;"
                    +"\tDigite (3) para jogar no modo difícil; "
                            +"\tDIgite (0) para sair do jogo."
                    +"\tQual é a sua opção?");
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
                            break;
                        default:
                            System.out.println("\tDigite uma opção válida!");
                            break;
                    }
                }
            case 2:
                System.out.println("\tAté a próxima! ");
                break;
            default:
                System.out.println("\tDIgite uma opção válida!");
                break;
        }
        sc.close();
    }

    public static void facil() {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }

    public static void intermediario() {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }

    public static void avancado() {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }
}
