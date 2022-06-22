package Modelo;

import DTO.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO implements ConsultasImplements {
    
    
    public void insertarCliente(Cliente c) throws SQLException{
        Connection con = null;
        CallableStatement cs = null ;
        
        try{
            con = Conexion.establecerConexion();
            cs = con.prepareCall(INSERTARCLIENTE_SP);
            cs.setString(1, c.getDNI());
            cs.setString(2, c.getNombre());
            cs.setString(3, c.getApellido());
            cs.setString(4, c.getTelefono());
            cs.setString(5, c.getCorreo());
            cs.setString(6, c.getDireccion());
            cs.setString(7, c.getProvincia());
            int row = cs.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
            }
        }catch(SQLException e){
        e.printStackTrace(System.out);
        JOptionPane.showMessageDialog(null, "No se pudo registrar");
        }finally{
            Conexion.close(cs);
            Conexion.close(con);
        }
    }
    
}
