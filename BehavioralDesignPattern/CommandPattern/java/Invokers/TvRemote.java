package BehavioralDesignPattern.CommandPattern.java.Invokers;

import BehavioralDesignPattern.CommandPattern.java.AbstractCommands.Command;

public class TvRemote {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
