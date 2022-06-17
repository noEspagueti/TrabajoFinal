package Datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Conexion {

    public static String usuario = "miguel";
    public static String contraseña = "123abc";
    public static String bd = "SistemaVentasAM";
    public static String ip = "localhost";
    public static String puerto = "1433";

    public static String cadena = "jdbc:sqlserver://localhost:" + puerto + ";" + "databaseName=" + bd;
    //String cadena = "jdbc:sqlserver://"+ip +":"+puerto+"/"+bd;

    public static Connection establecerConexion() {
        Connection conectar = null;
        try {

            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
//            JOptionPane.showMessageDialog(null, "se conecto correctamente a la base de datos");
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        return conectar;
    }

    public static void close(Connection c) throws SQLException {
        c.close();
    }

    public static void close(PreparedStatement ps) throws SQLException {
        ps.close();
    }

     public static void close(CallableStatement cs) throws SQLException {
        cs.close();
    }
    
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
}
