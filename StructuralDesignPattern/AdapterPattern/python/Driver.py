from ConcreteTarget.Mp3Player import Mp3Player


if __name__ == "__main__":

    mp3Player = Mp3Player()
    mp3Player.play("mp3", "mp3file")
    mp3Player.play("mp4", "mp4file")
    mp3Player.play("vlc", "vlcfile")
    mp3Player.play("avi", "avifile")