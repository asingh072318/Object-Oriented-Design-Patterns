from AbstractBuilders.ComputerBuilder import ComputerBuilder
from Products.Computer import Computer


class OfficeComputerBuilder(ComputerBuilder):

    def __init__(self):
        self.computer = Computer()

    def add_cpu(self):
        self.computer.cpu = "i3"

    def add_ram(self):
        self.computer.ram = "8GB DDR5"

    def add_storage(self):
        self.computer.storage = "512GB HDD"

    def add_gpu(self):
        return

    def get_computer(self):
        return self.computer