package StructuralDesignPattern.BridgePattern.java.Abstractions;

import StructuralDesignPattern.BridgePattern.java.Implementors.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Drawing square with ");
        color.applyColor();
    }
    
}
