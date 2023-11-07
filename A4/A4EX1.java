//Leitor de Senha
import java.util.Scanner;

public class A4EX1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite a senha: ");
			int s = sc.nextInt();

			while (s != 2002) {
				System.out.print("\033[H\033[2J");
				System.out.println("Senha Invalida!");
				System.out.print("Digite a senha: ");
				s = sc.nextInt();
			}

			System.out.println("Acesso permitido");
		}
	}
}
