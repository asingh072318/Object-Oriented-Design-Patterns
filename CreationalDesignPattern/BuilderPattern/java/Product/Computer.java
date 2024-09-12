package CreationalDesignPattern.BuilderPattern.java.Product;

public class Computer {
    private String cpu;
    private String ram;
    private String gpu;
    private String storage;

    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public String getCpu(){
        return this.cpu;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    public String getRam(){
        return this.ram;
    }

    public void setGpu(String gpu){
        this.gpu = gpu;
    }

    public String getGpu(){
        return this.gpu;
    }

    public void setStorage(String storage){
        this.storage = storage;
    }

    public String getStorage(){
        return this.storage;
    }

    public void printComputer(){
        System.out.println("CPU: "+this.cpu + " GPU: "+ this.gpu + " Ram: "+this.ram + " Storage: "+ this.storage);
    }
}
