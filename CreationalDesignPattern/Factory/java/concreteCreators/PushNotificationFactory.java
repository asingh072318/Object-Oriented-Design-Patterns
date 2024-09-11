package CreationalDesignPattern.Factory.java.concreteCreators;

import CreationalDesignPattern.Factory.java.concreteProducts.PushNotification;
import CreationalDesignPattern.Factory.java.product.Notification;
import CreationalDesignPattern.Factory.java.creator.NotificationFactory;

public class PushNotificationFactory implements NotificationFactory{

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        return new PushNotification();
    }
    
}
