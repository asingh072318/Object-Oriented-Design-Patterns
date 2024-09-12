from AbstractHandler.Logger import Logger


class ErrorLogger(Logger):
    
    def __init__(self):
        self.nextLogger = None

    def setNextLogger(self,logger):
        self.nextLogger = logger

    def log(self,level,message):
        if level<=Logger.ERROR:
            print("ERROR: {}".format(message))
        else:
            if self.nextLogger != None:
                self.nextLogger.log(level,message)