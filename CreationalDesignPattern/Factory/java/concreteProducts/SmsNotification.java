package CreationalDesignPattern.Factory.java.concreteProducts;

import CreationalDesignPattern.Factory.java.product.Notification;

public class SmsNotification implements Notification{

    @Override
    public void sendNotification() {
        // TODO Auto-generated method stub
        System.out.println("Sending SMS notification");
    }
    
}
