package Strategy;

public class EnviarNotificacao{
    private Notificacao notificacao;

    public void setTipoNotificacao(Notificacao notificacao){
        this.notificacao = notificacao;
    }

    public String enviar(String produto, Double valor){
        return notificacao.notificacao(produto, valor);
    }

    public static void main(String[] args) {
        EnviarNotificacao enviarNotificacao = new EnviarNotificacao();

        enviarNotificacao.setTipoNotificacao(new Sms());
        String resultado = enviarNotificacao.enviar("Coxinha", 12.5);
    
        System.out.println(resultado);
    }
}