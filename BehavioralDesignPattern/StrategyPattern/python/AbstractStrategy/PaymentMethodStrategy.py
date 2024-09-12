from abc import ABC,abstractmethod


class PaymentMethodStrategy(ABC):
    @abstractmethod
    def pay(self,amount):
        pass