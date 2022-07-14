package Modelo;

import DTO.ProductoAlmohadas;
import Modelo.Conexion;
import Modelo.ConsultasImplements;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class productoDAO implements ConsultasImplements {

    // método para obtener el ultimo codidio de la tabla producto
    public int idPro() throws SQLException {
        int cod = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = Conexion.establecerConexion();
            ps = con.prepareStatement("select ProductoID from Productos");
            rs = ps.executeQuery();
            while (rs.next()) {
                cod = rs.getInt("ProductoID");

            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "no se pudo insertar datos de productos");
        } finally {
            Conexion.close(ps);
            Conexion.close(con);
        }
        return cod;
    }
    //método para insertar registro
    public void insertarRegistro(ProductoAlmohadas pa) throws SQLException {
//        ArrayList listaPed = new ArrayList();

        Connection con = null;
        CallableStatement cs = null;

        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(INSERTARDATOSPRODUCTO_SP);
            cs.setInt(1, pa.getCod());
            cs.setString(2, pa.getNombreProducto());
            cs.setString(3, pa.getMedida());
            cs.setString(4, pa.getColor());
            cs.setDouble(5, pa.getPrecioUnitario());
            cs.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "no se pudo insertar datos de productos");
        } finally {
            Conexion.close(cs);
            Conexion.close(con);
        }
//        return listaPed;
    }
    //método para eliminar producto 1x1
    public void eliminarProducto(int cod) throws SQLException{
        Connection con = null;
        CallableStatement cs = null;
        try{
        con = Conexion.establecerConexion();
        cs = con.prepareCall(ELIMINARPRODUCTO_SP);
        cs.setInt(1, cod);
        int row = cs.executeUpdate();
            if (row>0) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
            }
            
        }
        catch(SQLException e){
            e.printStackTrace(System.out);
        }finally {
            Conexion.close(cs);
            Conexion.close(con);
        }
    }
}
