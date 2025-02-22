package Strategy;

public class Sms implements Notificacao{
    @Override
    public String notificacao(String item, Double valor) {
        return item + " comprado pelo valor: $" + valor;
    }
}
