package BehavioralDesignPattern.CommandPattern.java.ConcreteCommands;

import BehavioralDesignPattern.CommandPattern.java.AbstractCommands.Command;
import BehavioralDesignPattern.CommandPattern.java.AbstractReceivers.Device;

public class TurnOffCommand implements Command{
    private Device device;

    public TurnOffCommand(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        this.device.turnOff();
    }
    
}
