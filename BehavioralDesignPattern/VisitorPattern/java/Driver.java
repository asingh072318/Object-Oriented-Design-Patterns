package BehavioralDesignPattern.VisitorPattern.java;

import java.util.ArrayList;

import BehavioralDesignPattern.VisitorPattern.java.AbstractElement.FileElement;
import BehavioralDesignPattern.VisitorPattern.java.ConcreteElements.TextFile;
import BehavioralDesignPattern.VisitorPattern.java.ConcreteElements.VideoFile;
import BehavioralDesignPattern.VisitorPattern.java.ConcreteVisitors.FileCompressor;
import BehavioralDesignPattern.VisitorPattern.java.ConcreteVisitors.FileOpener;
import BehavioralDesignPattern.VisitorPattern.java.AbstractVisitor.FileVisitor;

public class Driver {
    public static void main(String[] args){
        ArrayList<FileElement> files = new ArrayList<>();
        
        TextFile file1 = new TextFile("TextFile1");
        TextFile file2 = new TextFile("TextFile2");

        VideoFile file3 = new VideoFile("VideoFile1");
        VideoFile file4 = new VideoFile("VideoFile2");

        files.add(file1);
        files.add(file2);
        files.add(file3);
        files.add(file4);

        FileVisitor opener = new FileOpener();

        for(FileElement file: files){
            file.accept(opener);
        }

        FileVisitor compressor = new FileCompressor();

        for(FileElement file: files){
            file.accept(compressor);
        }
    }
}
