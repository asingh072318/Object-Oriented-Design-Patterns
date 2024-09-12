from ConcreteHandler.DebugLogger import DebugLogger
from ConcreteHandler.ErrorLogger import ErrorLogger
from ConcreteHandler.InfoLogger import InfoLogger


class LoggerChain:
    @staticmethod
    def getLoggerChain():
        infoLogger = InfoLogger()
        debugLogger = DebugLogger()
        errorLogger = ErrorLogger()

        infoLogger.setNextLogger(debugLogger)
        debugLogger.setNextLogger(errorLogger)
        return infoLogger