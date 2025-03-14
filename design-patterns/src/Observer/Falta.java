package Observer;

public class Falta implements Notificacao{
    private Jogo jogo;

    public Falta(Jogo jogo){
        this.jogo = jogo;
    }

    @Override
    public void notifica() {
        System.out.println("Cartão amarelo");
    }
}
