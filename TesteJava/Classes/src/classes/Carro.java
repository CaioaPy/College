package classes;

public class Carro {
    String modelo;
    int ano;
    String cor;
    
    public Carro(String modelo, int ano, String cor) {
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
    }
    public void mostrarInfo(){
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("cor: " + cor);
    }
}