import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo (0-23): ");
        int horaInicial = input.nextInt();

        System.out.print("Digite a hora final do jogo (0-23): ");
        int horaFinal = input.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("A duração do jogo é de " + duracao + " hora(s).");

        input.close();
    }
}
