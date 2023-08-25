//Calculadora de Média de dois a cinco números.
import javax.swing.JOptionPane;

public class A5EX2 {
    public static void main(String[] args) {
        int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos números (2 á 5) você deseja calcular a média?"));

        if (qnt < 2 || qnt > 5) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida.");
            System.exit(0);
        }

        double[] numeros = new double[qnt];
        for (int i = 0; i < qnt; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
        }

        double media = calcularMedia(numeros);

        JOptionPane.showMessageDialog(null, "A média dos números é: " + media);
    }

    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }
}
