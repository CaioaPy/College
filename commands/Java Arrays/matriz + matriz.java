public class Main {
	public static void main(String[] args) {
	    int[][] matriz1 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                        };
	    int[][] matriz2 = {
                        {9, 8, 7},
                        {6, 5, 4},
                        {3, 2, 1}
                        };
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1.length; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < matriz3.length; i++){
            for (int j = 0; j < matriz3.length; j++){
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println("");
        }    
	}
}
