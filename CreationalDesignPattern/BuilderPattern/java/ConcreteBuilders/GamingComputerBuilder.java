package CreationalDesignPattern.BuilderPattern.java.ConcreteBuilders;

import CreationalDesignPattern.BuilderPattern.java.AbstractBuilders.ComputerBuilder;
import CreationalDesignPattern.BuilderPattern.java.Product.Computer;

public class GamingComputerBuilder implements ComputerBuilder{

    private Computer computer = new Computer();

    @Override
    public void addCpu() {
        // TODO Auto-generated method stub
        computer.setCpu("i5-1700k");
    }

    @Override
    public void addGpu() {
        // TODO Auto-generated method stub
        computer.setGpu("rtx 4060");
    }

    @Override
    public void addStorage() {
        // TODO Auto-generated method stub
        computer.setStorage("1TB ssd");
    }

    @Override
    public void addRam() {
        // TODO Auto-generated method stub
        computer.setRam("32GB DDR5");
    }

    @Override
    public Computer getComputer() {
        // TODO Auto-generated method stub
        return this.computer;
    }
    
}
