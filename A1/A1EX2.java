//Calculadora de área (Triângulos e Retângulos).
import java.util.Scanner;
public class A1EX2 {
    public static void main (String[] args){
    Scanner medida = new Scanner(System.in);
    System.out.print("Digite o valor da altura: ");
    double a = medida.nextDouble();
    System.out.print("Digite o valor do lado: ");
    double b = medida.nextDouble();
    double AT = (b*a)/2;
    double AR = b*a;
    System.out.printf("Área se for um triângulo: %.2f\n", AT);
    System.out.printf("Área se for um retângulo: %.2f\n", AR);
    medida.close();
    }
}
