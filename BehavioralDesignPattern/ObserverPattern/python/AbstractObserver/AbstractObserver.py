from abc import ABC, abstractmethod


class AbstractObserver(ABC):
    @abstractmethod
    def getUpdate(self):
        pass