package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager implements IDBManager{
    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bekzhan", "postgres", "23212321");
            return connection;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
