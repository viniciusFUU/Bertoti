package Strategy.Otimizado.Service.Strategy;

import Strategy.Otimizado.Service.NotificationStrategy;

public class WppNotificationStrategy implements NotificationStrategy {
    @Override
    public String sendNotification(String destination, String message) {
        return "Menssagem: "  + message + "\nPara: " + destination;
    }
}
