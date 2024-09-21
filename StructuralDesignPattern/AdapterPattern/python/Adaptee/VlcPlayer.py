from Adaptee.AdvancedMediaPlayer import AdvancedMediaPlayer


class VlcPlayer(AdvancedMediaPlayer):
    def playVlc(self, filename):
        print("Playing vlc file: {}".format(filename))

    def playMp4(self, filename):
        pass