import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double s0 = 2;
        double v0 = 3;
        double a = 10;
        double t;
        double t2;
        double s;
        double resultado;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor de t (segundos):");
        t = leitor.nextDouble();
        t2 = t * t;
        resultado = s0 + v0 * t + 0.5 * a * t2;
        System.out.println("O valor em metros é:" + resultado);
    }
}