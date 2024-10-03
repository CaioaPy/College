package classes;

public class Classes {
    public static void main(String[] args) {
        Carro carro1 = new Carro("honda", 121, "cinza");
        carro1.mostrarInfo();
        Livro livro1 = new Livro("o fim", "osamu", 391);
        livro1.exibirInfo();
        Calculadora calculadora = new Calculadora();
        calculadora.soma(3, 4);
        calculadora.subtracao(3, 4);
        calculadora.multiplicacao(3, 4);
        calculadora.divisao(3, 4);
    }
}
