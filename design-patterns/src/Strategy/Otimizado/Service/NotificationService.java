package Strategy.Otimizado.Service;

import java.util.Map;

import Strategy.Otimizado.Service.Strategy.EmailNotificationStrategy;
import Strategy.Otimizado.Service.Strategy.WppNotificationStrategy;

public class NotificationService {
    private Map<String, NotificationStrategy> mapStrategy = Map.of(
        "Whatsapp", new WppNotificationStrategy(),
        "Email", new EmailNotificationStrategy()
    );

    public String toNotify(String channel, String destination, String message){
        return mapStrategy.get(channel).sendNotification(destination, message);
    }
}
