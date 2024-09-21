package StructuralDesignPattern.ProxyPattern.java.AbstractService;

import StructuralDesignPattern.ProxyPattern.java.Model.Video;
import java.util.List;

public interface YoutubeService {
    Video getVideo(String videoId);
    List<Video> getPopularVideos();
}
