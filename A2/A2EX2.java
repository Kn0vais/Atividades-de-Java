//Calculadora para área de círculos.
import java.util.Scanner;
import java.lang.Math;

public class A2EX2 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.print("Insira o valor do raio do círculo: ");
		double r = e.nextDouble();
		double A = 3.14159 * Math.pow(r, 2);
		System.out.printf("A=%.4f", A);
		e.close();
	}
}