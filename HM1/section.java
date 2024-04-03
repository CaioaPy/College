import java.util.Scanner;

public class section {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int AP = leitor.nextInt();
        System.out.println("Digite a altura da parede:");
        int LP = leitor.nextInt();
        System.out.println("Digite a largura da parede:");
        int AA = leitor.nextInt();
        System.out.println("Digite a altura do azulejo:");
        int LA = leitor.nextInt();
        System.out.println("Digite a largura do azulejo:");
        int AreaP = AP * LP;
        int AreaA = AA * LA;
        int QuantidadeA = AreaP / AreaA;
        System.out.println("Você precisará de " + QuantidadeA + " Azulejos");
    }
}