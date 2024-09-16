from AbstractCollection.Collection import Collection
from ConcreteIterator.PlaylistIterator import PlaylistIterator


class Playlist(Collection):
    
    def __init__(self, songs):
        self.songs = songs

    def create_iterator(self):
        return PlaylistIterator(self.songs)