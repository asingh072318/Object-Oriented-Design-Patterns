class ThreadPool:
    def __init__(self, size):
        self.inUseThreads = []
        self.freeThreads = ["Thread-{}".format(i+1) for i in range(size)]
    
    def getThread(self):
        if len(self.freeThreads) != 0:
            threadToReturn = self.freeThreads[0]
            self.freeThreads.remove(threadToReturn)
            self.inUseThreads.append(threadToReturn)
            return threadToReturn
        return "No Free Threads"
    
    def releaseThread(self, threadToRelease):
        if threadToRelease in self.inUseThreads:
            self.inUseThreads.remove(threadToRelease)
            self.freeThreads.append(threadToRelease)


tpool = ThreadPool(2)
t1 = tpool.getThread()
print(t1)
t2 = tpool.getThread()
print(t2)
t3 = tpool.getThread()
print(t3)
tpool.releaseThread(t2)
t3 = tpool.getThread()
print(t3)
