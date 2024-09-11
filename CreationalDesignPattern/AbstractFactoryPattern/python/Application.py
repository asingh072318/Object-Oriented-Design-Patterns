class Application:

    def __init__(self,factory):
        self.button = factory.create_button()
        self.checkbox = factory.create_checkbox()
    
    def render(self):
        self.button.render()
        self.checkbox.render()