from AbstractElement.FileElement import FileElement


class TextFile(FileElement):
    def __init__(self, name):
        self.__name = name
        self.__type = "txt"

    def getName(self):
        return self.__name
    
    def getType(self):
        return self.__type
    
    def accept(self,visitor):
        visitor.visit_text_file(self)

    