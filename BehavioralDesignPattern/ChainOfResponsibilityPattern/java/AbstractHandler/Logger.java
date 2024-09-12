package BehavioralDesignPattern.ChainOfResponsibilityPattern.java.AbstractHandler;

public interface Logger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    void setNextHandler(Logger logger);
    void log(int level, String message);
}
