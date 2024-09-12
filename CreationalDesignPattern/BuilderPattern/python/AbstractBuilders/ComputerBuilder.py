from abc import ABC, abstractmethod

class ComputerBuilder(ABC):

    @abstractmethod
    def add_cpu():
        pass

    @abstractmethod
    def add_ram():
        pass

    @abstractmethod
    def add_gpu():
        pass

    @abstractmethod
    def add_storage():
        pass