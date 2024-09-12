package BehavioralDesignPattern.ChainOfResponsibilityPattern.java;

import BehavioralDesignPattern.ChainOfResponsibilityPattern.java.AbstractHandler.Logger;

public class Driver {
    public static void main(String[] args){
        Logger logger = LoggerChain.getLoggerChain();

        logger.log(Logger.INFO, "This should only print in info");
        logger.log(Logger.DEBUG, "This should only print in Debug");
        logger.log(Logger.ERROR, "This should only print in Error");
    }
}
