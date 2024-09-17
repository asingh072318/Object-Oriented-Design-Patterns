package BehavioralDesignPattern.MediatorPattern.java.ConcreteMediator;

import java.util.ArrayList;
import java.util.List;

import BehavioralDesignPattern.MediatorPattern.java.AbstractColleague.Colleague;
import BehavioralDesignPattern.MediatorPattern.java.AbstractMediator.Mediator;

public class ChatGroup implements Mediator{
    List<Colleague> users;
    String name;
    
    public ChatGroup(String name){
        this.users = new ArrayList<>();
        this.name = name;
    }

    public void add(Colleague colleague){
        if(!this.users.contains(colleague)){
            this.users.add(colleague);
        }
    }

    public void sendMessage(String message, Colleague colleague){
        for(Colleague user: users){
            if(user.getName()!=colleague.getName()){
                user.receive(message);
            }
        }
    }

}
