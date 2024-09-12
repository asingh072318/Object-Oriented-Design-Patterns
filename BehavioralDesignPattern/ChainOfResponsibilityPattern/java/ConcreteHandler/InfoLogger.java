package BehavioralDesignPattern.ChainOfResponsibilityPattern.java.ConcreteHandler;

import BehavioralDesignPattern.ChainOfResponsibilityPattern.java.AbstractHandler.Logger;

public class InfoLogger implements Logger{

    private Logger nextLogger;

    @Override
    public void setNextHandler(Logger logger) {
        // TODO Auto-generated method stub
        this.nextLogger = logger;
    }

    @Override
    public void log(int level, String message) {
        // TODO Auto-generated method stub
        if(level<=Logger.INFO){
            System.out.println("INFO: "+ message);
        }
        else{
            if(this.nextLogger != null){
                this.nextLogger.log(level,message);
            }
        }
    }
    
}
