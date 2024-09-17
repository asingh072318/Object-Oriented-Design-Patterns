from AbstractSubject.AbstractSubject import AbstractSubject


class NewsArticle(AbstractSubject):

    def __init__(self):
        self.subscribers = []
        self.articleName = ""

    def attach(self,observer):
        if observer not in self.subscribers:
            self.subscribers.append(observer)

    def detach(self,observer):
        if observer in self.subscribers:
            self.subscribers.remove(observer)

    def publishArticle(self,articleName):
        self.articleName = articleName
        self.notifyAll()

    def notifyAll(self):
        for subs in self.subscribers:
            subs.getUpdate(self.articleName)