from abc import ABC, abstractmethod

class Colleague(ABC):
    @abstractmethod
    def sendMessage(self,message):
        pass

    @abstractmethod
    def receive(self,message):
        pass