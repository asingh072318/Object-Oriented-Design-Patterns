from abc import ABC, abstractmethod

class ComputerBuilder(ABC):

    @abstractmethod
    def add_cpu(self):
        pass

    @abstractmethod
    def add_ram(self):
        pass

    @abstractmethod
    def add_gpu(self):
        pass

    @abstractmethod
    def add_storage(self):
        pass