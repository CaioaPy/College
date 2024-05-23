import java.util.*;

public class Main {
    public static int[][] createMatriz(int linhas, int colunas) {
        int[][] arraynome = new int[linhas][colunas];
        return arraynome;
    }
    
    public static void DefineValues(int[][] array, int linhas, int colunas) {
        Random rando = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int randd = rando.nextInt(10);
                array[i][j] = randd;
            }
        }
    }
    
    public static void Sum(int[][] array1, int[][] array2, int[][] array3, int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
    }

    
	public static void main(String[] args) {
        int L = 3, C = 5;
        Random rand = new Random();
        int[][] x = createMatriz(L, C);
        int[][] y = createMatriz(L, C);
        int[][] z = createMatriz(L, C);
        
        DefineValues(x, L, C);
        DefineValues(y, L, C);
        Sum(x, y, z, L, C);
        
        System.out.println("Matriz X: \n");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++){
                System.out.print(x[i][j] + " ");
            } System.out.print("\n");
        } 
        System.out.println("Matriz Y: \n");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++){
                System.out.print(y[i][j] + " ");
            } System.out.print("\n");
	    }
        System.out.println("Soma de X e Y: \n");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++){
                System.out.print(z[i][j] + " ");
            } System.out.print("\n");
        }
    }
}
