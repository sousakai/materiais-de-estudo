public class Main {

    public static void main(String args[]) {
        // modificador: publico (todos podem acessar)
        // tipo de retorno: void (nulo)
        // nome do método: main
        // parametros: String args[] (array de strings)

        Livro livro = new Livro();
        // objeto criado

        livro.autor = "George R. R. Martin";
        livro.titulo = "A Guerra dos Tronos";
        livro.editora = "Leya";
        livro.gênero = "Fantasia";
        livro.numeroPaginas = 800;

        System.out.println("O livro é: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
    }
}
