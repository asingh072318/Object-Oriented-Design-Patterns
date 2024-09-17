package BehavioralDesignPattern.ObserverPattern.java.Subject;

import java.util.ArrayList;
import java.util.List;

import BehavioralDesignPattern.ObserverPattern.java.AbstractObserver.AbstractObserver;
import BehavioralDesignPattern.ObserverPattern.java.AbstractSubject.AbstractSubject;

public class NewsArticle implements AbstractSubject{

    private List<AbstractObserver> observers;
    private String articleName;

    public NewsArticle(){
        this.observers = new ArrayList<>();
        this.articleName = "Empty Article";
    }
    @Override
    public void attach(AbstractObserver observer) {
        // TODO Auto-generated method stub
        if(!this.observers.contains(observer)){
            this.observers.add(observer);
        }
    }

    @Override
    public void detach(AbstractObserver observer) {
        // TODO Auto-generated method stub
        if(!this.observers.contains(observer)){
            this.observers.remove(observer);
        }
    }

    @Override
    public void publishArticle(String articleName) {
        // TODO Auto-generated method stub
        this.articleName = articleName;
        for(AbstractObserver observer: this.observers){
            observer.getUpdate(this.articleName);
        }
    }
    
}
