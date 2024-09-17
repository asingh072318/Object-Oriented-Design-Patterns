from AbstractTemplate.Processor import Processor


class DbProcessor(Processor):
    def loadData(self):
        print("Loading Db Data")

    def transformData(self):
        print("Transforming Db Data")

    def saveData(self):
        print("Saving Db Data")
