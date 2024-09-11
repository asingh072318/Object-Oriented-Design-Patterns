from abc import ABC, abstractmethod

class Notification(ABC):
    @abstractmethod
    def send_notification(self):
        pass