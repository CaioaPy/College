import java.util.*;

public class exercicio1 {
	public static void main(String[] args) {
		int[] numeros = {1, 2, 3, 4, 5};
		for (int i = 0; i < numeros.length; i++){
		    int x;
		    x = numeros[i] * 3;
		    System.out.println("A = " + numeros[i]);
		    System.out.println("B = " + x);
		    System.out.println(" ");
		}
		System.out.println(".");
	}
}

import java.util.*;

public class exercicio2 {
	public static void main(String[] args) {
		int[] Numeros = {3, 4, 5, 6, 7, 8};
		int[] FatorialNumeros = {6, 24, 120, 720, 5040, 40320};
		for (int i = 0; i < Numeros.length; i++){
		    System.out.println("A = " + Numeros[i]);
		    System.out.println("B = " + Numeros[i] + "! = " + FatorialNumeros[i]);
		    System.out.println(" ");
		}
		System.out.println(".");
	}
}
