class Memento:
    def __init__(self, state):
        self.__state = state

    def getState(self):
        return self.__state