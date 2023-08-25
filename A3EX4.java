import java.util.*;
public class A3EX4 {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        System.out.print("Insira a hora inicia do jogo: ");
        int hi = e.nextInt();
        System.out.print("Insira a hora final do jogo: ");
        int hf = e.nextInt();
        int tempo;
        if (hi<hf){
            tempo = hf - hi;
        }
        else{
            tempo = 24 - hi + hf;
        }
        System.out.println("A Duração do jogo foi de " + tempo + " hora(s).");
        e.close();
    }
}
