from AbstractIterator.Iterator import Iterator


class PlaylistIterator(Iterator):
    
    def __init__(self,songs):
        self.songs = songs
        self.currentIndex = 0
    
    def hasNext(self):
        return self.currentIndex!=len(self.songs)
    
    def getNext(self):
        nextSong = None
        if(self.hasNext()):
            nextSong = self.songs[self.currentIndex]
            self.currentIndex = self.currentIndex+1
        return nextSong