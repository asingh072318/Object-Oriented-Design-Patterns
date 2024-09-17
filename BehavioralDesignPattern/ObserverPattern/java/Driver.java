package BehavioralDesignPattern.ObserverPattern.java;

import BehavioralDesignPattern.ObserverPattern.java.Observer.Observer;
import BehavioralDesignPattern.ObserverPattern.java.Subject.NewsArticle;

public class Driver {
    public static void main(String[] args){
        NewsArticle newsArticle = new NewsArticle();

        Observer o1 = new Observer("Ankit");
        Observer o2 = new Observer("Taylor");
        Observer o3 = new Observer("Tanmoy");

        newsArticle.attach(o1);
        newsArticle.attach(o2);
        newsArticle.attach(o3);

        newsArticle.publishArticle("This is the new Article");
    }
}
