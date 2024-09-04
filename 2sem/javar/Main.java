import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2)
        double salario_base = 545.00;
        int i = 0;

        Vector<Double> produtos = new Vector<Double>();
        Vector<Double> precos = new Vector<Double>();
        Vector<Double> totais = new Vector<Double>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o preço dos 10 produtos (xx.xx) enviando uma linha para cada preço");
        while (i != 10) {
            double a = scanner.nextDouble();
            precos.add(a);
            i++;
            System.out.println(i + "/10");
        }
        i = 0;
        System.out.println("agora insira a quantidade de produtos enviando uma linha para cada produto");
        while (i != 10) {
            double b = scanner.nextDouble();
            produtos.add(b);
            i++;
            System.out.println(i + "/10");
        }
        i = 0;
        while (i != 10) {
            double x = produtos.get(i) * precos.get(i);
            totais.add(x);
            i++;
        }
        System.out.print("Produto  preço  quantidade  total");
        double hig = 0;
        for (int q = 0; q < 10; q++) {
            System.out.println(q + " " + precos.get(q) + "   " + produtos.get(q) + "   " + totais.get(q));
            if (produtos.get(q) > hig) {
                hig = produtos.get(q);
            }
        }
        hig = (int) hig;

    }
}