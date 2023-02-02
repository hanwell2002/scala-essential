package singletons;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Hanwell
 */
public class SingletonConnection {
    private static SingletonConnection instance;
    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String username = "postgres";
    private String password = "Admin@777";

    private SingletonConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.err.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static SingletonConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new SingletonConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new SingletonConnection();
        }

        return instance;
    }

/*    public static void main(String[] args){
        try {
            Connection getConnection = SingletonConnection.getInstance().getConnection();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }*/
}