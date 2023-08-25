//Calculadora de área de um retângulo (usando orientação a objeto).
package A8;
import java.util.Locale;
import java.util.Scanner;
public class A8EX1{
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        Rectangle a = new Rectangle();

        System.out.print("Digite a altura de um retângulo: ");
        a.altura = e.nextDouble();
        System.out.print("Digite a largura de um retângulo: ");
        a.largura = e.nextDouble();

        System.out.printf("Área = %.2f \nPerímetro = %.2f \nDiagonal = %.2f\n", a.area(), a.perimetro(), a.diagonal());
        e.close();
    }

}
