import java.util.*;
import java.lang.ArithmeticException;
public class A7EX2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean inteiros = false;

        do{
            try{
                System.out.print("Insira o dividendo: ");
                num1 = e.nextInt();
                System.out.print("Insira o divisor: ");
                num2 = e.nextInt();
                if (num2 == 0){
                    throw new ArithmeticException("/ by zero");
                }
                inteiros = true;
            }catch (ArithmeticException a){
                System.out.println("ERRO! Divisões por divisor [0] são inválidas!");
            }catch (InputMismatchException b){
                System.out.println("O número inserido é invalido. Selecione outros números");
                e.nextLine();
            }

        } while (!inteiros);
        int r = num1/num2;
        System.out.printf("A divisão de %d por %d é: %d",num1, num2, r);
        e.close();
    }
}

