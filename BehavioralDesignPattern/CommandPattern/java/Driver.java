package BehavioralDesignPattern.CommandPattern.java;

import BehavioralDesignPattern.CommandPattern.java.ConcreteCommands.TurnOffCommand;
import BehavioralDesignPattern.CommandPattern.java.ConcreteCommands.TurnOnCommand;
import BehavioralDesignPattern.CommandPattern.java.ConcreteReceivers.Tv;
import BehavioralDesignPattern.CommandPattern.java.Invokers.TvRemote;

public class Driver {
    public static void main(String[] args){
        Tv tv = new Tv();
        
        TurnOnCommand turnOn = new TurnOnCommand(tv);
        TurnOffCommand turnOff = new TurnOffCommand(tv);

        TvRemote remote = new TvRemote();

        remote.setCommand(turnOn);
        remote.execute();

        remote.setCommand(turnOff);
        remote.execute();
    }
}
