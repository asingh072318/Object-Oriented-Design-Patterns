from abc import ABC, abstractmethod


class AbstractContext(ABC):
    @abstractmethod
    def change(self):
        pass