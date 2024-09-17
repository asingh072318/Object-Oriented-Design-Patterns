package BehavioralDesignPattern.MediatorPattern.java.AbstractMediator;

import BehavioralDesignPattern.MediatorPattern.java.AbstractColleague.Colleague;

public interface Mediator {
    void add(Colleague colleague);
    void sendMessage(String message, Colleague colleague);
}
