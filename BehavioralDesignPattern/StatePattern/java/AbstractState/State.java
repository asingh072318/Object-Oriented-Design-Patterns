package BehavioralDesignPattern.StatePattern.java.AbstractState;

import BehavioralDesignPattern.StatePattern.java.AbstractContext.AbstractContext;

public interface State {
    void handleRequest(AbstractContext context);
}
