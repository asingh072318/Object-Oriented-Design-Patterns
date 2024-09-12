class Director:

    def __init__(self, builder):
        self.builder = builder
    
    def construct_computer(self):
        self.builder.add_cpu()
        self.builder.add_gpu()
        self.builder.add_ram()
        self.builder.add_storage()