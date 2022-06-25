package Controlador;

import DTO.Cliente;
import DTO.Factura;
import Modelo.Conexion;
import Modelo.ConsultasImplements;
import java.sql.*;

public class ordenCRUD implements ConsultasImplements {

    int cod = 0;
    
    public int codEmpleado() throws SQLException {
        int codEm = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select EmpleadoID from Empleado");
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getInt(1) == 1) {
                    codEm = rs.getInt(1);
                    break;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
        Conexion.close(rs);
        Conexion.close(ps);
        Conexion.close(con);
        }

        return codEm;
    }

    
    public int obtenerCodOrdern () throws SQLException{
     int codEm = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select OrdenID from Ordenes");
            rs = ps.executeQuery();

            while (rs.next()) {
                    codEm = rs.getInt(1);
                }
        
            codEm++;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
        Conexion.close(rs);
        Conexion.close(ps);
        Conexion.close(con);
        }

        return codEm;
    
    }
    public void insertarOrden(Factura f, Cliente c) throws SQLException {
        Connection con = null;
        CallableStatement cs = null;
        cod = obtenerCodOrdern();
        setCod(cod);
        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(INSERTARORDENES_SP);
            cs.setInt(1, cod);
            cs.setString(2, c.getDNI());
            cs.setInt(3, codEmpleado());
            cs.setString(4, f.getCodigoVenta());

            cs.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(cs);
            Conexion.close(con);
        }
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
}
