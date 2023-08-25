//Verificador de maior número em uma lista.
import java.util.Scanner;

public class A6EX4 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite quantos números serão lidos: ");
        int q = e.nextInt();
        int mPos = 0;
        Double [] num = new Double[q];
        for (int i = 0; i < q; i++){
            System.out.print("Digite um número: ");
            num [i] = e.nextDouble();
        }
        double mNum = num[0];
        for (int i = 0; i < q; i++){
            if (num [i] > mNum){
                mNum = num [i];
                mPos = i;
            }
        }
        System.out.printf("O Maior número é [%.1f] na posição [%d].", mNum, mPos);
        e.close();
        }
    }
