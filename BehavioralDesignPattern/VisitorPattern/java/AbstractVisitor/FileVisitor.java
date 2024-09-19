package BehavioralDesignPattern.VisitorPattern.java.AbstractVisitor;

import BehavioralDesignPattern.VisitorPattern.java.ConcreteElements.TextFile;
import BehavioralDesignPattern.VisitorPattern.java.ConcreteElements.VideoFile;

public interface FileVisitor {
    void visit(TextFile file);
    void visit(VideoFile file);
}
