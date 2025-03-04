package Observer;

public class DiaDeJogo implements Notificacao{
    private Jogo jogo;

    public DiaDeJogo (Jogo jogo){
        this.jogo = jogo;
    }

    @Override
    public void notifica() {
        System.out.println("Gooooool");
    }
}
