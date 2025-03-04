package Observer;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        ConcreteObserver concreteObserver = new ConcreteObserver(jogo);
        ConcreteObserver concreteObserver2 = new ConcreteObserver(jogo);

        jogo.gol(concreteObserver);
        jogo.gol(concreteObserver2);
    }
}
