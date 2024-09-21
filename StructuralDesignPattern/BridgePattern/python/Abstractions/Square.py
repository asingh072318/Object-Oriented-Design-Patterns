from Abstractions.Shape import Shape


class Square(Shape):
    def draw(self):
        print("Drawing Square with color: ")
        self.color.applyColor()