package Strategy;

public class Email implements Notificacao{
    @Override
    public String notificacao(String item, Double valor) {
        return item + " comprado pelo valor: $" + valor;
    }
}
