package CreationalDesignPattern.BuilderPattern.java.ConcreteBuilders;

import CreationalDesignPattern.BuilderPattern.java.AbstractBuilders.ComputerBuilder;
import CreationalDesignPattern.BuilderPattern.java.Product.Computer;

public class OfficeComputerBuilder implements ComputerBuilder{

    private Computer computer = new Computer();

    @Override
    public void addCpu() {
        // TODO Auto-generated method stub
        computer.setCpu("i3-1700k");
    }

    @Override
    public void addGpu() {
        // TODO Auto-generated method stub
        computer.setGpu("No GPU");
    }

    @Override
    public void addStorage() {
        // TODO Auto-generated method stub
        computer.setStorage("512GB HDD");
    }

    @Override
    public void addRam() {
        // TODO Auto-generated method stub
        computer.setRam("8GB DDR3");
    }

    @Override
    public Computer getComputer() {
        // TODO Auto-generated method stub
        return this.computer;
    }
    
}
