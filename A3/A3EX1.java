//Verificador de números inteiros (Negativos).
import java.util.Scanner;

public class A3EX1 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num = e.nextInt();
		String r = (num >= 0) ? "NEGATIVO" : "NÃO NEGATIVO";
		System.out.println("O número " + num + " é: " + r);
		e.close();
	}
}