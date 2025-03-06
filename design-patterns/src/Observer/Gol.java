package Observer;

public class Gol implements Notificacao{
    private Jogo jogo;

    public Gol (Jogo jogo){
        this.jogo = jogo;
    }

    @Override
    public void notifica() {
        System.out.println("\nGooooool");
    }
}
