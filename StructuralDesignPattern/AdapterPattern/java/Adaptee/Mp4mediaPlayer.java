package StructuralDesignPattern.AdapterPattern.java.Adaptee;

public class Mp4mediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        // TODO Auto-generated method stub
    }

    @Override
    public void playMp4(String fileName) {
        // TODO Auto-generated method stub
        System.out.println("Playing mp4 file: "+fileName);
    }
    
}
