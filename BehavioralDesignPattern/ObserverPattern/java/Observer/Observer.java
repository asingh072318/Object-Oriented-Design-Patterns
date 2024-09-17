package BehavioralDesignPattern.ObserverPattern.java.Observer;

import BehavioralDesignPattern.ObserverPattern.java.AbstractObserver.AbstractObserver;

public class Observer implements AbstractObserver {
    private String name;

    public Observer(String name){
        this.name = name;
    }

    @Override
    public void getUpdate(String update) {
        // TODO Auto-generated method stub
        System.out.println(this.name+ " received update: "+update);
    }
    
}
