from AbstractMediator.Mediator import Mediator


class Chatgroup(Mediator):
    def __init__(self,name):
        self.name = name
        self.users = []

    def add(self,user):
        if user not in self.users:
            self.users.append(user)

    def send(self,message,user):
        for u in self.users:
            if user != u:
                u.receive(message)