from abc import ABC, abstractmethod

class Logger(ABC):
    INFO = 1
    DEBUG = 2
    ERROR = 3
    
    @abstractmethod
    def setNextLogger(self,logger):
        pass

    @abstractmethod
    def log(self,level,message):
        pass