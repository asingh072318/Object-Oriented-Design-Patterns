from AbstractElement.FileElement import FileElement


class VideoFile(FileElement):
    def __init__(self, name):
        self.__name = name
        self.__type = "mp4"

    def getName(self):
        return self.__name
    
    def getType(self):
        return self.__type
    
    def accept(self,visitor):
        visitor.visit_video_file(self)

    