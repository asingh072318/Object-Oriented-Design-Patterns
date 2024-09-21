package StructuralDesignPattern.ProxyPattern.java.Proxy;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import StructuralDesignPattern.ProxyPattern.java.AbstractService.YoutubeService;
import StructuralDesignPattern.ProxyPattern.java.ConcreteService.ThirdYoutubeService;
import StructuralDesignPattern.ProxyPattern.java.Model.Video;

public class ProxyYoutubeService implements YoutubeService{
    private ThirdYoutubeService thirdYoutubeService;
    private Map<String, Video> videoCache;
    private List<Video> popularVideosCache;

    public ProxyYoutubeService(){
        this.thirdYoutubeService = new ThirdYoutubeService();
        this.videoCache = new HashMap<>();
    }

    @Override
    public Video getVideo(String videoId) {
        // TODO Auto-generated method stub
        if(this.videoCache.containsKey(videoId)){
            System.out.println("Returning Cached Video");
            return this.videoCache.get(videoId);
        }
        System.out.println("Caching video");
        Video video = this.thirdYoutubeService.getVideo(videoId);
        this.videoCache.put(videoId, video);
        return video;
    }

    @Override
    public List<Video> getPopularVideos() {
        // TODO Auto-generated method stub
        if(this.popularVideosCache == null){
            System.out.println("Caching popular Videos");
            this.popularVideosCache = this.thirdYoutubeService.getPopularVideos();
            return this.popularVideosCache;
        }
        System.out.println("Returning cached popular videos");
        return this.popularVideosCache;
    }

    // Method to clear cache
    public void clearCache() {
        videoCache.clear();
        popularVideosCache = null;
    }
    
}
