class Computer:
    def __init__(self):
        self.cpu = None
        self.gpu = None
        self.ram = None
        self.storage = None

    def __str__(self):
        return f"Computer [CPU={self.cpu}, RAM={self.ram}, Storage={self.storage}, Graphics Card={self.gpu}]"