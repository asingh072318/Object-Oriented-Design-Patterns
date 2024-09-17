from abc import ABC, abstractmethod


class Processor(ABC):
    def process(self):
        self.loadData()
        self.transformData()
        self.saveData()

    @abstractmethod
    def loadData(self):
        pass
    
    @abstractmethod
    def transformData(self):
        pass

    @abstractmethod
    def saveData(self):
        pass