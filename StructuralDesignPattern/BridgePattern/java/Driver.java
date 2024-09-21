package StructuralDesignPattern.BridgePattern.java;

import StructuralDesignPattern.BridgePattern.java.Abstractions.Circle;
import StructuralDesignPattern.BridgePattern.java.Abstractions.Square;
import StructuralDesignPattern.BridgePattern.java.Implementors.BlueColor;
import StructuralDesignPattern.BridgePattern.java.Implementors.RedColor;

public class Driver {
    public static void main(String[] args){
        Square redsquare = new Square(new RedColor());
        redsquare.draw();

        Circle bluecircle = new Circle(new BlueColor());
        bluecircle.draw();
    }
}
