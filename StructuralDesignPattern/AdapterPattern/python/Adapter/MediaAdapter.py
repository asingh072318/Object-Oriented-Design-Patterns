from Adaptee.Mp4Player import Mp4Player
from Adaptee.VlcPlayer import VlcPlayer
from AbstractTarget.MediaPlayer import MediaPlayer


class MediaAdapter(MediaPlayer):

    def __init__(self, mediaType):
        self.mediaPlayer = Mp4Player() if mediaType == "mp4" else VlcPlayer()  

    def play(self, mediaType, fileName):
        if mediaType == "mp4":
            self.mediaPlayer.playMp4(fileName)
        elif mediaType == "vlc":
            self.mediaPlayer.playVlc(fileName)
        else:
            print("No suitable player available")