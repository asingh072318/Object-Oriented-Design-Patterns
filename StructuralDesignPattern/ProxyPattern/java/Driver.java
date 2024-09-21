package StructuralDesignPattern.ProxyPattern.java;

import java.util.List;

import StructuralDesignPattern.ProxyPattern.java.AbstractService.YoutubeService;
import StructuralDesignPattern.ProxyPattern.java.Model.Video;
import StructuralDesignPattern.ProxyPattern.java.Proxy.ProxyYoutubeService;

public class Driver {
    public static void main(String[] args){
        YoutubeService youtubeService = new ProxyYoutubeService();

        List<Video> popularVideos = youtubeService.getPopularVideos();
        for(Video video: popularVideos){
            System.out.println(video);
        }

        popularVideos = youtubeService.getPopularVideos();
        for(Video video: popularVideos){
            System.out.println(video);
        }

        Video video = youtubeService.getVideo("ABC");

        System.out.println(video);

        video = youtubeService.getVideo("ABC");

        System.out.println(video);
    }
}
