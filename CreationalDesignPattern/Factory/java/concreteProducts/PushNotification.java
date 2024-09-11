package CreationalDesignPattern.Factory.java.concreteProducts;

import CreationalDesignPattern.Factory.java.product.Notification;

public class PushNotification implements Notification{

    @Override
    public void sendNotification() {
        // TODO Auto-generated method stub
        System.out.println("Sending Push Notification");
    }
    
}
