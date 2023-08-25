import java.util.Scanner;
public class A2EX1{
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        System.out.print("Insira um valor inteiro: ");
        int n1 = e.nextInt();
        System.out.print("Insira outro valor inteiro: ");
        int n2 = e.nextInt();
        System.out.println("SOMA = " + (n1 + n2));
        e.close();
        }
}
