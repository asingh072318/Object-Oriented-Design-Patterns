package CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteFactory;

import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractFactory.GuiFactory;
import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Button;
import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Checkbox;
import CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteProducts.MacButton;
import CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteProducts.MacCheckbox;

public class MacGuiFactory implements GuiFactory{

    @Override
    public Button create_button() {
        // TODO Auto-generated method stub
        return new MacButton();
    }

    @Override
    public Checkbox create_checkbox() {
        // TODO Auto-generated method stub
        return new MacCheckbox();
    }
    
}
