import java.util.Scanner;
public class A3EX7 {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        double x = e.nextDouble();
        System.out.print("Digite o valor de y: ");
        double y = e.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("A Posição é na origem.");
        } else if (x == 0) {
            System.out.println("A Posição é no Eixo Y");
        } else if (y == 0) {
            System.out.println("A Posição é no Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("A Posição é no Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("A Posição é no Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("A Posição é no Q3");
        } else {
            System.out.println("A Posição é no Q4");
        }
        e.close();
        }
    }
