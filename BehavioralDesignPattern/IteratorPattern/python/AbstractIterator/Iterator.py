from abc import ABC, abstractmethod


class Iterator(ABC):
    @abstractmethod
    def hasNext(self):
        pass
    
    @abstractmethod
    def getNext(self):
        pass