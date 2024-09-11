package CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteFactory;

import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractFactory.GuiFactory;
import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Button;
import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Checkbox;
import CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteProducts.WindowsButton;
import CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteProducts.WindowsCheckbox;

public class WindowsGuiFactory implements GuiFactory{

    @Override
    public Button create_button() {
        // TODO Auto-generated method stub
        return new WindowsButton();
    }

    @Override
    public Checkbox create_checkbox() {
        // TODO Auto-generated method stub
        return new WindowsCheckbox();
    }
    
}
