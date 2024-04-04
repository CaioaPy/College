import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
         * USD = BRL 2,40
         * 1)
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de reais a ser convertida para dólares:");
        int BRL = leitor.nextInt();
        double convertido = BRL / 2.40;
        System.out.println("A quantidade em dólares é: " + convertido);

        /*
         * USD = BRL 2,40
         * 2)
         */

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de dólares a ser convertida para reais:");
        int USD = leitor.nextInt();
        double convertido2 = USD * 2.40;
        System.out.println("A quantidade em reais é: " + convertido2);

    }
}
        /*
         * 3)
         */
public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double AP = leitor.nextDouble();
        System.out.println("Digite a altura da parede:");
        double LP = leitor.nextDouble();
        System.out.println("Digite a largura da parede:");
        double AA = leitor.nextDouble();
        System.out.println("Digite a altura do azulejo:");
        double LA = leitor.nextDouble();
        System.out.println("Digite a largura do azulejo:");
        double AreaP = AP * LP;
        double AreaA = AA * LA;
        double QuantidadeA = AreaP / AreaA;
        System.out.println("Você precisará de " + QuantidadeA + " Azulejos");

    }
}

        /*
         * 4)
         */

public class Exercicio4 {
    public static void main(String[] args) {
        
        double ladoA=0;
        double ladoB;
        double area;
        double perimetro;
    Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor do lado A:");
        ladoA = leitor.nextDouble();
        System.out.println("Insira o valor do lado B:");
        ladoB = leitor.nextDouble();
        area = ladoA * ladoB;
        perimetro = 2*ladoA + 2*ladoB;
        System.out.println("A area é = " + area);
        System.out.println("E o perímetro é = " + perimetro);


    }
}
        
    }
}
