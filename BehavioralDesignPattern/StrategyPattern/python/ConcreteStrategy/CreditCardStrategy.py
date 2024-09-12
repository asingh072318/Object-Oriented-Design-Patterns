from AbstractStrategy.PaymentMethodStrategy import PaymentMethodStrategy


class CreditCardStrategy(PaymentMethodStrategy):
    def pay(self,amount):
        print("paying {} using credit card".format(amount))