public class App {
    public static void main(String[] args) {
        BibliotecaEscolar biblioteca = new BibliotecaEscolar();

        Aluno aluno1 = new Aluno("Vinicius Augusto");
        Aluno aluno2 = new Aluno("Bianca Andriano");

        biblioteca.cadastrarAluno(aluno1);
        biblioteca.cadastrarAluno(aluno2);

        Livro livro1 = new Livro("Pelé Eterno");
        Livro livro2 = new Livro("A jornado para o oeste");

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        biblioteca.alugarLivro(aluno1.getNome(), livro2.getTituloLivro());

    }
}
