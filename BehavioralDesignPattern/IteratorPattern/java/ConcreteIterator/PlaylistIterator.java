package BehavioralDesignPattern.IteratorPattern.java.ConcreteIterator;

import java.util.List;

import BehavioralDesignPattern.IteratorPattern.java.AbstractIterator.Iterator;

public class PlaylistIterator implements Iterator{

    private List<String> songs;
    private int currentIndex;

    public PlaylistIterator(List<String> songs){
        this.songs = songs;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return currentIndex<this.songs.size();
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        if(hasNext()){
            return this.songs.get(this.currentIndex++);
        }
        return null;
    }
    
    
}
