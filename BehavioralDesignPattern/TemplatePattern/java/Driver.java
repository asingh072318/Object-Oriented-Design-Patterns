package BehavioralDesignPattern.TemplatePattern.java;

import BehavioralDesignPattern.TemplatePattern.java.AbstractTemplate.Processor;
import BehavioralDesignPattern.TemplatePattern.java.ConcreteTemplates.DbProcessor;
import BehavioralDesignPattern.TemplatePattern.java.ConcreteTemplates.LogProcessor;

public class Driver {
    public static void main(String[] args){
        Processor LogProcessor = new LogProcessor();
        LogProcessor.processData();

        Processor DbProcessor = new DbProcessor();
        DbProcessor.processData();
    }
}
