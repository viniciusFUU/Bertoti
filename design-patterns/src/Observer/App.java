package Observer;

public class App {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Gol gol = new Gol(jogo);
        Falta falta = new Falta(jogo);

        jogo.gol(gol);
        jogo.gol(falta);
    }
}
