from AbstractTarget.MediaPlayer import MediaPlayer
from Adapter.MediaAdapter import MediaAdapter


class Mp3Player(MediaPlayer):

    def __init__(self):
        self._mediaAdapter = None

    def play(self,mediaType,fileName):
        if mediaType == "mp3":
            print("Playing mp3 file {}".format(fileName))
        elif mediaType == "mp4":
            self._mediaAdapter = MediaAdapter("mp4")
            self._mediaAdapter.play(mediaType, fileName)
        elif mediaType  == "vlc":
            self._mediaAdapter = MediaAdapter("vlc")
            self._mediaAdapter.play(mediaType, fileName)
        else:
            print("Not supported")