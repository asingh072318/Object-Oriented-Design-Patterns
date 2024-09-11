class DBConnectionPool():
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(DBConnectionPool,cls).__new__(cls)
            cls._instance.connections = []
        return cls._instance
    
    def get_connection(self):
        connection = f"Connection-{len(self.connections) + 1}"
        self.connections.append(connection)
        return self.connections




pool1 = DBConnectionPool()
pool2 = DBConnectionPool()

print(pool1 == pool2)

print(pool1.get_connection())
print(pool2.get_connection())