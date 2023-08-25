import javax.swing.JOptionPane;

public class A5EX3 {
    public static void main(String[] args) {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Selecione a operação:\n1 - Soma\n2 - Subtração\n" +
                "3 - Multiplicação\n4 - Divisão"));

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double resultado = Operacao(op, n1, n2);

        JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultado);
    }

    public static double Operacao(int op, double num1, double num2) {
        double r = 0;

        switch (op) {
            case 1:
                r = soma(num1, num2);
                break;
            case 2:
                r = subtrair(num1, num2);
                break;
            case 3:
                r = multiplicar(num1, num2);
                break;
            case 4:
                r = dividir(num1, num2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida. Por favor, selecione uma opção válida.");
                System.exit(0);
        }

        return r;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
            System.exit(0);
        }
        return num1 / num2;
    }
}

