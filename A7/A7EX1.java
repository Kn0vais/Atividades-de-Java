//Calculadora de dois números inteiros (Usando valor inserido).
import java.util.*;

public class A7EX1 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean inteiros = false;

        do{
            try{
                System.out.print("Insira o primeiro valor: ");
                num1 = e.nextInt();
                System.out.print("Insira o segundo valor: ");
                num2 = e.nextInt();
                inteiros = true;
            } catch (InputMismatchException num){
                System.out.println("O valor inserido é invalido. Selecione outros números");
                e.nextLine();
            }

        } while (!inteiros);

        System.out.println("A soma dos números é: " + (num1+num2));
        e.close();
    }
}
