//Calculadora de salário por hora.
import java.util.Scanner;
import java.lang.Math;
public class A2EX4 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        System.out.print("Digite número do funcionário: ");
        int Num = e.nextInt();
        System.out.print("Digite o valor de horas trabalhadas: ");
        double H = e.nextDouble();
        System.out.print("Digite o valor recebido por hora em R$: ");
        double SH = e.nextDouble();
        double ST = Math.round((SH*H) * 100.00) / 100.00;
        System.out.printf("NÚMERO = %d\nSALÁRIO = R$ %s",Num,ST);
        e.close();
        }
}
