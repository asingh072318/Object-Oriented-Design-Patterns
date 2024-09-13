from AbstractCommands.Command import Command


class TurnOnCommand(Command):
    
    def __init__(self,device):
        self.device = device

    def execute(self):
        self.device.turnOn()