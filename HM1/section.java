import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double ladoA=0;
        double ladoB;
        double area;
        double perimetro;
    Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do lado A:");
        ladoA = sc.nextDouble();
        System.out.println("Insira o valor do lado B:");
        ladoB = sc.nextDouble();
        area = ladoA * ladoB;
        perimetro = 2*ladoA + 2*ladoB;
        System.out.println("A area é = " + area);
        System.out.println("E o perímetro é = " + perimetro);


    }
}
