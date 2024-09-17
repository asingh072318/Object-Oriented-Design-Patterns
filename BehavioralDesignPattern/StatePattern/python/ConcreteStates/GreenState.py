from AbstractState.AbstractState import AbstractState


class GreenState(AbstractState):
    
    def __init__(self, context):
        self.context = context
    def change(self):
        print("Green Light - Go!")
        # Lazy import to avoid circular dependency
        from ConcreteStates.RedState import RedState
        self.context.setNextState(RedState(self.context))