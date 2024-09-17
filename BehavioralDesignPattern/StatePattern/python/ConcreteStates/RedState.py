from AbstractState.AbstractState import AbstractState


class RedState(AbstractState):
    
    def __init__(self, context):
        self.context = context
    def change(self):
        print("Red Light - Stop!")
        # Lazy import to avoid circular dependency
        from ConcreteStates.YellowState import YellowState
        self.context.setNextState(YellowState(self.context))