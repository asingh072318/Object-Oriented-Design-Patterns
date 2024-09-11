package CreationalDesignPattern.Prototype.java;

public class Main {
    public static void main(String[] args){
        Shape circle = new Shape("Circle");
        System.out.println(circle.getShapeType());

        Shape newCircle = circle.clone();
        System.out.println(newCircle.getShapeType());

        newCircle.setShapeType("Modified Circle");
        System.out.println(newCircle.getShapeType());
    }
}
