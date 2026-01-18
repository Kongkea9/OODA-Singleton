package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.UUID;

public class DatabaseConnection {

private static DatabaseConnection instance;

private Connection connection;



private DatabaseConnection() {


    try {
        String url = "jdbc:postgresql://localhost:5432/a01_a1";
        String user = "postgres";
        String password = "kea1213";

        connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection.getSchema());
    }catch (SQLException e){
        e.printStackTrace();
    }
}

public static DatabaseConnection getInstance() {
    if(instance == null){
        instance = new DatabaseConnection();
    }
    return instance;
}

public Connection getConnection(){
    return connection;
}


}
