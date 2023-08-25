import java.util.Scanner;

public class A6EX2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite quantos números serão lidos: ");
        int q = e.nextInt();
        double soma = 0;
        double media = 0;
   
        Double[] num = new Double[q];
        for (int i = 0; i < q; i++){
            System.out.print("Digite o número " + (i + 1) +"º: ");
            num [i] = e.nextDouble();
        }
        System.out.print("Os números são:");
        for (int i = 0; i < q; i++){
            System.out.print(" [" + num [i] + "]");
            soma += num [i];        
            media = soma / q;
        }
        System.out.printf("\nA Soma é: [%.1f]\nMédia é: [%.1f]", soma, media);
        e.close();
    }
}
