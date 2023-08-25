//Verificador de diferença de dois produtos de dois pares de variáveis.
import java.util.Scanner;
public class A2EX3 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        System.out.print("Insira o valor de A: ");
        int A = e.nextInt();
        System.out.print("Insira o valor de B: ");
        int B = e.nextInt();
        System.out.print("Insira o valor de C: ");
        int C = e.nextInt();
        System.out.print("Insira o valor de D: ");
        int D = e.nextInt();
        System.out.println("DIFERENCA = " + (A*B-C*D));
        e.close();
    }    
}
