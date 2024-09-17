from abc import ABC, abstractmethod

class Mediator(ABC):
    @abstractmethod
    def add(self,user):
        pass

    @abstractmethod
    def send(self,message,user):
        pass