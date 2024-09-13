class TvRemote():

    def __init__(self):
        self.command = None
    
    def setCommand(self,command):
        self.command = command
    
    def execute(self):
        self.command.execute()