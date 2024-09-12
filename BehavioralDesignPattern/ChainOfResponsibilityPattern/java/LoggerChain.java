package BehavioralDesignPattern.ChainOfResponsibilityPattern.java;

import BehavioralDesignPattern.ChainOfResponsibilityPattern.java.AbstractHandler.Logger;
import BehavioralDesignPattern.ChainOfResponsibilityPattern.java.ConcreteHandler.DebugLogger;
import BehavioralDesignPattern.ChainOfResponsibilityPattern.java.ConcreteHandler.ErrorLogger;
import BehavioralDesignPattern.ChainOfResponsibilityPattern.java.ConcreteHandler.InfoLogger;

public class LoggerChain {
    public static Logger getLoggerChain(){
        Logger InfoLogger = new InfoLogger();
        Logger DebugLogger = new DebugLogger();
        Logger ErrorLogger = new ErrorLogger();

        InfoLogger.setNextHandler(DebugLogger);
        DebugLogger.setNextHandler(ErrorLogger);
        ErrorLogger.setNextHandler(null);
        return InfoLogger;
    }
}
