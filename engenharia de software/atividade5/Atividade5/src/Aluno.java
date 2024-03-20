import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Livro> livrosAlugados;
    

    public Aluno(String nome){
        this.nome = nome;
        this.livrosAlugados = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Livro> getLivrosAlugados() {
        return livrosAlugados;
    }

    public void setLivrosAlugados(List<Livro> livros) {
        this.livrosAlugados = livros;
    }

    public void alugaLivro(Livro tituloLivro){
        this.livrosAlugados.add(tituloLivro);
    }

}
