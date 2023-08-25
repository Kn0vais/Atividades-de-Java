import java.util.*;
public class A3EX3 {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        System.out.print("Digite dois números inteiros: ");
        String v = e.nextLine();      
        String[] numeros = v.split(" ");
        int num1 = Integer.parseInt(numeros[0]);
        int num2 = Integer.parseInt(numeros[1]);
        String a = (num1 % num2 == 0 || num2 % num1 == 0) ? "são múltiplos." : "não são múltiplos.";
        System.out.println("Os números " + num1 + " e " + num2 + " " + a);
        e.close();
    }
}
