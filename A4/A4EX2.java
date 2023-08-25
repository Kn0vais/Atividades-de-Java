//Identificador de localização contínuo (Quadrantes do Plano Cartesiano).
import java.util.Scanner;

public class A4EX2{
    public static void main (String [] args ){
        try (Scanner e = new Scanner (System.in)) {
            System.out.print("Digite um número: ");
            double x = e.nextDouble();
            System.out.print("Digite mais um número: ");
            double y = e.nextDouble();
            while(x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro");
           
            }else if (x < 0 && y > 0){
                System.out.println("Segundo");

            }else if (x < 0 && y < 0){
                System.out.println("Terceiro");

            }else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }
            System.out.print("Digite um número: ");
            x = e.nextDouble();
            System.out.print("Digite mais um número: ");
            y = e.nextDouble();
            }
        }

        }
    }
