package Observer;

public class App {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Gol gol = new Gol(jogo);

        jogo.gol(gol);
    }
}
