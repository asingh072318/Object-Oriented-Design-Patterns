package BehavioralDesignPattern.VisitorPattern.java.AbstractElement;

import BehavioralDesignPattern.VisitorPattern.java.AbstractVisitor.FileVisitor;

public interface FileElement {
    void accept(FileVisitor visitor);
}
