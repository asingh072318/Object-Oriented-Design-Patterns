from AbstractFactory.GuiFactory import GuiFactory
from ConcreteProducts.MacButton import MacButton
from ConcreteProducts.MacCheckbox import MacCheckbox


class MacGuiFactory(GuiFactory):

    def create_button(self):
        return MacButton()
    
    def create_checkbox(self):
        return MacCheckbox()