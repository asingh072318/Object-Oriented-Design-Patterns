from Memento import Memento


class TextEditor:
    def __init__(self):
        self.__content = None

    def setContent(self,content):
        self.__content = content

    def getContent(self):
        return self.__content
    
    def save(self):
        return Memento(self.__content)
    
    def restore(self, memento):
        self.__content = memento.getState()