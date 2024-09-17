from AbstractTemplate.Processor import Processor


class LogProcessor(Processor):
    
    def loadData(self):
        print("Loading Log Data")

    def transformData(self):
        print("Transforming Log Data")

    def saveData(self):
        print("Saving Log Data")