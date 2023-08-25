import java.util.Scanner;

public class A6EX3 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite quantos números serão lidos: ");
        int q = e.nextInt();
        int par = 0;
       
        int[] num = new int[q];
        for (int i = 0; i < q; i++){
            System.out.print("Digite o número " + (i + 1) +"º: ");
            num [i] = e.nextInt();
        }
        System.out.print("Os números pares são:");
        for (int i = 0; i < q; i++){
            if (num [i] % 2 == 0){
                System.out.printf(" [%d]", num [i]);
                par += 1;
            }
        }
        System.out.printf("\nExistem %d números pares.", par);
        e.close();
        }
    }

