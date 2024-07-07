package org.example.jdbcdemo;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{
        /*
        * import package //import java.sql.*;
        * load and register //Class.forName("org.postgresql.Driver");
        * create connection
        * create Statement
        * execute Statement
        * process the result
        * close connection
        * */
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Naveen@425";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection established");
    }
}
