class Context:
    def __init__(self,strategy):
        self.paymentStrategy = strategy

    def pay(self,amount):
        self.paymentStrategy.pay(amount)