from AbstractContext.AbstractContext import AbstractContext
from ConcreteStates.GreenState import GreenState


class TrafficLight(AbstractContext):
    def __init__(self):
        self.__currentState = GreenState(self)
    
    def change(self):
        self.__currentState.change()

    def setNextState(self, nextState):
        self.__currentState = nextState