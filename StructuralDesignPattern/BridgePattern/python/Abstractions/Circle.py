from Abstractions.Shape import Shape


class Circle(Shape):

    def draw(self):
        print("Drawing circle with color: ")
        self.color.applyColor()