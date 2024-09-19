from AbstractVisitor.FileVisitor import FileVisitor


class FileOpener(FileVisitor):
    
    def visit_text_file(self, file):
        print("Opening text file: {}.{}".format(file.getName(), file.getType()))

    def visit_video_file(self, file):
        print("Opening video file: {}.{}".format(file.getName(), file.getType()))
