import java.util.Scanner;
public class Main {
    public static int todos_ate(int N){
        int total = 0;
        int NAtual = 0;
        NAtual += 1;
        total += NAtual;
        if (N == NAtual){
            return total;
        }
        else{
            return N + todos_ate(N - 1);
        }
    }
    
    public static int fatorial(int N) {
        int total = 0;
        int NAtual = 0;
        NAtual += 1;
        total = N * NAtual;
        if (N == NAtual){
            return total;
        }
        else{
            return N * fatorial(N - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor de N: ");
        int N = scanner.nextInt();
        int ex1 = todos_ate(N);
        System.out.println("a soma de todos os números até " + N + " é: " + ex1);
        int ex2 = fatorial(N);
        System.out.println("O fatorial de " + N + " é: " + ex2); 
        
	}
}
