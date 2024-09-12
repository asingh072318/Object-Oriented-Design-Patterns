package CreationalDesignPattern.BuilderPattern.java.AbstractBuilders;

import CreationalDesignPattern.BuilderPattern.java.Product.Computer;

public interface ComputerBuilder {
    void addCpu();
    void addGpu();
    void addStorage();
    void addRam();
    Computer getComputer();
}
