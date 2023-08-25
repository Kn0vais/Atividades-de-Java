//Separador de números negativos.
import java.util.Scanner;

public class A6EX1 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite quantos números serão lidos: ");
        int q = e.nextInt();
        boolean n = false;

        if (q < 1){
            System.out.println("Quantidade Inválida.");
            System.exit(0);
        }

        int[] num = new int[q];

        for (int i = 0; i < q; i++){
            System.out.print("Digite o número " + (i + 1) +"º: ");
            num [i] = e.nextInt();
        }

        for (int i = 0; i < q; i++ ){
            if (num[i] < 0) {
                n = true;
                break;
            }
        }

        if (n){
            System.out.println("Números negativos lidos são:");
            
            for (int i = 0; i < q; i++){
                if (num[i] < 0) {
                    System.out.printf("[%d] ",num[i]);
                }
        }
    } else {
        System.out.println("Não há nenhum número negativo: ");
    }
        e.close();
    }
}
