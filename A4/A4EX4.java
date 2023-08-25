//Contadores de números em um intervalo de 10 a 20.
import java.util.Scanner;
public class A4EX4 {
    public static void main (String [] args){
        try (Scanner e = new Scanner(System.in)){
            System.out.print("Informe quantos números você irá usar: ");
            int n = e.nextInt();
            int in = 0;
            int out = 0;
            for (int i = 1; i <= n; i++){
                System.out.print("Insira o "+i +"º número: ");
                int x = e.nextInt();
                if (x >= 10 && x <= 20){
                    in++;
                }else{
                    out++;
                }
            }
            System.out.printf("%d in\n%d out", in, out);
        }
    }
}
