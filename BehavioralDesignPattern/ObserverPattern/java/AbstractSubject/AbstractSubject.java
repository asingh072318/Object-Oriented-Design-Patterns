package BehavioralDesignPattern.ObserverPattern.java.AbstractSubject;

import BehavioralDesignPattern.ObserverPattern.java.AbstractObserver.AbstractObserver;

public interface AbstractSubject {
    void attach(AbstractObserver observer);
    void detach(AbstractObserver observer);
    void publishArticle(String message);
}
