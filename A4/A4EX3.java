//Contador de ímpares.
import java.util.Scanner;
public class A4EX3 {
    public static void main (String [] args){
        try (Scanner e = new Scanner(System.in)){
            System.out.println("Digite um número: ");
            int n = e.nextInt();
            for (int i = 1; i <= n; i = i + 2 ){
                System.out.printf("%d\n", i);
            }
    }
}
}
