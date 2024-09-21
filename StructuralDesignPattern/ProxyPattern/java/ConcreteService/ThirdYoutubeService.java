package StructuralDesignPattern.ProxyPattern.java.ConcreteService;

import java.util.List;
import java.util.ArrayList;

import StructuralDesignPattern.ProxyPattern.java.AbstractService.YoutubeService;
import StructuralDesignPattern.ProxyPattern.java.Model.Video;

public class ThirdYoutubeService implements YoutubeService{

    @Override
    public Video getVideo(String videoName) {
        // TODO Auto-generated method stub
        System.out.println("Fetching Video from Youtube");
        this.simulateNetworkLatency();
        return new Video(videoName);
    }

    @Override
    public List<Video> getPopularVideos() {
        // TODO Auto-generated method stub
        System.out.println("Fetching Popular Videos from Youtube");
        this.simulateNetworkLatency();
        List<Video> popularVideos = new ArrayList<>();
        popularVideos.add(new Video("Video 1"));
        popularVideos.add(new Video("Video 2"));
        popularVideos.add(new Video("Video 3"));
        return popularVideos;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(3000);  // Simulate a 3-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
