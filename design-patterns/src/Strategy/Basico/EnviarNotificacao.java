package Strategy.Basico;

public class EnviarNotificacao{
    private Notificacao notificacao;

    public void setTipoNotificacao(Notificacao notificacao){
        this.notificacao = notificacao;
    }

    public String enviar(String produto, Double valor){
        return notificacao.notificacao(produto, valor);
    }
}