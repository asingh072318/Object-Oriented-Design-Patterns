from AbstractReceivers.Device import Device


class Tv(Device):
    def turnOn(self):
        print("Turning Tv On")

    def turnOff(self):
        print("Turning Tv Off")