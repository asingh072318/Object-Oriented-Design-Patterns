from abc import ABC, abstractmethod


class MediaPlayer(ABC):
    @abstractmethod
    def play(self, mediaType, fileName):
        pass