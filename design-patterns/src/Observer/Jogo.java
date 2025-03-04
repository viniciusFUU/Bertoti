package Observer;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    List<Notificacao> registrosNotificacoes = new ArrayList<>();
    private boolean wasGoal = false;

    public void setWasGoal(boolean wasGoal) {
        this.wasGoal = wasGoal;
        notificacoes();
    }

    public void gol(Notificacao notificacao){
        registrosNotificacoes.add(notificacao);
        setWasGoal(true);
    }

    public void notificacoes(){
        for(Notificacao notificacao : registrosNotificacoes){
            notificacao.notifica();
        }
    }
}
