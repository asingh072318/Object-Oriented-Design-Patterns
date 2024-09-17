from AbstractObserver.AbstractObserver import AbstractObserver


class Observer(AbstractObserver):
    def __init__(self, name):
        self.__name = name

    def getUpdate(self, articleName):
        print("{} received update: Article published {}".format(self.__name, articleName))