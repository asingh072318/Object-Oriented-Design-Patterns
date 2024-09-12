from abc import ABC, abstractmethod


class Checkbox(ABC):
    @abstractmethod
    def render(self):
        pass
