from abc import ABC, abstractmethod


class Collection(ABC):
    
    @abstractmethod
    def create_iterator(self):
        pass