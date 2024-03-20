import java.util.ArrayList;
import java.util.List;

public class BibliotecaEscolar {
    private List<Aluno> alunos;
    private List<Livro> livros;

    public BibliotecaEscolar(){
        this.alunos = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void cadastrarLivro(Livro livro){
        this.livros.add(livro);
    }

    public Aluno buscarAluno(String nome){
        for (Aluno aluno : alunos){
            if (aluno.getNome().equalsIgnoreCase(nome)){
                return aluno;
            } 
        }
        return null;
    }

    public Livro buscarLivro(String titulo){
        for(Livro livro : livros){
            if(livro.getTituloLivro().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }

    public void alugarLivro(String nomeAluno, String tituloLivro){
        Aluno aluno = buscarAluno(nomeAluno);
        Livro livro = buscarLivro(tituloLivro);

        if (aluno != null && livro != null){
            aluno.alugaLivro(livro);
            System.out.println("Livro alugado com sucesso!");
        } else {
            System.out.println("Aluno ou Livro não encontrado.");
        }
    }
}
