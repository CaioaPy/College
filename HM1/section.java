import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
            double IMC;
            double h;
            double m;
            double h2;
        Scanner leitor = new Scanner(System.in);
            System.out.println("Insira o valor de m (massa):");
            m = leitor.nextDouble();
            System.out.println("Insira o valor de h (altura):");
            h = leitor.nextDouble();
            h2 = h*h;
            IMC = m / h2;
            System.out.println("O IMC é de: " + IMC);
    
    }
}
