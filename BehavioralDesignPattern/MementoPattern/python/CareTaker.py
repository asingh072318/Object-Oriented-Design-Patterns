class CareTaker:
    def __init__(self):
        self.memstack = []
    
    def save(self, texteditor):
        self.memstack.append(texteditor.save())

    def undo(self, texteditor):
        if len(self.memstack) != 0:
            texteditor.restore(self.memstack.pop())
        else:
            print("No state to undo")