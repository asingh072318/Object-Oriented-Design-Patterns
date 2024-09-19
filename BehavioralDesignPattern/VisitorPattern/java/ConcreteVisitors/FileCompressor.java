package BehavioralDesignPattern.VisitorPattern.java.ConcreteVisitors;

import BehavioralDesignPattern.VisitorPattern.java.AbstractVisitor.FileVisitor;
import BehavioralDesignPattern.VisitorPattern.java.ConcreteElements.TextFile;
import BehavioralDesignPattern.VisitorPattern.java.ConcreteElements.VideoFile;

public class FileCompressor implements FileVisitor{

    @Override
    public void visit(TextFile file) {
        // TODO Auto-generated method stub
        System.out.println("Compressing text file: "+file.getFileName() + "." +file.getFileType());
    }

    @Override
    public void visit(VideoFile file) {
        // TODO Auto-generated method stub
        System.out.println("Compressing video file: "+file.getFileName() + "." +file.getFileType());
    }
    
}
