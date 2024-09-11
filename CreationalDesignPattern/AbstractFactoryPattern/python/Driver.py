from Application import Application
from ConcreteFactory.MacGuiFactory import MacGuiFactory
from ConcreteFactory.WindowsGuiFactory import WindowsGuiFactory


os = "windows"
factory = WindowsGuiFactory() if os == "windows" else MacGuiFactory()
app = Application(factory)
app.render()