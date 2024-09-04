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
        scanner.close();
        i = 0;
        while (i != 10) {
            double x = produtos.get(i) * precos.get(i);
            totais.add(x);
            i++;
        }
        System.out.print("Produto  preço  quantidade  total");
        int hig = 0;
        for (int q = 0; q < 10; q++) {
            System.out.println(q + " " + precos.get(q) + "   " + produtos.get(q) + "   " + totais.get(q));
            if (produtos.get(q) > hig) {
                hig = q;
            }
        }
        double total_vendas = 0;
        for (int t = 0; t < 10; t++) {
            total_vendas += totais.get(t);
        }
        double comissao = total_vendas * 0.05;
        System.out.println("Vendas totais: " + total_vendas + " comissão do vendedor: " + comissao);
        System.out.println("Objeto mais vendido: " + hig + " com valor: " + precos.get(hig));
    }
}