import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
            double A;
            double B;
            double C;
        Scanner leitor = new Scanner(System.in);
            System.out.println("Insira o valor de A:");
            A = leitor.nextDouble();
            System.out.println("Insira o valor de B:");
            B = leitor.nextDouble();
            C = A;
            A = B;
            B = C;
            System.out.println("Os novos valores são A = " + A + " e B = " + B );
    
    }
}
