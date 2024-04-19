package commands;

import java.util.Scanner;

public class ww {
    public static void main(String[] args) {
        int valor;
        int valor2;
        Scanner leitor = new Scanner(System.in);
        valor = leitor.nextInt();
        System.out.println("insira o valor");
        valor2 = valor % 2;
        if (valor2 = 0)
            System.out.println("O numero é par!");
        else
            System.out.println("O numero é impar!");
    }
}
