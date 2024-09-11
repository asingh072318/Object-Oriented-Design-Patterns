from abc import ABC, abstractmethod


class GuiFactory(ABC):
    @abstractmethod
    def create_button():
        pass
    
    @abstractmethod
    def create_checkbox():
        pass