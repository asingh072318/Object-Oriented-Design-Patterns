from Adaptee.AdvancedMediaPlayer import AdvancedMediaPlayer


class Mp4Player(AdvancedMediaPlayer):
    def playMp4(self, filename):
        print("Playing Mp4 file: {}".format(filename))

    def playVlc(self, filename):
        pass