//Criação da classe LIVRO

public class Livro {
    String autor; // ATRIBUTOS DA CLASSE - características
    String titulo;
    String editora;
    String gênero;
    int numeroPaginas;

    // Construtor - inicializa os atributos e permite criar objetos - sempre tem o
    // mesmo nome da Classe
    public Livro() {
        // sem parâmetros, logo, não requer nenhuma informação para criar o objeto
        // (valores não especificados serão retornados NULL)
        this.autor = "";
        this.titulo = "";
        this.editora = "";
        this.gênero = "";
        this.numeroPaginas = 0;
    }

    // exemplo de setter em java (modifica o valor do atributo)
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // exemplo de getter em java (vai buscar o valor do atributo)
    public String getAutor() {
        return autor;
    }

    // seção de SOBRECARGA DE MÉTODOS

    // Método exibir() sem parâmetros
    public void exibir() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }

    // Sobrecarga do método exibir() com 1 parâmetro
    public void exibir(String titulo) {
        System.out.println("Título: " + titulo);
    }

    // Sobrecarga do método exibir() com 2 parâmetros
    public void exibir(String titulo, String autor) {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
