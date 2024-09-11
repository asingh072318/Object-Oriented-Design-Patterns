package java;
import java.util.ArrayList;

public class DBConnectionPool{
    private static DBConnectionPool instance = null;

    private ArrayList<String> connections;
    
    private DBConnectionPool(){
        connections = new ArrayList<>();
    }

    public static DBConnectionPool getInstance(){
        if(instance == null){
            synchronized(DBConnectionPool.class){
                if(instance == null){
                    instance = new DBConnectionPool();
                }
            }
        }
        return instance;
    }

    public String getConnection(){
        String connection = "Connection-" + (connections.size() + 1);
        connections.add(connection);
        return connection;
    }

    public ArrayList<String> getConnections(){
        return connections;
    }


    public static void main(String[] args){
        DBConnectionPool pool1 = DBConnectionPool.getInstance();
        System.out.println(pool1.getConnection());
        System.out.println(pool1.getConnections());
        DBConnectionPool pool2 = DBConnectionPool.getInstance();
        System.out.println(pool2.getConnection());
        System.out.println(pool2.getConnections());

        System.out.println(pool1 == pool2);
    }
}