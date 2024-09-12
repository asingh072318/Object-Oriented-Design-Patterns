package CreationalDesignPattern.BuilderPattern.java;

import CreationalDesignPattern.BuilderPattern.java.AbstractBuilders.ComputerBuilder;

public class Director {
    
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder){
        this.builder = builder;
    }

    public void constructComputer(){
        this.builder.addCpu();
        this.builder.addGpu();
        this.builder.addRam();
        this.builder.addStorage();
    }

}
