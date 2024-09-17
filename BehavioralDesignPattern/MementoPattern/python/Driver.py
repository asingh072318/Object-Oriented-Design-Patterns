from TextEditor import TextEditor
from CareTaker import CareTaker

if __name__ == "__main__":
    TextEditor = TextEditor()
    CareTaker = CareTaker()

    TextEditor.setContent("Hello from 1st content")
    CareTaker.save(TextEditor)
    print("Content after first save: {}".format(TextEditor.getContent()))

    TextEditor.setContent("Hello from 2nd content")
    print("Content after second text change: {}".format(TextEditor.getContent()))

    CareTaker.undo(TextEditor)
    print("Content after first undo: {}".format(TextEditor.getContent()))

    CareTaker.undo(TextEditor)
    print("Content after second undo: {}".format(TextEditor.getContent()))