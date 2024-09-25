package classes;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;
    
    public Livro(String titulo, String autor, int numeroDePaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroDePaginas = numeroDePaginas;
    }
    public void exibirInfo(){
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("numeroDePaginas: " + numeroDePaginas);
    }
}