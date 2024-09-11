package CreationalDesignPattern.Factory.java.concreteCreators;

import CreationalDesignPattern.Factory.java.concreteProducts.SmsNotification;
import CreationalDesignPattern.Factory.java.interfaces.Notification;
import CreationalDesignPattern.Factory.java.interfaces.NotificationFactory;

public class SmsNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        return new SmsNotification();
    }
    
}
