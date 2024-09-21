from abc import ABC, abstractmethod


class YoutubeService(ABC):
    @abstractmethod
    def getVideo(self,videoName):
        pass

    @abstractmethod
    def getPopularVideos(self):
        pass