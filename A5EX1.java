import javax.swing.JOptionPane;

public class A5EX1 {

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double m = calcularMedia(n1, n2);
        JOptionPane.showMessageDialog(null, "A média dos números é: " + m);
    }

    public static double calcularMedia(double num1, double num2) {
        return (num1 + num2) / 2;
    }
}
