//Classe Rectangle que incide nas instâncias "a." no A8EX1.
package A8;
public class Rectangle {

    public double altura;
    public double largura;

    public double area(){
        return altura * largura;
    }
    public double perimetro(){
        return 2 * (altura + largura);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}
