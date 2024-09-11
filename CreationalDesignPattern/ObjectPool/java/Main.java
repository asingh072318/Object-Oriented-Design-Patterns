package CreationalDesignPattern.ObjectPool.java;

public class Main {
    public static void main(String[] args){
        ThreadPool threadPool = new ThreadPool(2);
        // Get Thread 1
        String t1 = threadPool.getThread();
        System.out.println("Got thread "+t1);

        // Get Thread 2
        String t2 = threadPool.getThread();
        System.out.println("Got thread "+t2);

        // Get Thread 3 - should throw error
        String t3 = threadPool.getThread();
        System.out.println(t3);

        // releasing thread 2
        threadPool.releaseThread(t2);

        // should get thread 2
        t3 = threadPool.getThread();
        System.out.println(t3);
    }
}
