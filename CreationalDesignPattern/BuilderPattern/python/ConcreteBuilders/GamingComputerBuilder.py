from AbstractBuilders.ComputerBuilder import ComputerBuilder
from Products.Computer import Computer


class GamingComputerBuilder(ComputerBuilder):

    def __init__(self):
        self.computer = Computer()

    def add_cpu(self):
        self.computer.cpu = "i5-1700k"

    def add_ram(self):
        self.computer.ram = "32GB DDR5"

    def add_storage(self):
        self.computer.storage = "1TB SSD"

    def add_gpu(self):
        self.computer.gpu = "RTX 4060"

    def get_computer(self):
        return self.computer