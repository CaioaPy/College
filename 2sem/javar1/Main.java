import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2)
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

    public static void ex2(String[] args) {
        // 6)

        Vector<Double> numeros = new Vector<Double>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 5 numeros");
        int i = 0;
        while (i < 5) {
            double x;
            x = scanner.nextDouble();
            numeros.add(x);
            i++;
        }

        System.out.println("Insira o código");
        int d = scanner.nextInt();

        switch (d) {
            case 0:
                break;
            case 1:
                System.out.print(numeros);
                break;
            case 2:
                for (int y = 0; y < 5; y++) {
                    System.out.print(numeros.get(4 - y) + " ");
                }
                break;
            default:
                System.out.println("Invalido");
        }
    }
    public static void exercicio2{
        //9
        int[][] matriz = new int[7][7];
        Vector<Integer> maiores_linha = new Vector<Integer>();
        Vector<Integer> menoress_coluna = new Vector<Integer>();
        Random rand = new Random();
        
        for(int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                int x = rand.nextInt(101);
                matriz[i][j] = x;
            }
        }
        
        for(int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                int x = matriz[i][j];
                System.out.print(x + " ");
                if (x > )
            }
            System.out.println(" ");
        }
    }
}
