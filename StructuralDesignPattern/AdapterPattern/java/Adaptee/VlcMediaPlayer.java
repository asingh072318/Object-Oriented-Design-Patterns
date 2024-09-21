package StructuralDesignPattern.AdapterPattern.java.Adaptee;

public class VlcMediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        // TODO Auto-generated method stub
        System.out.println("Playing vlc media: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // TODO Auto-generated method stub
    }
    
}
