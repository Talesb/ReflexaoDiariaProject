package br.com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection con;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
       
        if ( con == null ) {

            Class.forName("com.mysql.jdbc.Driver");  
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pensamentodiario","root","root");

            return con;
            
        } else {
            return con;
        }
    }
}