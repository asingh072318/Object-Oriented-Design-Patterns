package CreationalDesignPattern.Prototype.java;

import CreationalDesignPattern.Prototype.java.interfaces.CloneableShape;

public class Shape implements CloneableShape {
    
    private String shapeType;

    public Shape(String shapeType){
        this.shapeType = shapeType;
    }

    public String getShapeType() {
        return this.shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public Shape clone(){
        return new Shape(this.shapeType);
    }
}
