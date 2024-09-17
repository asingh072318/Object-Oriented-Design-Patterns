from ConcreteTemplates.DbProcessor import DbProcessor
from ConcreteTemplates.LogProcessor import LogProcessor


if __name__ == "__main__":

    logProcessor = LogProcessor()
    dbProcessor = DbProcessor()

    logProcessor.process()
    dbProcessor.process()