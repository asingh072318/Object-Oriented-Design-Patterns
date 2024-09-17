package BehavioralDesignPattern.StatePattern.java.ConcreteContext;

import BehavioralDesignPattern.StatePattern.java.AbstractContext.AbstractContext;
import BehavioralDesignPattern.StatePattern.java.AbstractState.State;
import BehavioralDesignPattern.StatePattern.java.ConcreteStates.GreenState;

public class TrafficLight implements AbstractContext{
    private State currentState;
    public TrafficLight(){
        this.currentState = new GreenState();
    }

    @Override
    public void change() {
        // TODO Auto-generated method stub
        this.currentState.handleRequest(this);
    }

    @Override
    public void setState(State state) {
        // TODO Auto-generated method stub
        this.currentState = state;
    }
    
}
