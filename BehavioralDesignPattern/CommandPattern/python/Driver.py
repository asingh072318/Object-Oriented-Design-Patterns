from Invokers.TvRemote import TvRemote
from ConcreteCommands.TurnOnCommand import TurnOnCommand
from ConcreteCommands.TurnOffCommand import TurnOffCommand
from ConcreteReceivers.Tv import Tv


if __name__ == "__main__":
    tv = Tv()

    turnOnCommand = TurnOnCommand(tv)
    turnOffCommand = TurnOffCommand(tv)

    tvRemote = TvRemote()

    tvRemote.setCommand(turnOnCommand)
    tvRemote.execute()

    tvRemote.setCommand(turnOffCommand)
    tvRemote.execute()