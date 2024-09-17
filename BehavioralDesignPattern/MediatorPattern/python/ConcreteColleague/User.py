from AbstractColleague.Colleague import Colleague


class User(Colleague):
    def __init__(self, name, mediator):
        self.name = name
        self.mediator = mediator

    def sendMessage(self, message):
        self.mediator.send(message, self)

    def receive(self,message):
        print("{} Received Message: {}".format(self.name, message))