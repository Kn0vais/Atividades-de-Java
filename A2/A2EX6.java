//Calculadora de áreas completa.
import java.util.Scanner;
import java.lang.Math;
    public class A2EX6 {
        public static void main (String []args){
            Scanner e = new Scanner (System.in);
            System.out.print("Digite o valor de A: ");
            double a = e.nextDouble();
            System.out.print("Digite o valor de B: ");
            double b = e.nextDouble();
            System.out.print("Digite o valor de C: ");
            double c = e.nextDouble();
            double aTriangulo = (a * c) / 2;
            double aCirculo = 3.14159 * Math.pow(c, 2);
            double aTrapezio = ((a + b) * c) / 2;
            double aQuadrado = b * b;
            double aRetangulo = a * b;
            System.out.printf("ÁREAS\nÁrea do triângulo retângulo: %.3f\n", aTriangulo);
            System.out.printf("Área do círculo: %.3f\n", aCirculo);
            System.out.printf("Área do trapézio: %.3f\n", aTrapezio);
            System.out.printf("Área do quadrado: %.3f\n", aQuadrado);
            System.out.printf("Área do retângulo: %.3f\n", aRetangulo);    
            e.close();
        }
}
