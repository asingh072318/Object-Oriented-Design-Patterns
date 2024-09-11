package CreationalDesignPattern.AbstractFactoryPattern.java.ConcreteProducts;

import CreationalDesignPattern.AbstractFactoryPattern.java.AbstractProducts.Button;

public class WindowsButton implements Button {

    @Override
    public void render() {
        // TODO Auto-generated method stub
        System.out.println("Rendering Windows Button");
    }
    
}
