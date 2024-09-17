from abc import ABC, abstractmethod


class AbstractState(ABC):
    def change(self):
        pass