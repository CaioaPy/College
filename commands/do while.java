package commands;

import java.util.Scanner;

public class ww {

    public static void main(String[] args) {
        int numero = 10;
        int n = 5;
        do {
            numero = numero * 2;
            n--;
            System.out.println(numero);
        } while (n >= 0);
    }
}
