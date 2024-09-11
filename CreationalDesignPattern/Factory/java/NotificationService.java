package CreationalDesignPattern.Factory.java;

import CreationalDesignPattern.Factory.java.concreteCreators.EmailNotificationFactory;
import CreationalDesignPattern.Factory.java.concreteCreators.PushNotificationFactory;
import CreationalDesignPattern.Factory.java.concreteCreators.SmsNotificationFactory;
import CreationalDesignPattern.Factory.java.creator.NotificationFactory;
import CreationalDesignPattern.Factory.java.product.Notification;

public class NotificationService {
    public static void main(String[] args){
        NotificationFactory emailNotificationFactory = new EmailNotificationFactory();
        Notification emailNotification = emailNotificationFactory.createNotification();
        emailNotification.sendNotification();

        NotificationFactory smsNotificationFactory = new SmsNotificationFactory();
        Notification smsNotification = smsNotificationFactory.createNotification();
        smsNotification.sendNotification();

        NotificationFactory pushNotificationFactory = new PushNotificationFactory();
        Notification pushNotification = pushNotificationFactory.createNotification();
        pushNotification.sendNotification();
    }
}
