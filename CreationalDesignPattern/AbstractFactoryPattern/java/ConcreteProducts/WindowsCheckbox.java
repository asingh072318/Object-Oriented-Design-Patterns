package CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteProducts;

import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Checkbox;

public class WindowsCheckbox implements Checkbox{

    @Override
    public void render() {
        // TODO Auto-generated method stub
        System.out.println("Rendering Windows Checkbox");
    }
    
}
