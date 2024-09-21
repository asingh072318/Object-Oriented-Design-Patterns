package StructuralDesignPattern.ProxyPattern.java.Model;

public class Video {
    private static int count = 0;
    private int videoId;
    private String videoName;
    private String videoFormat;

    public Video(String videoName){
        this.videoId = count++;
        this.videoName = videoName;
        this.videoFormat = "mp4";
    }

    public int getId(){
        return this.videoId;
    }
    
    public String getVideoName(){
        return this.videoName;
    }

    public String toString(){
        return ("Video: "+ this.videoName + "." + this.videoFormat);
    }
}
