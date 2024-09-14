package BehavioralDesignPattern.IteratorPattern.java.AbstractCollection;

import BehavioralDesignPattern.IteratorPattern.java.AbstractIterator.Iterator;

public interface Collection {
    Iterator create_iterator();
}
