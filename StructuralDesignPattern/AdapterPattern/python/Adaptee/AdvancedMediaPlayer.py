from abc import ABC, abstractmethod


class AdvancedMediaPlayer(ABC):
    @abstractmethod
    def playMp4(self, filename):
        pass

    @abstractmethod
    def playVlc(self,filename):
        pass