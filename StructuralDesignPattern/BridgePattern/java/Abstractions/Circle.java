package StructuralDesignPattern.BridgePattern.java.Abstractions;

import StructuralDesignPattern.BridgePattern.java.Implementors.Color;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Drawing circle with color: ");
        color.applyColor();
    }
    
}
