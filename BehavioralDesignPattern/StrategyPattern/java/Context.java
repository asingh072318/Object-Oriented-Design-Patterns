package BehavioralDesignPattern.StrategyPattern.java;

import BehavioralDesignPattern.StrategyPattern.java.AbstractStrategy.PaymentMethodStrategy;

public class Context {
    PaymentMethodStrategy paymentStrategy;

    public Context(PaymentMethodStrategy method){
        this.paymentStrategy = method;
    }

    public void pay(int amount){
        this.paymentStrategy.pay(amount);
    }
}
