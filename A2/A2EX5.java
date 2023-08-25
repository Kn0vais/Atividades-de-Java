//Leitor de Caixa V1.
import java.util.Scanner;
    public class A2EX5 {
        public static void main (String []args){
            Scanner e = new Scanner (System.in);
            System.out.print("PRODUTO 01 \nCódigo do Produto: ");
            int cod1 = e.nextInt();
            System.out.print("Quantidade de Produtos: ");
            int qnt1 = e.nextInt();
            System.out.print("Valor do Produto: ");
            double val1 = e.nextDouble();
            System.out.print("PRODUTO 02 \nCódigo do Produto: ");
            int cod2 = e.nextInt();
            System.out.print("Quantidade de Produtos: ");
            int qnt2 = e.nextInt();
            System.out.print("Valor do Produto: ");
            double val2 = e.nextDouble();
            double p1 = (val1*qnt1);
            double p2 = (val2*qnt2);
            double total = p1 + p2;
            System.out.printf("O subtotal do produto %d é de R$ %.2f", cod1, p1);
            System.out.printf("\nO subtotal do produto %d é de R$ %.2f", cod2, p2);
            System.out.printf("\nVALOR A PAGAR: R$ %.2f", total);
            e.close();
        }
}
