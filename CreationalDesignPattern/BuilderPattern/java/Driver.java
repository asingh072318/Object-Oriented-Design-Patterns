package CreationalDesignPattern.BuilderPattern.java;

import CreationalDesignPattern.BuilderPattern.java.AbstractBuilders.ComputerBuilder;
import CreationalDesignPattern.BuilderPattern.java.ConcreteBuilders.GamingComputerBuilder;
import CreationalDesignPattern.BuilderPattern.java.ConcreteBuilders.OfficeComputerBuilder;
import CreationalDesignPattern.BuilderPattern.java.Product.Computer;

public class Driver {
    public static void main(String[] args){
        ComputerBuilder builder = new GamingComputerBuilder();
        Director computerDirector = new Director(builder);
        computerDirector.constructComputer();
        Computer gamingComputer = builder.getComputer();
        gamingComputer.printComputer();

        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        Director officeComputerDirector = new Director(officeComputerBuilder);
        officeComputerDirector.constructComputer();
        Computer officeComputer = officeComputerBuilder.getComputer();
        officeComputer.printComputer();
    }
}
