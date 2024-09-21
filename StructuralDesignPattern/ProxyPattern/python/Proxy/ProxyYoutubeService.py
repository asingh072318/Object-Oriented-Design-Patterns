from AbstractService.YoutubeService import YoutubeService
from ConcreteService.ThirdPartyYoutubeService import ThirdPartyYoutubeService


class ProxyYoutubeService(YoutubeService):
    
    def __init__(self):
        self._youtubeService = ThirdPartyYoutubeService()
        self._videoCache = {}
        self._popularVideosCache = None

    def getVideo(self, videoName):
        if videoName not in self._videoCache:
            print("Caching Video {}".format(videoName))
            self._videoCache[videoName] = self._youtubeService.getVideo(videoName)
        else:
            print("Returning cached Video: {}".format(videoName))
        return self._videoCache[videoName]
    
    def getPopularVideos(self):
        if self._popularVideosCache is None:
            print("Caching popular videos")
            self._popularVideosCache = self._youtubeService.getPopularVideos()
        else:
            print("Returning cached popular videos")
        return self._popularVideosCache
    
    def clear_cache(self):
        self._video_cache.clear()
        self._popular_videos_cache = None
            