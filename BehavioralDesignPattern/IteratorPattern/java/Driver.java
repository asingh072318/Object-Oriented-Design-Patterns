package BehavioralDesignPattern.IteratorPattern.java;

import java.util.Arrays;
import java.util.List;

import BehavioralDesignPattern.IteratorPattern.java.AbstractIterator.Iterator;
import BehavioralDesignPattern.IteratorPattern.java.ConcreteCollection.Playlist;

public class Driver {
    public static void main(String[] args){
        
        List<String> songs = Arrays.asList("Song A", "Song B", "Song C", "Song D");
        Playlist playlist = new Playlist(songs);
        Iterator iterator = playlist.create_iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
