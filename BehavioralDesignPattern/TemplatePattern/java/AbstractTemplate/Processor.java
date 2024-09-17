package BehavioralDesignPattern.TemplatePattern.java.AbstractTemplate;

public abstract class Processor {
    public void processData(){
        loadData();
        transformData();
        saveData();
    }
    protected abstract void loadData();
    protected abstract void transformData();
    protected abstract void saveData();
}
