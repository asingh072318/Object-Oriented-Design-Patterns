package BehavioralDesignPattern.TemplatePattern.java.ConcreteTemplates;

import BehavioralDesignPattern.TemplatePattern.java.AbstractTemplate.Processor;

public class DbProcessor extends Processor{

    @Override
    protected void loadData() {
        // TODO Auto-generated method stub
        System.out.println("Loaded DB Data");
    }

    @Override
    protected void transformData() {
        // TODO Auto-generated method stub
        System.out.println("Transformed DB Data");
    }

    @Override
    protected void saveData() {
        // TODO Auto-generated method stub
        System.out.println("Saved DB Data");
    }
    
}
