package StructuralDesignPattern.AdapterPattern.java.ConcreteTarget;

import StructuralDesignPattern.AdapterPattern.java.AbstractTarget.MediaPlayer;
import StructuralDesignPattern.AdapterPattern.java.Adapter.MediaAdapter;

public class Mp3Player implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Built-in support for MP3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        }
        // Use adapter for VLC and MP4 files
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
    
}
