package CreationalDesignPattern.AbstractFactoryPattern.java;

import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractFactory.GuiFactory;
import CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteFactory.MacGuiFactory;
import CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteFactory.WindowsGuiFactory;

public class Driver {
    public static void main(String[] args){
        GuiFactory factory;
        String os = "windows";

        if(os.equals("windows")){
            factory = new WindowsGuiFactory();
        }
        else{
            factory = new MacGuiFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}
