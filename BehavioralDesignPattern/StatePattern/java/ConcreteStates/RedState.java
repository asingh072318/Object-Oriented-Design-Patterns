package BehavioralDesignPattern.StatePattern.java.ConcreteStates;

import BehavioralDesignPattern.StatePattern.java.AbstractContext.AbstractContext;
import BehavioralDesignPattern.StatePattern.java.AbstractState.State;

public class RedState implements State{

    @Override
    public void handleRequest(AbstractContext context) {
        // TODO Auto-generated method stub
        System.out.println("Current State: Red");
        context.setState(new YellowState());
    }
    
}
