package StructuralDesignPattern.AdapterPattern.java.Adapter;

import StructuralDesignPattern.AdapterPattern.java.AbstractTarget.MediaPlayer;
import StructuralDesignPattern.AdapterPattern.java.Adaptee.AdvancedMediaPlayer;
import StructuralDesignPattern.AdapterPattern.java.Adaptee.Mp4mediaPlayer;
import StructuralDesignPattern.AdapterPattern.java.Adaptee.VlcMediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4"))
            this.mediaPlayer = new Mp4mediaPlayer();
        else if (audioType.equalsIgnoreCase("vlc"))
            this.mediaPlayer = new VlcMediaPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        // TODO Auto-generated method stub
        if (audioType.equalsIgnoreCase("vlc")) {
            mediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer.playMp4(fileName);
        }

    }
}
