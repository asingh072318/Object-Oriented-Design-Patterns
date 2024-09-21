import time
from AbstractService.YoutubeService import YoutubeService
from Model.Video import Video


class ThirdPartyYoutubeService(YoutubeService):
    
    def getVideo(self, videoName):
        print("Fetching video from youtube")
        self.simulateNetworkLatency()
        return Video(videoName)
    
    def getPopularVideos(self):
        print("Fetching popular videos from youtube")
        self.simulateNetworkLatency()
        return [Video("v1"), Video("v2")]
    
    def simulateNetworkLatency(self):
        time.sleep(3)