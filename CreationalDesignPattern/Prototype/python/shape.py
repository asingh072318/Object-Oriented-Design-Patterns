import copy
class Shape():
    def __init__(self, shape):
        self.shape = shape
    
    def copy(self):
        return copy.deepcopy(self)


circle = Shape("circle")
print(circle.shape)

copy_circle = circle.copy()
print(copy_circle.shape)

print(circle == copy_circle)

copy_circle.shape = "Copied circle"
print(copy_circle.shape)