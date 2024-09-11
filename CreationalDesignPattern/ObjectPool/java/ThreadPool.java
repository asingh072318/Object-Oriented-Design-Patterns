package CreationalDesignPattern.ObjectPool.java;

import java.util.ArrayList;

public class ThreadPool {
    private ArrayList<String> freeThreads;
    private ArrayList<String> inUseThreads;

    public ThreadPool(int size){
        this.freeThreads = new ArrayList<>(size);
        this.inUseThreads = new ArrayList<>(size);
        for(int i=0;i<size;i++){
            this.freeThreads.add("Thread-"+(i+1));
        }
    }

    public String getThread(){
        if(this.freeThreads.size() != 0){
            String threadToSend = this.freeThreads.get(0);
            this.inUseThreads.add(threadToSend);
            this.freeThreads.remove(threadToSend);
            return threadToSend;
        }
        return "No Free Threads";
    }

    public void releaseThread(String threadToRelease){
        if(this.inUseThreads.contains(threadToRelease)){
            this.inUseThreads.remove(threadToRelease);
            this.freeThreads.add(threadToRelease);
        }
    }
}
