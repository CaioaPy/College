public class Main {
  public static double[][] createMatriz(int linhas, int colunas) {
        double[][] arraynome = new double[linhas][colunas];
        return arraynome;
  }
	public static void main(String[] args) {
        int L = 3, C = 3;
        double[][] x = createMatriz(L, C);
        System.out.println(x);
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++){
                double N = x[i][j];
                System.out.printf(N + " ");
            }System.out.println("\n");
        }
	}
}
