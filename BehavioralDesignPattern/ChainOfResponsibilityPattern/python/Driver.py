from AbstractHandler.Logger import Logger
from LoggerChain import LoggerChain


if __name__ == "__main__":
    logger = LoggerChain.getLoggerChain()

    logger.log(Logger.INFO, "This is an INFO message")
    logger.log(Logger.DEBUG, "This is an DEBUG message")
    logger.log(Logger.ERROR, "This is an ERROR message")