package BehavioralDesignPattern.VisitorPattern.java.ConcreteElements;

import BehavioralDesignPattern.VisitorPattern.java.AbstractElement.FileElement;
import BehavioralDesignPattern.VisitorPattern.java.AbstractVisitor.FileVisitor;

public class TextFile implements FileElement{

    private String name;
    private String fileFormat;

    public TextFile(String name){
        this.name = name;
        this.fileFormat = "txt";
    }

    public String getFileName(){
        return this.name;
    }

    public String getFileType(){
        return this.fileFormat;
    }

    @Override
    public void accept(FileVisitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
    }
    
}
