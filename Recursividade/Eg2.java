import java.util.Scanner;
public class Main {
    public static int asa(int numero){
        if (numero == 0){
            return 0;
        }
        else {
            System.err.println(numero);
            return (numero % 10) + asa(numero / 10);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = asa(y);
        System.out.println(x);
        
	}
    
}
