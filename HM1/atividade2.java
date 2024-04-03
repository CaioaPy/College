import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*
         * USD = BRL 2,40
         * 1)
         */

        System.out.println("Digite a quantidade de reais a ser convertida para dólares:");
        int BRL = leitor.nextInt();
        double convertido = BRL / 2.40;
        System.out.println("A quantidade em dólares é: " + convertido);

        /*
         * USD = BRL 2,40
         * 2)
         */

        System.out.println("Digite a quantidade de dólares a ser convertida para reais:");
        int USD = leitor.nextInt();
        double convertido2 = USD * 2.40;
        System.out.println("A quantidade em reais é: " + convertido2);

        /*
         * 3)
         */

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

        /*
         * 4)
         */

    }
}
