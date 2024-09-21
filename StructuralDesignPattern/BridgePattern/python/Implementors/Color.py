from abc import ABC, abstractmethod


class Color(ABC):
    
    @abstractmethod
    def applyColor(self):
        pass
