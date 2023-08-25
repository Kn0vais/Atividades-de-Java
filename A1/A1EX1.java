//Calculadora de idade.
import java.util.Scanner;

public class A1EX1 {

	public static void main(String[] args) {
		Scanner ano = new Scanner(System.in);
		System.out.print("Digite o ano atual: ");
		int anoAtual = ano.nextInt();
		System.out.print("Digite o seu ano de nascimento: ");
		int anoNasc = ano.nextInt();
		System.out.println("A idade do usuário é: " + (anoAtual - anoNasc) + " anos.");
		ano.close();
	}
}