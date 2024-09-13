package BehavioralDesignPattern.CommandPattern.java.ConcreteReceivers;

import BehavioralDesignPattern.CommandPattern.java.AbstractReceivers.Device;

public class Tv implements Device{

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("Turned Tv On");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("Turned Tv Off");
    }
    
}
