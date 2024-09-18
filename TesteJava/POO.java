public class POO {
    public class Carro {
        private String marca;
        private String modelo;
        private int ano;
        public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        }
        public void exibirInformacoes() {
        System.out.println(”Marca: ”+ marca);
        System.out.println(”Modelo: ”+ modelo);
        System.out.println(”Ano: ”+ ano);
        }
        }
    public static void main(String[] args) {
        Carro carro1 = new Carro("top", "donosemato", 2024);
        carro1.exibirInformacoes();
    }
}
