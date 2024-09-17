package BehavioralDesignPattern.StatePattern.java;

import BehavioralDesignPattern.StatePattern.java.ConcreteContext.TrafficLight;

public class Driver {
    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.change();
        trafficLight.change();
        trafficLight.change();
        trafficLight.change();
    }
}
