package BehavioralDesignPattern.MediatorPattern.java.ConcreteColleague;

import BehavioralDesignPattern.MediatorPattern.java.AbstractColleague.Colleague;
import BehavioralDesignPattern.MediatorPattern.java.AbstractMediator.Mediator;

public class User implements Colleague{
    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        // TODO Auto-generated method stub
        System.out.println(this.name + " Received Message: "+message);
    }
    
}
