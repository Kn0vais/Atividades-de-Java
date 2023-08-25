//Leitor de Caixa V2.
import java.util.Scanner;

public class A3EX5 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.print("Insira o código do produto: ");
		int cd = e.nextInt();
		System.out.print("Insira a quantidade do produto: ");
		int qnt = e.nextInt();
		double total = 0.0;

		switch (cd) {
			case 1:
				total = qnt * 4.0;
				break;
			case 2:
				total = qnt * 4.5;
				break;
			case 3:
				total = qnt * 5.0;
				break;
			case 4:
				total = qnt * 2.0;
				break;
			case 5:
				total = qnt * 1.5;
				break;
			default:
				System.out.println("Código inválido.");
				e.close();
		}

		System.out.printf("O total a ser pago é: R$%.2f", total);
	}
}