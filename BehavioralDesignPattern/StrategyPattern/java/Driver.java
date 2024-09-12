package BehavioralDesignPattern.StrategyPattern.java;

import BehavioralDesignPattern.StrategyPattern.java.ConcreteStrategy.CreditCardStrategy;
import BehavioralDesignPattern.StrategyPattern.java.ConcreteStrategy.DebitCardStrategy;
import BehavioralDesignPattern.StrategyPattern.java.ConcreteStrategy.PaypalStrategy;

public class Driver {
    public static void main(String[] args){
        Context paymentContext = new Context(new CreditCardStrategy());
        paymentContext.pay(100);

        paymentContext = new Context(new PaypalStrategy());
        paymentContext.pay(200);

        paymentContext = new Context(new DebitCardStrategy());
        paymentContext.pay(300);
    }
}
