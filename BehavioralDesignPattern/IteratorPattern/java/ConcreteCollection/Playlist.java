package BehavioralDesignPattern.IteratorPattern.java.ConcreteCollection;

import java.util.List;

import BehavioralDesignPattern.IteratorPattern.java.AbstractCollection.Collection;
import BehavioralDesignPattern.IteratorPattern.java.AbstractIterator.Iterator;
import BehavioralDesignPattern.IteratorPattern.java.ConcreteIterator.PlaylistIterator;

public class Playlist implements Collection{

    private List<String> songs;
    
    public Playlist(List<String> songs){
        this.songs = songs;
    }

    @Override
    public Iterator create_iterator() {
        // TODO Auto-generated method stub
        return new PlaylistIterator(this.songs);
    }
    
}
