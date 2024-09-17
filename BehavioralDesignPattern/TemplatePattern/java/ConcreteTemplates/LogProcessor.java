package BehavioralDesignPattern.TemplatePattern.java.ConcreteTemplates;

import BehavioralDesignPattern.TemplatePattern.java.AbstractTemplate.Processor;

public class LogProcessor extends Processor{

    @Override
    protected void loadData() {
        // TODO Auto-generated method stub
        System.out.println("Loaded Log Data");
    }

    @Override
    protected void transformData() {
        // TODO Auto-generated method stub
        System.out.println("Transform Log Data");
    }

    @Override
    protected void saveData() {
        // TODO Auto-generated method stub
        System.out.println("Save Log Data");
    }
    
}
