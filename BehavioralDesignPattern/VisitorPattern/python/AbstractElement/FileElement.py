from abc import ABC, abstractmethod


class FileElement(ABC):
    @abstractmethod
    def accept(self, visitor):
        pass