package CreationalDesignPattern.Factory.java.concreteCreators;

import CreationalDesignPattern.Factory.java.concreteProducts.PushNotification;
import CreationalDesignPattern.Factory.java.interfaces.Notification;
import CreationalDesignPattern.Factory.java.interfaces.NotificationFactory;

public class PushNotificationFactory implements NotificationFactory{

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        return new PushNotification();
    }
    
}
