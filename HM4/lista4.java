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

import java.util.*;

public class exercicio3 {
	public static void main(String[] args) {
		int[] A = {64, 321, 42, 76, 176};
		int[] B = {2, 5, 123, 532, 26};
		int[] C = new int[5];
		for (int i = 0; i < A.length; i++){
		    C[i] = A[i] - B[i];
		}
		System.out.println("Numeros calculados! ");
		for (int i = 0; i < C.length; i++){
		    System.out.println("C[" + i + "]= " + C[i]);
		    System.out.println(" ");
		}
		System.out.println(".");
	}
}

import java.util.*;

public class exercicio4
{
	public static void main(String[] args) {
		int[] A = {64, 321, 42, 76, 176};
		int[] B = {2, 5, 123, 532, 26};
		int[] C = new int[10];
		for (int i = 0; i < A.length; i++){
		    C[i] = A[i];
		}
		for (int i = 0; i < B.length; i++){
		    C[i + 5] = B[i];
		}
		System.out.println("Arrays fundidos!");
		for (int i = 0; i < C.length; i++){
		    System.out.println("C[" + i + "]= " + C[i]);
		    System.out.println(" ");
		}
		System.out.println(".");
	}
}

import java.util.*;

public class exercicio5 {
	public static void main(String[] args) {
		int[] A = new int[20];
		int[] B = new int[30];
		int[] C = new int[50];
		
		Random rand = new Random();
		
		for (int i = 0; i < A.length; i++){
		    int x;
		    x = rand.nextInt(500);
		    A[i] = x;
		}
		for (int i = 0; i < B.length; i++){
		    int x;
		    x = rand.nextInt(500);
		    B[i] = x;
		}
		System.out.println("Arrays criados! (A, B)");
		System.out.println(" ");
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		
		for (int i = 0; i < A.length; i++){
		    C[i] = A[i];
		}
		for (int i = 0; i < B.length; i++){
		    C[i + 20] = B[i];
		}
		System.out.println("Arrays fundidos! (C = A + B)");
		System.out.println(" ");
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		System.out.println("Imprimindo Array: C!");
		for (int i = 0; i < C.length; i++){
		    System.out.println("C[" + i + "]= " + C[i]);
		    System.out.println(" ");
		}
		System.out.println(".");
	}
}
