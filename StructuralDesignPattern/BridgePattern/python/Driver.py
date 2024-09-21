from Implementors.RedColor import RedColor
from Abstractions.Square import Square
from Abstractions.Circle import Circle
from Implementors.BlueColor import BlueColor


if __name__ == "__main__":

    square = Square(RedColor())
    square.draw()

    circle = Circle(BlueColor())
    circle.draw()