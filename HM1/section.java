import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
            double V;
            double A;
            double R;
            double R2;
            double R3;
            final double pi = 3.1415;
        Scanner leitor = new Scanner(System.in);
            System.out.println("Insira o valor de R (raio):");
            R = leitor.nextDouble();
            R2 = R*R;
            R3 = R*R*R;
            A = 4*pi*R2;
            V = 4*pi*R3/3;
            System.out.println("A area é = " + A + " e o volume = " + V);


    }
}
