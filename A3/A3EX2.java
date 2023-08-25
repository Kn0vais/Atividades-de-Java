import java.util.Scanner;
public class A3EX2 {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = e.nextInt();
        String r = (num % 2 == 0) ? "par." : "ímpar.";
        System.out.println(num + " é um número " + r);        
        e.close();
    }
}
