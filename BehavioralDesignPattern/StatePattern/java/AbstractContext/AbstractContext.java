package BehavioralDesignPattern.StatePattern.java.AbstractContext;

import BehavioralDesignPattern.StatePattern.java.AbstractState.State;

public interface AbstractContext {
    void setState(State state);
    void change();
}
