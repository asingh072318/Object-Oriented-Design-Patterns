from abc import ABC, abstractmethod


class Device(ABC):
    
    def turnOn(self):
        pass

    def turnOff(self):
        pass