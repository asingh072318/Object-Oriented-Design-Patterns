package StructuralDesignPattern.AdapterPattern.java;

import StructuralDesignPattern.AdapterPattern.java.AbstractTarget.MediaPlayer;
import StructuralDesignPattern.AdapterPattern.java.ConcreteTarget.Mp3Player;

public class Driver {
    public static void main(String[] args){
        MediaPlayer audioPlayer = new Mp3Player();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "video.vlc");
        audioPlayer.play("avi", "random.avi");
    }
}
