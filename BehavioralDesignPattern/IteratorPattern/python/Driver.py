from ConcreteCollection.Playlist import Playlist


if __name__ == "__main__":

    songs = ["Song 1", "Song 2"]
    playlist = Playlist(songs)

    iterator = playlist.create_iterator()

    while(iterator.hasNext()):
        print(iterator.getNext())
    