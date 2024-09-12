package BehavioralDesignPattern.StrategyPattern.java.ConcreteStrategy;

import BehavioralDesignPattern.StrategyPattern.java.AbstractStrategy.PaymentMethodStrategy;

public class CreditCardStrategy implements PaymentMethodStrategy{
    @Override
    public void pay(int amount) {
        // TODO Auto-generated method stub
        System.out.println("Paid "+amount+" by CreditCard");
    }
}
