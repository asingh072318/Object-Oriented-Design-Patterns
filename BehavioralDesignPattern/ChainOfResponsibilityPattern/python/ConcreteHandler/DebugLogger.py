from AbstractHandler.Logger import Logger

class DebugLogger(Logger):
    
    def __init__(self):
        self.nextLogger = None

    def setNextLogger(self,logger):
        self.nextLogger = logger

    def log(self,level,message):
        if level<=Logger.DEBUG:
            print("DEBUG: {}".format(message))
        else:
            if self.nextLogger != None:
                self.nextLogger.log(level,message)