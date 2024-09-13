from AbstractCommands.Command import Command


class TurnOffCommand(Command):
    
    def __init__(self,device):
        self.device = device

    def execute(self):
        self.device.turnOff()