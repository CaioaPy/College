        /*
         * USD = BRL 2,40
         * 1)
         */
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de reais a ser convertida para dólares:");
        int BRL = leitor.nextInt();
        double convertido = BRL / 2.40;
        System.out.println("A quantidade em dólares é: " + convertido);

        /*
         * USD = BRL 2,40
         * 2)
         */
import java.util.Scanner;
        
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
import java.util.Scanner;
    
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
import java.util.Scanner;

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

            /*
            *IMC = m/h²
            *5)
            */
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

            /*
            *A = pi*r² | C = 2pi*r
            *6)
            */
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

            /*
            *A = 4*pi*r² | V = (4*pi*R²)/3
            *7)
            */
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
        /*
        *10)
        */
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
