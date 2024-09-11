
from AbstractFactory.GuiFactory import GuiFactory
from ConcreteProducts.WindowsButton import WindowsButton
from ConcreteProducts.WindowsCheckbox import WindowsCheckbox


class WindowsGuiFactory(GuiFactory):

    def create_button(self):
        return WindowsButton()
    
    def create_checkbox(self):
        return WindowsCheckbox()