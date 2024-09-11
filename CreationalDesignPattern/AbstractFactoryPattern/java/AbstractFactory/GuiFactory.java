package CreationalDesignPattern.AbstractFactoryPattern.java.AbstractFactory;

import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Button;
import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Checkbox;

public interface GuiFactory {
    Button create_button();
    Checkbox create_checkbox();
}
