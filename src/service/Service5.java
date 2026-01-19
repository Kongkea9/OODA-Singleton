package service;

import singleton.DatabaseConnection;

public class Service5 {

    private static DatabaseConnection db;
    public void connectedDB(){
        db = DatabaseConnection.getInstance();
        System.out.println(db);
    }

}
