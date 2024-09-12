from AbstractStrategy.PaymentMethodStrategy import PaymentMethodStrategy


class PaypalStrategy(PaymentMethodStrategy):
    def pay(self,amount):
        print("paying {} using Paypal".format(amount))