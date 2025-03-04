package Observer;

public class ConcreteObserver implements Observer {
    private Jogo jogo;

    public ConcreteObserver(Jogo jogo){
        this.jogo = jogo;
        jogo.gol(this);
    }

    public void update(){
        System.out.println("Gol ");
    }
}
