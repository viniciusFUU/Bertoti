package Observer;

public class App {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        DiaDeJogo deJogo = new DiaDeJogo(jogo);

        jogo.gol(deJogo);
    }
}
