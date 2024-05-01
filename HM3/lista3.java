package HM3;

public class exercicio1 {
    public static void main(String[] args) {
        for (int n = 0; n < 20; n++){
            int n2;
            n2 = n;
            if (n2 % 2 == 0)
                System.out.println(n2);
            else {}
            
            
        }
    }
}

public class exercicio2 {
    public static void main(String[] args) {
        for (int n = 0; n < 100; n++) {
            int soma = 0;
            for (int n2 = 0; n2 <= n; n2++) {
                soma += n2;
            }
            System.out.println(soma);
        }
    }
}

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int x;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o número desejado:");
        x = leitor.nextInt();
        for (int n = 0; n <= 10; n++;){
            int x1;
            x1 = x;
            x1 = x1 * n;
            System.out.println(x + " X " + n + " = " + x1);
        }
    }
}

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int x;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor desejado menor ou igual a 50:");
        x = leitor.nextInt();
        while (x < 250){
            x = x * 3;
            if (x < 250){
                System.out.println(x);
            }
            else{}
        }
    }
}

public class exercicio5 {
    public static void main(String[] args) {
        for (int n = 1; n <= 200; n++) {
            int x;
            int x1;
            x = n;
            if (x % 4 == 0) {
                System.out.println(x);
            } else {
            }
        }
    }
}

public class exercicio6 {
    public static void main(String[] args) {
        for (int n = 15; n <= 200; n++) {
            int x;
            x = n;
            x = x * x;
            System.out.println(x);
        }
    }
}

public class exercicio7 {
    public static void main(String[] args) {
        int x = 3;
        for (int n = 0; n <= 15; n++) {
            if (n == 0) {
                System.out.println("1");
            } else {
                int n2 = (int) Math.pow(x, n);
                System.out.println(n2);
            }
        }
    }
}

public class exercicio8 {
    public static void main(String[] args) {
        int termo = 15;
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.println(n1 + "\n" + n2);
        for (int n = 2; n < termo; n++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

import Scanner;

public class lista3 {
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);


        
    }
}

import Scanner;

public class lista3 {
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);


        
    }
}

import Scanner;

public class lista3 {
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);


        
    }
}

import Scanner;

public class lista3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

    }
}
