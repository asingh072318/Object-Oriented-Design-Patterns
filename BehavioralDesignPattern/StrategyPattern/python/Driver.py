from Context import Context
from ConcreteStrategy.CreditCardStrategy import CreditCardStrategy
from ConcreteStrategy.DebitCardStrategy import DebitCardStrategy
from ConcreteStrategy.PaypalStrategy import PaypalStrategy

strategy = CreditCardStrategy()
context = Context(strategy)
context.pay(100)

strategy = DebitCardStrategy()
context = Context(strategy)
context.pay(200)

strategy = PaypalStrategy()
context = Context(strategy)
context.pay(100)