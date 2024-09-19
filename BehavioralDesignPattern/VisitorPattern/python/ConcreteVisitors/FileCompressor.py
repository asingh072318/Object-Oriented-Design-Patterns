from AbstractVisitor.FileVisitor import FileVisitor


class FileCompressor(FileVisitor):
    
    def visit_text_file(self, file):
        print("Compressing text file: {}.{}".format(file.getName(), file.getType()))

    def visit_video_file(self, file):
        print("Compressing video file: {}.{}".format(file.getName(), file.getType()))
