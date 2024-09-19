from ConcreteVisitors.FileCompressor import FileCompressor
from ConcreteVisitors.FileOpener import FileOpener
from ConcreteElements.VideoFile import VideoFile
from ConcreteElements.TextFile import TextFile


if __name__ == "__main__":
    file1 = TextFile("TextFile1")
    file2 = TextFile("TextFile2")

    file3 = VideoFile("VideoFile1")
    file4 = VideoFile("VideoFile2")

    files = [file1, file2, file3, file4]
    opener = FileOpener()
    compressor = FileCompressor()

    for file in files:
        file.accept(opener)

    for file in files:
        file.accept(compressor)
