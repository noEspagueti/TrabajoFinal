package Datos;

import DTO.Cliente;
import DTO.Factura;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class FacturaDAO implements ConsultasImplements {

    public int cont = 1;

    //INSERTAR DATOS A FACTURAS
    public void insert(Factura f, Cliente c) throws SQLException {

        Connection con = null;
        
        CallableStatement cs = null;
        try {
            con = Conexion.establecerConexion();
            cs = con.prepareCall(INSERTARFACTURA_SP);
            cs.setInt(1, f.getCodigoVenta());
            cs.setString(2, f.getTipoDocu());
            cs.setString(3, f.getOrdenRemision());
            cs.setString(4, c.getRazonSocial());
            cs.setString(5, c.getRUC());
            cs.setString(6, f.getFechaEmision());
            int row = cs.executeUpdate();

            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "No se pudo registrar");
        } finally {
            Conexion.close(con);
            Conexion.close(cs);
        }

    }

}
