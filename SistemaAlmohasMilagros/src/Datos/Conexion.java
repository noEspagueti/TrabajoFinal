package Datos;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private static String URL_JDBC = "jdbc:sqlserver://localhost:1433;" + "database=SistemaVentasAM;";
    private static String USER_JDBC = "Miguel";
    private static String PASSWORD_JDBC = "";

    public static Connection conectar() throws SQLException {
         
        return (Connection) DriverManager.getConnection(URL_JDBC, USER_JDBC, PASSWORD_JDBC);
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement ps) {
        try {
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
