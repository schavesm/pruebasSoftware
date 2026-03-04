package co.edu.ucompensar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static final String URL = "jdbc:mysql//172.22.40.252:3306/registro_usuarios";
    public static final String USERNAME = "usuario_app";
    public static final String PASSWORD = "123456";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }

}
