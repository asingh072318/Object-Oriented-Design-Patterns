package CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteProducts;

import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Checkbox;

public class MacCheckbox implements Checkbox{

    @Override
    public void render() {
        // TODO Auto-generated method stub
        System.out.println("Rendering Mac Checkbox");
    }
    
}
