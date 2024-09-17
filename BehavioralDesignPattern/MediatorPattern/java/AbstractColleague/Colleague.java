package BehavioralDesignPattern.MediatorPattern.java.AbstractColleague;

public interface Colleague {
    void send(String message);
    void receive(String message);
    String getName();
}
