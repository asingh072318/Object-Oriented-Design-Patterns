from AbstractState.AbstractState import AbstractState


class YellowState(AbstractState):
    
    def __init__(self, context):
        self.context = context
    def change(self):
        print("Yellow Light - Ready!")
        # Lazy import to avoid circular dependency
        from ConcreteStates.GreenState import GreenState
        self.context.setNextState(GreenState(self.context))