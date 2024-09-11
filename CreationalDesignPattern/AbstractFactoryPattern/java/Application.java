package CreationalDesignPattern.AbstractFactoryPattern.java;

import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractFactory.GuiFactory;
import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Button;
import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory){
        button = factory.create_button();
        checkbox = factory.create_checkbox();
    }

    public void render(){
        button.render();
        checkbox.render();
    }

}
