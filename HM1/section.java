import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double km;
        double tempo;
        double velocidadeM;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a distancia total (km) do percurso:");
        km = leitor.nextDouble();
        System.out.println("Insira o tempo total no percurso (minutos): ");
        tempo = leitor.nextDouble();
        km = km * 60;
        velocidadeM = km / tempo;
        System.out.println("A velocidade média é de: " + velocidadeM);
    }
}