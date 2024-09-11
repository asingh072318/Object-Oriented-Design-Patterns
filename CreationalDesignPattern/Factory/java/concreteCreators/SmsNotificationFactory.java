package CreationalDesignPattern.Factory.java.concreteCreators;

import CreationalDesignPattern.Factory.java.concreteProducts.SmsNotification;
import CreationalDesignPattern.Factory.java.product.Notification;
import CreationalDesignPattern.Factory.java.creator.NotificationFactory;

public class SmsNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        return new SmsNotification();
    }
    
}
