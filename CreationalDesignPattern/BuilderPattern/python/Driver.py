from ConcreteBuilders.GamingComputerBuilder import GamingComputerBuilder
from ConcreteBuilders.OfficeComputerBuilder import OfficeComputerBuilder
from Director import Director


builder = GamingComputerBuilder()
computerDirector = Director(builder)
computerDirector.construct_computer()
computer = builder.get_computer()
print(computer)

builder = OfficeComputerBuilder()
director = Director(builder)
director.construct_computer()
print(builder.get_computer())