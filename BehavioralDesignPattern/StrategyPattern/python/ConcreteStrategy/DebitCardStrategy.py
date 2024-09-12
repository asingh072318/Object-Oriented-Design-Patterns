from AbstractStrategy.PaymentMethodStrategy import PaymentMethodStrategy


class DebitCardStrategy(PaymentMethodStrategy):
    def pay(self,amount):
        print("paying {} using debit card".format(amount))