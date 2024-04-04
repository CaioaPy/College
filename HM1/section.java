import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
            double r;
            double A;
            double C;
            double r2;
        Scanner leitor = new Scanner(System.in);
            System.out.println("Insira o valor de r (raio): ");
            r = leitor.nextDouble();
            r2 = r*r;
            A = 3.1415*r2;
            C = 2*3.1415*r;
            System.out.println("A area da circunferencia é = " + A + " e seu comprimento = " + C );


    }
}
