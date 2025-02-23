package Strategy.Otimizado.Service.Strategy;

import Strategy.Otimizado.Service.NotificationStrategy;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public String sendNotification(String destination, String message) {
        return "Você enviou a menssagem: " + message + " para " + destination;
    }
}
