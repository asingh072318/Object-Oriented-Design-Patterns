from abc import ABC, abstractmethod


class FileVisitor(ABC):
    @abstractmethod
    def visit_text_file(self,file):
        pass

    @abstractmethod
    def visit_video_file(self,file):
        pass