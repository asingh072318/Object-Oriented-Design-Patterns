package StructuralDesignPattern.BridgePattern.java.Abstractions;

import StructuralDesignPattern.BridgePattern.java.Implementors.Color;

abstract class Shape {
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    abstract void draw();
}
