package BehavioralDesignPattern.MediatorPattern.java;

import BehavioralDesignPattern.MediatorPattern.java.ConcreteColleague.User;
import BehavioralDesignPattern.MediatorPattern.java.ConcreteMediator.ChatGroup;

public class Driver {
    public static void main(String[] args){
        ChatGroup group = new ChatGroup("Family");

        User user1 = new User("Ankit", group);
        User user2 = new User("Taylor", group);
        User user3 = new User("Tanmoy", group);

        group.add(user1);
        group.add(user2);
        group.add(user3);

        user1.send("Hello this is Ankit");
    }
}
